package com.ELM.stProject.Wattheq.DTO;

public class UserDTO {

    private String fullName;

    private String phoneNumber;
    private String email;

    public UserDTO() {
    }
    public UserDTO(String fullName, String phoneNumber, String email) {
        this.fullName = fullName;

        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}