package model;

import java.sql.*;

public class SimpleDBMySql {

    private Connection conn;
    private String driverClassName;
    private String url;
    private String userName;
    private String password;

    public static void main(String[] args) {

        SimpleDBMySql db = new SimpleDBMySql();
        db.driverClassName = "com.mysql.jdbc.Driver";
        db.url = "jdbc:mysql://localhost:3306/restaurant";
        db.userName = "root";
        db.password = "admin";

        try {
            Class.forName(db.driverClassName);
            db.conn = DriverManager.getConnection(db.url, db.userName, db.password);
        } catch (ClassNotFoundException cnfex) {
            System.err.println(
                    "Error: Failed to load JDBC driver!");
            cnfex.printStackTrace();
            System.exit(1);
        } catch (SQLException sqlex) {
            System.err.println("Error: Unable to connect to database!");
            sqlex.printStackTrace();
            System.exit(1);
        }

        Statement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM menu";

        try {
            stmt = db.conn.createStatement();
            rs = stmt.executeQuery(sql);

            System.out.println("============================");
            System.out.println("Output from MySQL Server...");
            System.out.println("============================");

            int count = 0;
            while (rs.next()) {
                System.out.println("\nRecord No: " + (count + 1));
                System.out.println("ID: " + rs.getInt("menu_id")); // named field
                System.out.println("Menu Item: " + rs.getString("menu_item")); // named field
                System.out.println("Item Price: " + rs.getDouble("menu_item_price"));
                System.out.println("Category: " + rs.getInt("category_id"));
                System.out.println("Menu Value: " + rs.getString("menu_value"));
                count++;
            }
            System.out.println("==================\n" + count + " records found.");

        } catch (SQLException sqle) {
            System.out.println(sqle);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                stmt.close();
                db.conn.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
