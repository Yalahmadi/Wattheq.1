package com.ELM.stProject.Wattheq.Service;

import com.ELM.stProject.Wattheq.Model.Cert;

import java.util.List;


public interface CertService {

    public Cert addCert(Cert cert);
    public List<Cert> getAllCerts();
    public Cert getCert(int certID);
    public Cert updateCert(Cert cert, int certID);
    public void deleteCert(int certID);
    public void deleteAllCerts();
}
