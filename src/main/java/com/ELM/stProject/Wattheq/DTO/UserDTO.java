package com.ELM.stProject.Wattheq.DTO;

public class UserDTO {
    private int userID;
    private String fullName;
    private String phoneNumber;
    private String email;
    private String dob;

    public UserDTO() {
    }

    public UserDTO(String fullName, String phoneNumber, String email, int userID, String dob) {
        this.fullName = fullName;
        this.userID = userID;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dob = dob;

    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
