package com.waka.dto;

public class UserDTO {
    private Long id;
    private String name;
    private String username;
    private String contactNumber;
    private String password;

    public UserDTO() {
    }

    public UserDTO(Long id, String name, String username, String contactNumber, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.contactNumber = contactNumber;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
