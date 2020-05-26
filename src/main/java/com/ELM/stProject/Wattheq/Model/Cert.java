package com.ELM.stProject.Wattheq.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Certs")
@Table
public class Cert {

    @Id
    @Column(name = "CertID")
    private int certID;
    @Column(name = "CertName")
    private String certName;
    @Column(name = "CertType")
    private String certType;
    @Column(name = "CertDescription")
    private String certDescription;
    @Column(name = "CertDate")
    private String certDate;
    @Column(name = "CertStatus")
    private String certStatus;
    @Lob
    @Column(name = "CertDocument")
    private byte[] certDocument;




    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "UserID")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OrganizationID")
    private Orga cOrga;


    @ManyToMany(cascade = {CascadeType.ALL})

    @JoinTable(
            name = "certificates_shareds",

            joinColumns = {@JoinColumn(name = "CertID")},

            inverseJoinColumns = {@JoinColumn(name = "sharedID")}
    )






    private Set<Shared> shareds = new HashSet<Shared>();



    public Cert(int certID, String certName, String certType, String certDescription, String certDate, String certStatus, byte[] certDocument) {
        this.certID = certID;
        this.certName = certName;
        this.certType = certType;
        this.certDescription = certDescription;
        this.certDate = certDate;
        this.certStatus = certStatus;
        this.certDocument = certDocument;
    }

    public int getCertID() {
        return certID;
    }

    public void setCertID(int certID) {
        this.certID = certID;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertDescription() {
        return certDescription;
    }

    public void setCertDescription(String certDescription) {
        this.certDescription = certDescription;
    }

    public String getCertDate() {
        return certDate;
    }

    public void setCertDate(String certDate) {
        this.certDate = certDate;
    }

    public String getCertStatus() {
        return certStatus;
    }

    public void setCertStatus(String certStatus) {
        this.certStatus = certStatus;
    }

    public byte[] getCertDocument() {
        return certDocument;
    }

    public void setCertDocument(byte[] certDocument) {
        this.certDocument = certDocument;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Orga getcOrga() {
        return cOrga;
    }

    public void setcOrga(Orga cOrga) {
        this.cOrga = cOrga;
    }

    public Set<Shared> getShareds() {
        return shareds;
    }

    public void setShareds(Set<Shared> shareds) {
        this.shareds = shareds;
    }
}
