package com.ELM.stProject.Wattheq.View;


import com.ELM.stProject.Wattheq.Model.Cert;
import com.ELM.stProject.Wattheq.Repo.CertRepo;
import com.ELM.stProject.Wattheq.Service.CertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CertImplementation implements CertService {

    @Autowired
    private CertRepo repo;

    @Override
    public Cert addCert(Cert cert) {
        return repo.save(cert);
    }

    @Override
    public List<Cert> getAllCerts() {
        return repo.findAll();
    }

    @Override
    public Cert getCert(int certID) {
        return repo.findById(certID).get();
    }

    @Override
    public Cert updateCert(Cert cert, int certID) {
        cert.setCertID(certID);
        return repo.save(cert);
    }

    @Override
    public void deleteCert(int certID) {
        repo.deleteById(certID);
    }

    @Override
    public void deleteAllCerts() {
        repo.deleteAll();
    }
}
