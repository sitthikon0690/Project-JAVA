/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author WTFTHE
 */
public class Person {
    private String displayName;
    private String userName;
    private String password;

    public Person(String displayName, String userName, String password) {
        this.displayName = displayName;
        this.userName = userName;
        this.password = password;
    }

    public Person(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    
    

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    
    
}
