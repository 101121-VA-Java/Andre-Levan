package com.revature.repositories;

import java.util.List;

public interface GenericDao<T> {
	
	T add(T t);
	T getByID(int id);
	T remove(T t);
	List<T> getAll();
	boolean update(T t);
}
