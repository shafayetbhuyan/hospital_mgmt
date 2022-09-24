package com.hospital.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "hospital_info")
public class HospitalInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "THEAM")
    private String theam;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "CONTRACT")
    private String contract;

    @Column(name = "EMMERGENCY")
    private String emmergency;

    @Column(name = "HELPLINE")
    private String helpline;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ABOUT_US")
    private String aboutUs;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DETAIL1")
    private String detail1;

    @Column(name = "DETAIL2")
    private String detail2;

    @Column(name = "DETAIL3")
    private String detail3;

    @Column(name = "DETAIL4")
    private String detail4;

    @Column(name = "DETAIL5")
    private String detail5;

    @Column(name = "DATE")
    private LocalDate date;

    public HospitalInfo(String name, String title, String theam, String address, String contract, String emmergency, String helpline, String description, String aboutUs, String email, String detail1, String detail2, String detail3, String detail4, String detail5, LocalDate date) {
        this.name = name;
        this.title = title;
        this.theam = theam;
        this.address = address;
        this.contract = contract;
        this.emmergency = emmergency;
        this.helpline = helpline;
        this.description = description;
        this.aboutUs = aboutUs;
        this.email = email;
        this.detail1 = detail1;
        this.detail2 = detail2;
        this.detail3 = detail3;
        this.detail4 = detail4;
        this.detail5 = detail5;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTheam() {
        return theam;
    }

    public void setTheam(String theam) {
        this.theam = theam;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getEmmergency() {
        return emmergency;
    }

    public void setEmmergency(String emmergency) {
        this.emmergency = emmergency;
    }

    public String getHelpline() {
        return helpline;
    }

    public void setHelpline(String helpline) {
        this.helpline = helpline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAboutUs() {
        return aboutUs;
    }

    public void setAboutUs(String aboutUs) {
        this.aboutUs = aboutUs;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDetail1() {
        return detail1;
    }

    public void setDetail1(String detail1) {
        this.detail1 = detail1;
    }

    public String getDetail2() {
        return detail2;
    }

    public void setDetail2(String detail2) {
        this.detail2 = detail2;
    }

    public String getDetail3() {
        return detail3;
    }

    public void setDetail3(String detail3) {
        this.detail3 = detail3;
    }

    public String getDetail4() {
        return detail4;
    }

    public void setDetail4(String detail4) {
        this.detail4 = detail4;
    }

    public String getDetail5() {
        return detail5;
    }

    public void setDetail5(String detail5) {
        this.detail5 = detail5;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "HospitalInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", theam='" + theam + '\'' +
                ", address='" + address + '\'' +
                ", contract='" + contract + '\'' +
                ", emmergency='" + emmergency + '\'' +
                ", helpline='" + helpline + '\'' +
                ", description='" + description + '\'' +
                ", aboutUs='" + aboutUs + '\'' +
                ", email='" + email + '\'' +
                ", detail1='" + detail1 + '\'' +
                ", detail2='" + detail2 + '\'' +
                ", detail3='" + detail3 + '\'' +
                ", detail4='" + detail4 + '\'' +
                ", detail5='" + detail5 + '\'' +
                ", date=" + date +
                '}';
    }
}
