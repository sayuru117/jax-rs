/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.assignment.DAO;



import org.assignment.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anupan
 */
public class PersonDAO implements Dao<Person>{

    private List<Person> personList = new ArrayList<>();
    @Override
    public Person get(int id) {
        return personList.get(id);
    }

    @Override
    public List<Person> getAll() {
        return personList;
    }

    @Override
    public void add(Person person) {

    }

    @Override
    public void update(Person person, String[] params) {

    }

    @Override
    public void delete(int person) {

    }

    @Override
    public void nextId() {

    }
}
