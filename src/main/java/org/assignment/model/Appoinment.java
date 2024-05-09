/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.assignment.model;

/**
 *
 * @author anupan
 */
public class Appoinment {
    
    private String appoinmentID;
    
    private String dateTime;
    
    private String doctorID;
    
    private String PatientID;
    
    private String discription;

    public String getAppoinmentID() {
        return appoinmentID;
    }

    public void setAppoinmentID(String appoinmentID) {
        this.appoinmentID = appoinmentID;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
    
}
