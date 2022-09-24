package com.hospital.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "patient")
public class Patient implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private User userId;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "WEIGHT")
    private Integer weight;

    @Column(name = "TYPE", nullable = false)
    private Integer type;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "PHONE")
    private Long phone;

    @OneToMany(mappedBy = "patientId")
    private List<AdmitedPatients> admitedPatients;

    @OneToMany(mappedBy = "patientId")
    private List<Appointment> appointments;

    @OneToMany(mappedBy = "patientId")
    private List<PatientsBill> patientsBills;

    @OneToMany(mappedBy = "patientId")
    private List<Presscription> presscriptions;

    @OneToMany(mappedBy = "patientId")
    private List<Report> reports;

    @OneToMany(mappedBy = "patientId")
    private List<Surgery> surgeries;

    public Patient(String name, User userId, Integer age, Integer weight, Integer type, String address, String comment, Long phone, List<AdmitedPatients> admitedPatients, List<Appointment> appointments, List<PatientsBill> patientsBills, List<Presscription> presscriptions, List<Report> reports, List<Surgery> surgeries) {
        this.name = name;
        this.userId = userId;
        this.age = age;
        this.weight = weight;
        this.type = type;
        this.address = address;
        this.comment = comment;
        this.phone = phone;
        this.admitedPatients = admitedPatients;
        this.appointments = appointments;
        this.patientsBills = patientsBills;
        this.presscriptions = presscriptions;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public List<AdmitedPatients> getAdmitedPatients() {
        return admitedPatients;
    }

    public void setAdmitedPatients(List<AdmitedPatients> admitedPatients) {
        this.admitedPatients = admitedPatients;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public List<PatientsBill> getPatientsBills() {
        return patientsBills;
    }

    public void setPatientsBills(List<PatientsBill> patientsBills) {
        this.patientsBills = patientsBills;
    }

    public List<Presscription> getPresscriptions() {
        return presscriptions;
    }

    public void setPresscriptions(List<Presscription> presscriptions) {
        this.presscriptions = presscriptions;
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
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userId=" + userId +
                ", age=" + age +
                ", weight=" + weight +
                ", type=" + type +
                ", address='" + address + '\'' +
                ", comment='" + comment + '\'' +
                ", phone=" + phone +
                ", admitedPatients=" + admitedPatients +
                ", appointments=" + appointments +
                ", patientsBills=" + patientsBills +
                ", presscriptions=" + presscriptions +
                ", reports=" + reports +
                ", surgeries=" + surgeries +
                '}';
    }
}
