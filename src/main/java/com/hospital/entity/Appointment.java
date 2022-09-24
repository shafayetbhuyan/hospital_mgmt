package com.hospital.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "appointment")
public class Appointment implements Serializable {

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

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "VISITED")
    private Integer visited = 0;

    @Column(name = "DATE", nullable = false)
    private LocalDate date;

    @Column(name = "TIME", nullable = false)
    private LocalTime time;

    @OneToMany(mappedBy = "appointmentId")
    private List<Presscription> presscriptions;

    public Appointment(Patient patientId, Doctor doctorId, String description, Integer visited, LocalDate date, LocalTime time, List<Presscription> presscriptions) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.description = description;
        this.visited = visited;
        this.date = date;
        this.time = time;
        this.presscriptions = presscriptions;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
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

    public List<Presscription> getPresscriptions() {
        return presscriptions;
    }

    public void setPresscriptions(List<Presscription> presscriptions) {
        this.presscriptions = presscriptions;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                ", description='" + description + '\'' +
                ", visited=" + visited +
                ", date=" + date +
                ", time=" + time +
                ", presscriptions=" + presscriptions +
                '}';
    }
}
