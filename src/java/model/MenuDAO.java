package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author benja_000
 */
public class MenuDAO {

    private DBAccessor db;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/restaurant";
    private static final String ADMIN = "root";
    private static final String PASSWORD = "admin";

    public MenuDAO() {
    }

    public MenuDAO(DBAccessor db) {
        this.db = db;
    }

    private void openLocalDbConnection() throws DataAccessException {
        try {
            // Each time you perform a new query you must re-open the connection
            db.openConnection(DRIVER, URL, ADMIN, PASSWORD);
        } catch (IllegalArgumentException ex) {
            throw new DataAccessException(ex.getMessage(), ex);
        } catch (ClassNotFoundException ex) {
            throw new DataAccessException(ex.getMessage(), ex);
        } catch (SQLException ex) {
            throw new DataAccessException(ex.getMessage(), ex);
        }
    }

    public List<MenuItem> getMenuChoices() throws RuntimeException {
        List<MenuItem> items = new ArrayList<MenuItem>();

        try {
            // Make sure you always open a connection before trying to
            // send commands to the database.            
            db.openConnection(DRIVER, URL, ADMIN, PASSWORD);

            String sql = "Select * from menu order by menu_id";
            List<Map> rawData = db.findRecords(sql, true);
            for (Map record : rawData) {
                MenuItem item = new MenuItem();
                int id = Integer.valueOf(record.get("menu_id").toString());
                item.setMenuId(id);
                String name = String.valueOf(record.get("menu_item"));
                item.setMenuItem(name);
                Double price = Double.valueOf(record.get("menu_item_price").toString());
                item.setItemPrice(price);
                int cat = Integer.valueOf(record.get("category_id").toString());
                item.setCategory(cat);
                String value = String.valueOf(record.get("menu_value").toString());
                item.setMenuValue(value);
                items.add(item);
            }

            return items;

        } catch (IllegalArgumentException ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

    public static void main(String[] args) {
        MenuDAO menu = new MenuDAO();

    }
}
