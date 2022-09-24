package com.hospital.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "presscription")
public class Presscription implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "PATIENT_ID", nullable = false)
    private Patient patientId;

    @ManyToOne
    @JoinColumn(name = "DOCTOR_ID", nullable = false)
    private Doctor doctorId;

    @ManyToOne
    @JoinColumn(name = "REF_DOCTOR_ID")
    private Doctor refDoctorId;

    @ManyToOne
    @JoinColumn(name = "APPOINTMENT_ID")
    private Appointment appointmentId;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "SUMMERY")
    private String summery;

    @Column(name = "DIAGNOSIS")
    private String diagnosis;

    @Column(name = "ADVICE")
    private String advice;

    @Column(name = "TEST")
    private String test;

    @Column(name = "MEDICINE")
    private String medicine;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "DATE", nullable = false)
    private LocalDate date;

    @Column(name = "TIME", nullable = false)
    private LocalTime time;

    @OneToMany(mappedBy = "presscriptionId")
    List<AdmitedPatients> admitedPatients;

    @OneToMany(mappedBy = "presscriptionId")
    List<PatientsBill> patientsBills;

    @OneToMany(mappedBy = "presscriptionId")
    List<Report> reports;

    @OneToMany(mappedBy = "presscriptionId")
    List<Surgery> surgeries;

    public Presscription(Patient patientId, Doctor doctorId, Doctor refDoctorId, Appointment appointmentId, String description, String summery, String diagnosis, String advice, String test, String medicine, String comment, LocalDate date, LocalTime time, List<AdmitedPatients> admitedPatients, List<PatientsBill> patientsBills, List<Report> reports, List<Surgery> surgeries) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.refDoctorId = refDoctorId;
        this.appointmentId = appointmentId;
        this.description = description;
        this.summery = summery;
        this.diagnosis = diagnosis;
        this.advice = advice;
        this.test = test;
        this.medicine = medicine;
        this.comment = comment;
        this.date = date;
        this.time = time;
        this.admitedPatients = admitedPatients;
        this.patientsBills = patientsBills;
        this.reports = reports;
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

    public Doctor getRefDoctorId() {
        return refDoctorId;
    }

    public void setRefDoctorId(Doctor refDoctorId) {
        this.refDoctorId = refDoctorId;
    }

    public Appointment getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Appointment appointmentId) {
        this.appointmentId = appointmentId;
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

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
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

    public List<Report> getReports() {
        return reports;
    }

    public void setReports(List<Report> reports) {
        this.reports = reports;
    }

    public List<Surgery> getSurgeries() {
        return surgeries;
    }

    public void setSurgeries(List<Surgery> surgeries) {
        this.surgeries = surgeries;
    }

    @Override
    public String toString() {
        return "Presscription{" +
                "id=" + id +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                ", refDoctorId=" + refDoctorId +
                ", appointmentId=" + appointmentId +
                ", description='" + description + '\'' +
                ", summery='" + summery + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", advice='" + advice + '\'' +
                ", test='" + test + '\'' +
                ", medicine='" + medicine + '\'' +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", admitedPatients=" + admitedPatients +
                ", patientsBills=" + patientsBills +
                ", reports=" + reports +
                ", surgeries=" + surgeries +
                '}';
    }
}
