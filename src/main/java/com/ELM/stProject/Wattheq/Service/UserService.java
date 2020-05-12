package com.ELM.stProject.Wattheq.Service;

import com.ELM.stProject.Wattheq.DTO.UserDTO;
import com.ELM.stProject.Wattheq.Model.User;

import java.util.List;


public interface UserService {

    public User addInd(User user);
    public List<UserDTO> getAllUsers();
    public UserDTO getUser(int userID);
    public User updateUser(User user, int userID);
    public void deleteUser(int userID);
    public void deleteAllUsers();


}
