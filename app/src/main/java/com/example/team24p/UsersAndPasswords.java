package com.example.team24p;


// class for userAndPassword table
public class UsersAndPasswords {
    private String userName;
    private String password;
    private String enabled;
//ctors
    public UsersAndPasswords(String userName, String password, String enabled) {
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
    }
    public UsersAndPasswords(){
        this.userName = "";
        this.password ="";
        this.enabled = "";
    }

    //setters and getters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }
}
