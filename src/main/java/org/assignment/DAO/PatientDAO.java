/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.assignment.DAO;



import org.assignment.model.Patient;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anupan
 */
public class PatientDAO implements Dao<Patient> {

    private List<Patient> patientList = new ArrayList<>();

    @Override
    public Patient get(int id) {
        return patientList.get(id);
    }

    @Override
    public List<Patient> getAll() {
        return patientList;
    }

    @Override
    public void add(Patient patient) {

    }

    @Override
    public void update(Patient patient, int params) {

    }

    @Override
    public void delete(int patient) {

    }

    @Override
    public void nextId() {

    }
}
