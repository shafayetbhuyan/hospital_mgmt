package com.hospital.dao;

import com.hospital.entity.AdmitedPatients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmitedPatientsRepository extends JpaRepository<AdmitedPatients, Long>, JpaSpecificationExecutor<AdmitedPatients> {

}