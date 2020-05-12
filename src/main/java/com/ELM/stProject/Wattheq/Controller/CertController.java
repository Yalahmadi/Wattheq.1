package com.ELM.stProject.Wattheq.Controller;

import com.ELM.stProject.Wattheq.Model.Cert;
import com.ELM.stProject.Wattheq.Service.CertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/Certs")
public class   CertController {

    @Autowired
    private CertService certService;

    @PostMapping(value = "/AddCert")
    public Cert addCert(@RequestBody Cert cert) {
        return certService.addCert(cert);
    }

    @GetMapping(value = "/GetAllCerts")
    public List<Cert> getAllCerts() {
        return certService.getAllCerts();
    }

    @GetMapping(value = "/GetCert/{certID}")
    public Cert getCert(@PathVariable("certID") int certID) {
        return certService.getCert(certID);
    }

    @PutMapping(value = "/UpdateCert/{certID}")
    public Cert updateCert(@RequestBody Cert cert, @PathVariable("certID") int certID) {
        return certService.updateCert(cert, certID);
    }

    @DeleteMapping(value = "/DeleteCert/{certID}")
    public void deleteCert(@PathVariable("certID") int certID) {
        certService.deleteCert(certID);
    }

    @DeleteMapping(value = "/DeleteAllCerts")
    public void deleteAllCerts() {
        certService.deleteAllCerts();
    }
}
