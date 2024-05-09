/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.assignment.DAO;



import org.assignment.model.MedicalRecord;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anupan
 */
public class MedicalRecordDAO implements Dao<MedicalRecord>{

	private List<MedicalRecord> medicalRecordList = new ArrayList<>();
	@Override
	public MedicalRecord get(int id) {
		return medicalRecordList.get(id);
	}

	@Override
	public List<MedicalRecord> getAll() {
		return medicalRecordList;
	}

	@Override
	public void add(MedicalRecord medicalRecord) {

	}

	@Override
	public void update(MedicalRecord medicalRecord, String[] params) {

	}

	@Override
	public void delete(int medicalRecord) {

	}

	@Override
	public void nextId() {

	}
}
