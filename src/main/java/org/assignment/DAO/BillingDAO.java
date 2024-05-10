/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.assignment.DAO;



import org.assignment.model.Billing;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author anupan
 */
public class BillingDAO implements Dao<Billing>{

	//loger here
	private static final Logger logger = Logger.getLogger(BillingDAO.class.getName());

	private List<Billing> billingList = new ArrayList<>();

	@Override
	public Billing get(int id) {
		return billingList.get(id);
	}

	@Override
	public List<Billing> getAll() {
		logger.info("getAll");
		return billingList;
	}

	@Override
	public void add(Billing billing) {
		billingList.add(billing);

	}

	@Override
	public void update(Billing billing, int params) {


	}

	@Override
	public void delete(int billing) {

	}

	@Override
	public void nextId() {

	}
}
