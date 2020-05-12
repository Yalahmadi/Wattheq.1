package com.ELM.stProject.Wattheq.Repo;

import com.ELM.stProject.Wattheq.Model.Orga;
import com.ELM.stProject.Wattheq.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrgaRepo extends JpaRepository <Orga, Integer> {



       @Override
    List<Orga> findAll();


}
