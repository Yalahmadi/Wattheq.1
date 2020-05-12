package com.ELM.stProject.Wattheq.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Organizations")
@Table
public class Orga {

    @Id
    @Column(name = "OrganizationID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orgaID;
    @Column(name = "OrganizationName")
    private String orgaName;
    @Column(name = "OrganizationAddress")
    private String orgaAddress;
    @Column(name = "OrganizationContactNumber")
    private String orgaContactNumber;


    @OneToMany(mappedBy = "cOrga" , cascade = CascadeType.ALL , targetEntity = Cert.class)
    private List<Cert> certs = new ArrayList<>();

    public Orga() {}

    public Orga(int orgaID, String orgaName, String orgaAddress, String orgaContactNumber) {
        this.orgaID = orgaID;
        this.orgaName = orgaName;
        this.orgaAddress = orgaAddress;
        this.orgaContactNumber = orgaContactNumber;
    }

    public int getOrganizationID() {
        return orgaID;
    }

    public void setOrganizationID(int orgaID) {
        this.orgaID = orgaID;
    }

    public String getOrganizationName() {
        return orgaName;
    }

    public void setOrganizationName(String orgaName) {
        this.orgaName = orgaName;
    }

    public String getOrganizationAddress() {
        return orgaAddress;
    }

    public void setOrganizationAddress(String orgaAddress) {
        this.orgaAddress = orgaAddress;
    }

    public String getOrganizationContactNumber() {
        return orgaContactNumber;
    }


    public String getOrgaName() {
        return orgaName;
    }

    public void setOrgaName(String orgaName) {
        this.orgaName = orgaName;
    }

    public String getOrgaContactNumber() {
        return orgaContactNumber;
    }

    public void setOrgaContactNumber(String orgaContactNumber) {
        this.orgaContactNumber = orgaContactNumber;
    }

    public List<Cert> getCerts() {
        return certs;
    }

    public void setCerts(List<Cert> certs) {
        this.certs = certs;
    }
}
