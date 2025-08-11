package org.example;

public class User {
    private String password;

    public User(String password) {
        setPassword(password);
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Error: Password must be at least 8 characters long.");
        }
    }

    public String getPassword() {
        if (password == null) return "";
        return "*".repeat(password.length());
    }
}
