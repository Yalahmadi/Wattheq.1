package com.ELM.stProject.Wattheq.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UserID")
    private int userID;



    @Column(name = "FullName")
//    @NotNull(message = "First name , Last name is required")
//    //@Size(min = 3, max = 20)
    private String fullName;



    @Column(name = "DateOfBirth")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String dob;


    @Column(name = "PhoneNumber")
    private int phoneNumber;



    @Column(name = "Email")
//    @Email(message = "Enter a valid email address.")
//    @Pattern(regexp=".+@.+\\.[a-z]+")
//    @NotNull(message = "Email is required")
    private String email;


//    @GeneratedValue(strategy =GenerationType.AUTO )
    @Column(name = "password")
    private String password;


    @NotNull
    @Column(name = "NationalID")
    private int nationalID;


    @Column(name = "enabled")
    private boolean enable=true;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }



    public boolean isEnable() {

        return enable;
    }


    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AuthName")
    private Auth auth;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OrgID")
    private Orga userOrga;


    @OneToMany(mappedBy = "userShareds", cascade = CascadeType.ALL)
    private List<Shared> shareds = new ArrayList<>();



    public User() {}

    public User(int userID, String fullName, String dob, int phoneNumber, String email, String password, int nationalID , boolean enable) {
        this.userID = userID;
        this.fullName = fullName;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.nationalID = nationalID;
       this.enable = enable;
    }

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public List<Shared> getShareds() {
        return shareds;
    }

    public void setShareds(List<Shared> shareds) {
        this.shareds = shareds;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public int getNationalID() {
        return nationalID;
    }

    public void setNationalID(int nationalID) {
        this.nationalID = nationalID;
    }


    public User(Orga userOrga) {
        this.userOrga = userOrga;
    }
    public Orga getUserOrga() {
        return userOrga;
    }

    public void setUserOrga(Orga userOrga) {
        this.userOrga = userOrga;
    }


}
