package com.ELM.stProject.Wattheq.Controller;

import com.ELM.stProject.Wattheq.Model.Shared;
import com.ELM.stProject.Wattheq.Service.SharedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/Shareds")
public class SharedController {

    @Autowired
    private SharedService sharedService;

    @PostMapping(value = "/AddShared")
    public Shared addShared(@RequestBody Shared shared) {
        return sharedService.addShared(shared);
    }

    @GetMapping(value = "/GetAllShareds")
    public List<Shared> getAllShareds() {
        return sharedService.getAllShareds();
    }

    @GetMapping(value = "/GetShared/{sharedID}")
    public Shared getShared(@PathVariable("sharedID") int sharedID) {
        return sharedService.getShared(sharedID);
    }

    @PutMapping(value = "/UpdateShared/{sharedID}")
    public Shared updateShared(@RequestBody Shared shared, @PathVariable("sharedID") int sharedID) {
        return sharedService.updateShared(shared, sharedID);
    }

    @DeleteMapping(value = "/DeleteShared/{sharedID}")
    public void deleteShared(@PathVariable("sharedID") int sharedID) {
        sharedService.deleteShared(sharedID);
    }

    @DeleteMapping(value = "/DeleteAllShareds")
    public void deleteAllShareds() {
        sharedService.deleteAllShareds();
    }


}
