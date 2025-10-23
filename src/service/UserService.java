
package service;


import database.DBConnection;
import model.User;


import java.sql.*;


public class UserService {
// Example: register user
public boolean register(User user, String plainPassword) throws SQLException {
// Hash password (placeholder) - integrate jBCrypt in real project
String hashed = Integer.toHexString(plainPassword.hashCode());
Connection conn = DBConnection.getInstance().getConnection();
String sql = "INSERT INTO users (name,email,password) VALUES (?,?,?)";
try (PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
ps.setString(1, user.getName());
ps.setString(2, user.getEmail());
ps.setString(3, hashed);
int affected = ps.executeUpdate();
return affected == 1;
}
}
}


