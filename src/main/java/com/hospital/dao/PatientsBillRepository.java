package com.hospital.dao;

import com.hospital.entity.PatientsBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientsBillRepository extends JpaRepository<PatientsBill, Long>, JpaSpecificationExecutor<PatientsBill> {

}