package org.assignment.DAO;

import java.util.List;

public interface Dao <T> {

	T get(int id);
	List<T> getAll();
	void add(T t);
	void update(T t, int params);
	void delete(int t);

	void nextId();
}
