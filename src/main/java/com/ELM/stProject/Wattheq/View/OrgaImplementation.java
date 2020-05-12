package com.ELM.stProject.Wattheq.View;


import com.ELM.stProject.Wattheq.Model.Orga;
import com.ELM.stProject.Wattheq.Repo.OrgaRepo;
import com.ELM.stProject.Wattheq.Service.OrgaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrgaImplementation implements OrgaService {

    @Autowired
    private OrgaRepo repo;

    @Override
    public Orga addOrga(Orga orga) {
        return repo.save(orga);
    }

    @Override
    public List<Orga> getAllOrgas() {
        return repo.findAll();
    }

    @Override
    public Orga getOrga(int orgaID) {
        return repo.findById(orgaID).get();
    }

    @Override
    public Orga updateOrga(Orga orga, int orgaID) {
        orga.setOrganizationID(orgaID);
        return repo.save(orga);
    }

    @Override
    public void deleteOrga(int orgaID) {
        repo.deleteById(orgaID);
    }

    @Override
    public void deleteAllOrgas() {
        repo.deleteAll();
    }
}
