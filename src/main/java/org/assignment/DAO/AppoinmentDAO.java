/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.assignment.DAO;



import org.assignment.model.Appoinment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anupan
 */
public class AppoinmentDAO implements Dao<Appoinment>{

	private List<Appoinment> appoinmentList = new ArrayList<>();

	@Override
	public Appoinment get(int id) {
		return appoinmentList.get(id);
	}

	@Override
	public List<Appoinment> getAll() {
		return appoinmentList;
	}

	@Override
	public void add(Appoinment appoinment) {

		appoinmentList.add(appoinment);

	}

	@Override
	public void update(Appoinment appoinment, int params) {

	}

	@Override
	public void delete(int appoinment) {

	}

	@Override
	public void nextId() {

	}
}
