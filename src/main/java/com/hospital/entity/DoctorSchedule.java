package com.hospital.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;

@Entity
@Table(name = "doctor_schedule")
public class DoctorSchedule implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "SCHEDULE_DETAILS")
    private String scheduleDetails;

    @Column(name = "SUMMERY")
    private String summery;

    @Column(name = "COMMENT")
    private String comment;

    @ManyToOne
    @JoinColumn(name = "DOCTOR_ID", nullable = false)
    private Doctor doctorId;

    @Column(name = "FROM_TIME")
    private LocalTime fromTime;

    @Column(name = "TO_TIME")
    private LocalTime toTime;

    @Column(name = "DAYS")
    private String days;

    public DoctorSchedule(String description, String scheduleDetails, String summery, String comment, Doctor doctorId, LocalTime fromTime, LocalTime toTime, String days) {
        this.description = description;
        this.scheduleDetails = scheduleDetails;
        this.summery = summery;
        this.comment = comment;
        this.doctorId = doctorId;
        this.fromTime = fromTime;
        this.toTime = toTime;
        this.days = days;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getScheduleDetails() {
        return scheduleDetails;
    }

    public void setScheduleDetails(String scheduleDetails) {
        this.scheduleDetails = scheduleDetails;
    }

    public String getSummery() {
        return summery;
    }

    public void setSummery(String summery) {
        this.summery = summery;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Doctor getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Doctor doctorId) {
        this.doctorId = doctorId;
    }

    public LocalTime getFromTime() {
        return fromTime;
    }

    public void setFromTime(LocalTime fromTime) {
        this.fromTime = fromTime;
    }

    public LocalTime getToTime() {
        return toTime;
    }

    public void setToTime(LocalTime toTime) {
        this.toTime = toTime;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "DoctorSchedule{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", scheduleDetails='" + scheduleDetails + '\'' +
                ", summery='" + summery + '\'' +
                ", comment='" + comment + '\'' +
                ", doctorId=" + doctorId +
                ", fromTime=" + fromTime +
                ", toTime=" + toTime +
                ", days='" + days + '\'' +
                '}';
    }
}
