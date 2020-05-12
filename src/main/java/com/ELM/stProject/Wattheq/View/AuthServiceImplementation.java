package com.ELM.stProject.Wattheq.View;


import com.ELM.stProject.Wattheq.Model.Auth;
import com.ELM.stProject.Wattheq.Repo.AuthRepo;
import com.ELM.stProject.Wattheq.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthServiceImplementation implements AuthService {

    @Autowired
    private AuthRepo repo;

    @Override
    public Auth addAuth(Auth auth) {
        return repo.save(auth);
    }

    @Override
    public List<Auth> getAllAuths() {
        return repo.findAll();
    }

    @Override
    public Auth getAuth(int authID) {
        return repo.findById(authID).get();
    }

    @Override
    public Auth updateAuth(Auth auth, int authID) {
        auth.setNationalID(authID);
        return repo.save(auth);
    }

    @Override
    public void deleteAuth(int authID) {
        repo.deleteById(authID);
    }

    @Override
    public void deleteAllAuths() {
        repo.deleteAll();
    }
}
