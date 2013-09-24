package model;

import java.sql.SQLException;

/**
 *
 * @author benja_000
 */
public class MenuDAO {

    private DBAccessor db;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String LOCATION = "jdbc:mysql://localhost:3306/restaurant";
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
            db.openConnection(DRIVER, LOCATION, ADMIN, PASSWORD);
        } catch (IllegalArgumentException ex) {
            throw new DataAccessException(ex.getMessage(), ex);
        } catch (ClassNotFoundException ex) {
            throw new DataAccessException(ex.getMessage(), ex);
        } catch (SQLException ex) {
            throw new DataAccessException(ex.getMessage(), ex);
        }
    }
}
