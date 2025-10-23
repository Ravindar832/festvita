package model;

public class Admin extends User {
public Admin() { super(); }
public Admin(int userId, String name, String email, String passwordHash) {
super(userId, name, email, passwordHash);
}


// Admin-specific methods can be added here (overrides, etc.)
}