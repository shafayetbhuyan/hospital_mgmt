package com.hospital.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "admited_patients")
public class AdmitedPatients implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "PATIENT_ID", nullable = false)
    private Patient patientId;

    @ManyToOne
    @JoinColumn(name = "DOCTOR_ID")
    private Doctor doctorId;

    @ManyToOne
    @JoinColumn(name = "PRESSCRIPTION_ID")
    private Presscription presscriptionId;

    @ManyToOne
    @JoinColumn(name = "REPORT_ID")
    private Report reportId;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "SUMMERY")
    private String summery;

    @Column(name = "MEDICINE")
    private String medicine;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "FROM_DATE")
    private LocalDate fromDate;

    @Column(name = "TO_DATE")
    private LocalTime toDate;

    public AdmitedPatients(Patient patientId, Doctor doctorId, Presscription presscriptionId, Report reportId, String description, String summery, String medicine, String comment, LocalDate fromDate, LocalTime toDate) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.presscriptionId = presscriptionId;
        this.reportId = reportId;
        this.description = description;
        this.summery = summery;
        this.medicine = medicine;
        this.comment = comment;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patient getPatientId() {
        return patientId;
    }

    public void setPatientId(Patient patientId) {
        this.patientId = patientId;
    }

    public Doctor getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Doctor doctorId) {
        this.doctorId = doctorId;
    }

    public Presscription getPresscriptionId() {
        return presscriptionId;
    }

    public void setPresscriptionId(Presscription presscriptionId) {
        this.presscriptionId = presscriptionId;
    }

    public Report getReportId() {
        return reportId;
    }

    public void setReportId(Report reportId) {
        this.reportId = reportId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSummery() {
        return summery;
    }

    public void setSummery(String summery) {
        this.summery = summery;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalTime toDate) {
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return "AdmitedPatients{" +
                "id=" + id +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                ", presscriptionId=" + presscriptionId +
                ", reportId=" + reportId +
                ", description='" + description + '\'' +
                ", summery='" + summery + '\'' +
                ", medicine='" + medicine + '\'' +
                ", comment='" + comment + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                '}';
    }
}
