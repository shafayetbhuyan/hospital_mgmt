package com.hospital.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "surgery")
public class Surgery implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "PATIENT_ID", nullable = false)
    private Patient patientId;

    @ManyToOne
    @JoinColumn(name = "DOCTOR_ID", nullable = false)
    private Doctor doctorId;

    @ManyToOne
    @JoinColumn(name = "PRESSCRIPTION_ID")
    private Presscription presscriptionId;

    @ManyToOne
    @JoinColumn(name = "REPORT_ID")
    private Report reportId;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "SUMMERY")
    private String summery;

    @Column(name = "MEDICINE")
    private String medicine;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "DATE")
    private LocalDate date;

    public Surgery(String name, Patient patientId, Doctor doctorId, Presscription presscriptionId, Report reportId, String description, String status, String summery, String medicine, String comment, LocalDate date) {
        this.name = name;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.presscriptionId = presscriptionId;
        this.reportId = reportId;
        this.description = description;
        this.status = status;
        this.summery = summery;
        this.medicine = medicine;
        this.comment = comment;
        this.date = date;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Surgery{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                ", presscriptionId=" + presscriptionId +
                ", reportId=" + reportId +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", summery='" + summery + '\'' +
                ", medicine='" + medicine + '\'' +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                '}';
    }
}
