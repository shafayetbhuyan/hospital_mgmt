package com.hospital.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "doctor")
public class Doctor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID", nullable = false)
    private Department departmentId;

    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private User userId;

    @Column(name = "PHONE", nullable = false)
    private Long phone;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "DESIGNATION")
    private String designation;

    @Column(name = "SPECIALITY")
    private String speciality;

    @Column(name = "BIO", nullable = false)
    private String bio;

    @Column(name = "VISIT_AMOUNT", nullable = false)
    private BigDecimal visitAmount;

    @OneToMany(mappedBy = "doctorId")
    private List<AdmitedPatients> admitedPatients;

    @OneToMany(mappedBy = "doctorId")
    private List<Appointment> appointments;

    @OneToMany(mappedBy = "doctorId")
    private List<DoctorSchedule> doctorSchedules;

    @OneToMany(mappedBy = "doctorId")
    private List<PatientsBill> patientsBills;

    @OneToMany(mappedBy = "doctorId")
    private List<Presscription> presscriptions;

    @OneToMany(mappedBy = "refDoctorId")
    private List<Presscription> refPresscriptions;

    @OneToMany(mappedBy = "doctorId")
    private List<Report> reports;

    @OneToMany(mappedBy = "doctorId")
    private List<Surgery> surgeries;

    public Doctor(String name, Department departmentId, User userId, Long phone, String address, String designation, String speciality, String bio, BigDecimal visitAmount, List<AdmitedPatients> admitedPatients, List<Appointment> appointments, List<DoctorSchedule> doctorSchedules, List<PatientsBill> patientsBills, List<Presscription> presscriptions, List<Presscription> refPresscriptions, List<Report> reports, List<Surgery> surgeries) {
        this.name = name;
        this.departmentId = departmentId;
        this.userId = userId;
        this.phone = phone;
        this.address = address;
        this.designation = designation;
        this.speciality = speciality;
        this.bio = bio;
        this.visitAmount = visitAmount;
        this.admitedPatients = admitedPatients;
        this.appointments = appointments;
        this.doctorSchedules = doctorSchedules;
        this.patientsBills = patientsBills;
        this.presscriptions = presscriptions;
        this.refPresscriptions = refPresscriptions;
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

    public Department getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public BigDecimal getVisitAmount() {
        return visitAmount;
    }

    public void setVisitAmount(BigDecimal visitAmount) {
        this.visitAmount = visitAmount;
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

    public List<DoctorSchedule> getDoctorSchedules() {
        return doctorSchedules;
    }

    public void setDoctorSchedules(List<DoctorSchedule> doctorSchedules) {
        this.doctorSchedules = doctorSchedules;
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

    public List<Presscription> getRefPresscriptions() {
        return refPresscriptions;
    }

    public void setRefPresscriptions(List<Presscription> refPresscriptions) {
        this.refPresscriptions = refPresscriptions;
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
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", departmentId=" + departmentId +
                ", userId=" + userId +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", designation='" + designation + '\'' +
                ", speciality='" + speciality + '\'' +
                ", bio='" + bio + '\'' +
                ", visitAmount=" + visitAmount +
                ", admitedPatients=" + admitedPatients +
                ", appointments=" + appointments +
                ", doctorSchedules=" + doctorSchedules +
                ", patientsBills=" + patientsBills +
                ", presscriptions=" + presscriptions +
                ", refPresscriptions=" + refPresscriptions +
                ", reports=" + reports +
                ", surgeries=" + surgeries +
                '}';
    }

}
