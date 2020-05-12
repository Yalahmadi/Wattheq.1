package com.ELM.stProject.Wattheq.Repo;

import com.ELM.stProject.Wattheq.Model.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface AuthRepo extends JpaRepository<Auth, Integer> {


    @Override
    List<Auth> findAll();
}
