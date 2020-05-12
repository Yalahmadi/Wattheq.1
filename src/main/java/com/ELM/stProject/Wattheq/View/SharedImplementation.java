package com.ELM.stProject.Wattheq.View;


import com.ELM.stProject.Wattheq.Model.Shared;
import com.ELM.stProject.Wattheq.Repo.SharedRepo;
import com.ELM.stProject.Wattheq.Service.SharedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SharedImplementation implements SharedService {

    @Autowired
    private SharedRepo repo;

    @Override
    public Shared addShared(Shared shared) {
        return repo.save(shared);
    }

    @Override
    public List<Shared> getAllShareds() {
        return repo.findAll();
    }

    @Override
    public Shared getShared(int sharedID) {
        return repo.findById(sharedID).get();
    }

    @Override
    public Shared updateShared(Shared shared, int sharedID) {
        shared.setSharedID(sharedID);
        return repo.save(shared);
    }

    @Override
    public void deleteShared(int sharedID) {
        repo.deleteById(sharedID);
    }

    @Override
    public void deleteAllShareds() {
        repo.deleteAll();
    }
}
