package com.ELM.stProject.Wattheq.Controller;

import com.ELM.stProject.Wattheq.Model.Orga;
import com.ELM.stProject.Wattheq.Service.OrgaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/Orga")
public class OrgaController {

    @Autowired
    private OrgaService orgaService;

    @PostMapping(value = "/AddOrga")
    public Orga addOrga(@RequestBody Orga orga) {
        return orgaService.addOrga(orga);
    }

    @GetMapping(value = "/GetAllOrgas")
    public List<Orga> getAllOrgas() {
        return orgaService.getAllOrgas();
    }

    @GetMapping(value = "/GetOrga/{orgaID}")
    public Orga getOrga(@PathVariable("orgaID") int orgaID) {
        return orgaService.getOrga(orgaID);
    }

    @PutMapping(value = "/UpdateOrga/{orgaID}")
    public Orga updateOrga(@RequestBody Orga orga, @PathVariable("orgaID") int orgaID) {
        return orgaService.updateOrga(orga, orgaID);
    }

    @DeleteMapping(value = "/DeleteOrga/{orgaID}")
    public void deleteOrga(@PathVariable("orgaID") int orgaID) {
        orgaService.deleteOrga(orgaID);
    }

    @DeleteMapping(value = "/DeleteAllOrgas")
    public void deleteAllOrgas() {
        orgaService.deleteAllOrgas();
    }
}
