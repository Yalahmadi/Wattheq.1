package com.ELM.stProject.Wattheq.Service;

import com.ELM.stProject.Wattheq.Model.Shared;

import java.util.List;


public interface SharedService {

    public Shared addShared(Shared shared);
    public List<Shared> getAllShareds();
    public Shared getShared(int sharedID);
    public Shared updateShared(Shared shared, int sharedID);
    public void deleteShared(int sharedID);
    public void deleteAllShareds();
}
