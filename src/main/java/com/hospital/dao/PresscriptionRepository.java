package com.hospital.dao;

import com.hospital.entity.Presscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PresscriptionRepository extends JpaRepository<Presscription, Long>, JpaSpecificationExecutor<Presscription> {

}