package com.ELM.stProject.Wattheq.Controller;

import com.ELM.stProject.Wattheq.Model.Auth;
import com.ELM.stProject.Wattheq.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;




@RestController
@RequestMapping(value = "/Auths")


public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping(value = "/AddAuth")
    public Auth addAuth(@RequestBody Auth auth) {
        return authService.addAuth(auth);
    }

    @GetMapping(value = "/GetAllAuths")
    public List<Auth> getAllAuths() {
        return authService.getAllAuths();
    }

    @GetMapping(value = "/GetAuth/{authID}")
    public Auth getAuth(@PathVariable("authID") int authID) {
        return authService.getAuth(authID);
    }

    @PutMapping(value = "/UpdateAuth/{authID}")
    public Auth updateAuth(@RequestBody Auth auth, @PathVariable("authID") int authID) {
        return authService.updateAuth(auth, authID);
    }

    @DeleteMapping(value = "/DeleteAuth/{authID}")
    public void deleteAuth(@PathVariable("authID") int authID) {
        authService.deleteAuth(authID);
    }

    @DeleteMapping(value = "/DeleteAllAuths")
    public void deleteAllAuths() {
        authService.deleteAllAuths();
    }

}


