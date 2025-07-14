//package com.pay.Spyder.entity;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "admin")
//public class Admin {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String username;
//    private char password;
//    private  String role;
//
//    public Admin() {
//    }
//
//    public Admin(Long id, String username, char password, String role) {
//        this.id = id;
//        this.username = username;
//        this.password = password;
//        this.role = role;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public char getPassword() {
//        return password;
//    }
//
//    public void setPassword(char password) {
//        this.password = password;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//}
