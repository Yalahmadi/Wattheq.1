package com.ELM.stProject.Wattheq.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Shared")
@Table
public class Shared {

    @Id
    @Column(name = "SharedID")
    private int sharedID;
    @Column(name = "CertificateID")
    private int certificateID;
    @Column(name = "SharedDate")
    private String sharedDate;
    @Column(name = "SharedUrl")
    private String sharedUrl;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserID")
    private User userShareds;

    @ManyToMany(mappedBy = "shareds" , cascade = {CascadeType.ALL} , targetEntity = Cert.class)
    private Set<Cert> certs = new HashSet<Cert>();


    public Shared() {}

    public Shared(int sharedID, int certificateID, String sharedDate, String sharedUrl ) {
        this.sharedID = sharedID;
        this.certificateID = certificateID;
        this.sharedDate = sharedDate;
        this.sharedUrl = sharedUrl;
    }

    public int getSharedID() {
        return sharedID;
    }

    public void setSharedID(int sharedID) {
        this.sharedID = sharedID;
    }

    public int getCertificateID() {
        return certificateID;
    }

    public void setCertificateID(int certificateID) {
        this.certificateID = certificateID;
    }

    public String getSharedDate() {
        return sharedDate;
    }

    public void setSharedDate(String sharedDate) {
        this.sharedDate = sharedDate;
    }

    public String getSharedUrl() {
        return sharedUrl;
    }

    public void setSharedUrl(String sharedUrl) {
        this.sharedUrl = sharedUrl;
    }

    public User getUserId() {
        return userShareds;
    }

    public void setUserId(User userId) {
        this.userShareds = userId;
    }

    public Set<Cert> getCerts() {
        return certs;
    }

    public void setCerts(Set<Cert> certs) {
        this.certs = certs;
    }
}
