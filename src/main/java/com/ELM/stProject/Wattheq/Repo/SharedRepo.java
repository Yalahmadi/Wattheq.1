package com.ELM.stProject.Wattheq.Repo;

import com.ELM.stProject.Wattheq.Model.Cert;
import com.ELM.stProject.Wattheq.Model.Shared;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SharedRepo extends JpaRepository <Shared , Integer> {





    @Override
    List<Shared> findAll();
}
