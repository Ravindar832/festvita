
package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
private static DBConnection instance;
private Connection connection;
private static final String URL = "jdbc:sqlite:festivista.db"; // using SQLite by default


private DBConnection() throws SQLException {
try {
connection = DriverManager.getConnection(URL);
} catch (SQLException ex) {
throw ex;
}
}


public static DBConnection getInstance() {
if (instance == null) {
try {
instance = new DBConnection();
} catch (SQLException e) {
e.printStackTrace();
throw new RuntimeException("Unable to connect to DB");
}
}
return instance;
}


public Connection getConnection() { return connection; }
}