package com.ELM.stProject.Wattheq.DTO;

public class OrganizationDTO {

    private String orgaName;
    private String orgaAddress;
    private String orgaContactNumber;


    public OrganizationDTO(String orgaName, String orgaAddress, String orgaContactNumber) {
        this.orgaName = orgaName;
        this.orgaAddress = orgaAddress;
        this.orgaContactNumber = orgaContactNumber;
    }

    public String getOrgaName() {
        return orgaName;
    }

    public void setOrgaName(String orgaName) {
        this.orgaName = orgaName;
    }

    public String getOrgaAddress() {
        return orgaAddress;
    }

    public void setOrgaAddress(String orgaAddress) {
        this.orgaAddress = orgaAddress;
    }

    public String getOrgaContactNumber() {
        return orgaContactNumber;
    }

    public void setOrgaContactNumber(String orgaContactNumber) {
        this.orgaContactNumber = orgaContactNumber;
    }
}
