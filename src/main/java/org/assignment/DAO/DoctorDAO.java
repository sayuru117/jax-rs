/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.assignment.DAO;



import org.assignment.model.Doctor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anupan
 */
public class DoctorDAO implements Dao<Doctor>{
    private List<Doctor> doctorList = new ArrayList<>();


    @Override
    public Doctor get(int id) {
        return doctorList.get(id);
    }

    @Override
    public List<Doctor> getAll() {
        return doctorList;
    }

    @Override
    public void add(Doctor doctor) {

    }

    @Override
    public void update(Doctor doctor, int params) {

    }

    @Override
    public void delete(int doctor) {

    }

    @Override
    public void nextId() {

    }
}
