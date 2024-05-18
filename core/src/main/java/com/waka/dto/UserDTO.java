package com.waka.dto;

public class UserDTO {
    private Long id;
    private String name;
    private String username;
    private String mobileNumber;
    private String password;

    public UserDTO() {
    }

    public UserDTO(Long id, String name, String username, String mobileNumber, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.mobileNumber = mobileNumber;
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String contactNumber) {
        this.mobileNumber = contactNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
