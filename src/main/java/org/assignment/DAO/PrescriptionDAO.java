/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.assignment.DAO;



import org.assignment.model.Prescription;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anupan
 */
public class PrescriptionDAO implements Dao<Prescription>{

	private List<Prescription> prescriptionList = new ArrayList<>();
	@Override
	public Prescription get(int id) {
		return prescriptionList.get(id);
	}

	@Override
	public List<Prescription> getAll() {
		return prescriptionList;
	}

	@Override
	public void add(Prescription prescription) {

	}

	@Override
	public void update(Prescription prescription, String[] params) {

	}

	@Override
	public void delete(int prescription) {

	}

	@Override
	public void nextId() {

	}
}
