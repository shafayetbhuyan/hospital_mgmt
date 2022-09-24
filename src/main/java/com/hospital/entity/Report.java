package com.hospital.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "report")
public class Report implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "SUMMERY")
    private String summery;

    @ManyToOne
    @JoinColumn(name = "PATIENT_ID", nullable = false)
    private Patient patientId;

    @ManyToOne
    @JoinColumn(name = "DOCTOR_ID", nullable = false)
    private Doctor doctorId;

    @ManyToOne
    @JoinColumn(name = "PRESSCRIPTION_ID", nullable = false)
    private Presscription presscriptionId;

    @Column(name = "DIAGNOSIS")
    private String diagnosis;

    @Column(name = "FINDINGS")
    private String findings;

    @Column(name = "MEDICINE")
    private String medicine;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "DATE", nullable = false)
    private LocalDate date;

    @Column(name = "TIME", nullable = false)
    private LocalTime time;

    @OneToMany(mappedBy = "reportId")
    List<AdmitedPatients> admitedPatients;

    @OneToMany(mappedBy = "reportId")
    List<PatientsBill> patientsBills;

    @OneToMany(mappedBy = "reportId")
    List<Surgery> surgeries;

    public Report(String name, String description, String summery, Patient patientId, Doctor doctorId, Presscription presscriptionId, String diagnosis, String findings, String medicine, String comment, LocalDate date, LocalTime time, List<AdmitedPatients> admitedPatients, List<PatientsBill> patientsBills, List<Surgery> surgeries) {
        this.name = name;
        this.description = description;
        this.summery = summery;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.presscriptionId = presscriptionId;
        this.diagnosis = diagnosis;
        this.findings = findings;
        this.medicine = medicine;
        this.comment = comment;
        this.date = date;
        this.time = time;
        this.admitedPatients = admitedPatients;
        this.patientsBills = patientsBills;
        this.surgeries = surgeries;
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

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getFindings() {
        return findings;
    }

    public void setFindings(String findings) {
        this.findings = findings;
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

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public List<AdmitedPatients> getAdmitedPatients() {
        return admitedPatients;
    }

    public void setAdmitedPatients(List<AdmitedPatients> admitedPatients) {
        this.admitedPatients = admitedPatients;
    }

    public List<PatientsBill> getPatientsBills() {
        return patientsBills;
    }

    public void setPatientsBills(List<PatientsBill> patientsBills) {
        this.patientsBills = patientsBills;
    }

    public List<Surgery> getSurgeries() {
        return surgeries;
    }

    public void setSurgeries(List<Surgery> surgeries) {
        this.surgeries = surgeries;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", summery='" + summery + '\'' +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                ", presscriptionId=" + presscriptionId +
                ", diagnosis='" + diagnosis + '\'' +
                ", findings='" + findings + '\'' +
                ", medicine='" + medicine + '\'' +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", admitedPatients=" + admitedPatients +
                ", patientsBills=" + patientsBills +
                ", surgeries=" + surgeries +
                '}';
    }
}
