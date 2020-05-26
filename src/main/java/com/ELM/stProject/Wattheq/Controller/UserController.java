package com.ELM.stProject.Wattheq.Controller;


import com.ELM.stProject.Wattheq.DTO.UserDTO;
import com.ELM.stProject.Wattheq.Model.Orga;
import com.ELM.stProject.Wattheq.Model.User;
import com.ELM.stProject.Wattheq.Repo.OrgaRepo;
import com.ELM.stProject.Wattheq.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/Users")
public class UserController {

    @Autowired
    private UserService userService;
    private OrgaRepo orgaRepo;


//    @PostMapping(value = "/AddInd")
//    public User addInd(@RequestBody User user) {
//      // user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
//        return userService.addInd(user);
//
//    }

    @RequestMapping(value = "/AddInd", method = RequestMethod.POST)
    public String addInd( @RequestBody User user) {
        userService.addInd(user);
        return "Added Successfully";
    }


    @GetMapping(value = "/GetAllUsers")
    public List<UserDTO> getAllUsers() { return userService.getAllUsers(); }

    @GetMapping(value = "/GetUserByEmail/{email}")
    public UserDTO getUserByEmail(@PathVariable("email") String email) {
        return userService.getUserByEmail(email);
    }


    @GetMapping(value = "/GetUser/{userID}")
    public UserDTO getUser(@PathVariable("userID") int userID) {
        return userService.getUser(userID);
    }

    @PutMapping(value = "/UpdateUser/{userID}")
    public User updateUser(@RequestBody User user, @PathVariable("userID") int userID) {
        return userService.updateUser(user, userID);
    }

    @DeleteMapping(value = "/DeleteUser/{userID}")
    public void deleteUser(@PathVariable("userID") int userID) {
        userService.deleteUser(userID);
    }

    @DeleteMapping(value = "/DeleteAllUsers")
    public void deleteAllUsers() {
        userService.deleteAllUsers();
    }




    @PostMapping(value = "/AddOrga")
    public void  addOrga(@RequestBody Orga orga)
    {
        orgaRepo.save(orga);
//        return orgaService.addOrga(orga);
    }
    }








