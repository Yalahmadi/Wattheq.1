package com.ELM.stProject.Wattheq.Service;

import com.ELM.stProject.Wattheq.Model.Auth;

import java.util.List;


public interface AuthService {

    public Auth addAuth(Auth auth);
    public List<Auth> getAllAuths();
    public Auth getAuth(int authID);
    public Auth updateAuth(Auth auth, int authID);
    public void deleteAuth(int authID);
    public void deleteAllAuths();
}
