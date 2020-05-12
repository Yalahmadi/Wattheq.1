package com.ELM.stProject.Wattheq.Repo;

import com.ELM.stProject.Wattheq.Model.Cert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface CertRepo extends JpaRepository<Cert, Integer> {


    @Override
    List<Cert> findAll();
}
