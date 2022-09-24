package com.hospital.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "patients_bill")
public class PatientsBill implements Serializable {

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
    @JoinColumn(name = "DOCTOR_ID")
    private Doctor doctorId;

    @ManyToOne
    @JoinColumn(name = "PRESSCRIPTION_ID")
    private Presscription presscriptionId;

    @ManyToOne
    @JoinColumn(name = "REPORT_ID")
    private Report reportId;

    @Column(name = "PAID_AMOUNT")
    private BigDecimal paidAmount;

    @Column(name = "PAYABLE_AMOUNT", nullable = false)
    private BigDecimal payableAmount;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PAYMENT_STATUS")
    private Integer paymentStatus = 0;

    public PatientsBill(String name, Patient patientId, Doctor doctorId, Presscription presscriptionId, Report reportId, BigDecimal paidAmount, BigDecimal payableAmount, String description, Integer paymentStatus) {
        this.name = name;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.presscriptionId = presscriptionId;
        this.reportId = reportId;
        this.paidAmount = paidAmount;
        this.payableAmount = payableAmount;
        this.description = description;
        this.paymentStatus = paymentStatus;
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

    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    public BigDecimal getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(BigDecimal payableAmount) {
        this.payableAmount = payableAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "PatientsBill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                ", presscriptionId=" + presscriptionId +
                ", reportId=" + reportId +
                ", paidAmount=" + paidAmount +
                ", payableAmount=" + payableAmount +
                ", description='" + description + '\'' +
                ", paymentStatus=" + paymentStatus +
                '}';
    }
}
