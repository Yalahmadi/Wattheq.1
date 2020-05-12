package com.ELM.stProject.Wattheq.Service;

import com.ELM.stProject.Wattheq.Model.Orga;

import java.util.List;


public interface OrgaService {

    public Orga addOrga(Orga orga);
    public List<Orga> getAllOrgas();
    public Orga getOrga(int orgaID);
    public Orga updateOrga(Orga orga, int orgaID);
    public void deleteOrga(int orgaID);
    public void deleteAllOrgas();
}
