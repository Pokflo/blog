package com.formation.blog.dao;

import java.util.Collection;

public interface Dao<T, I> {
	T insert(T t);
	void update(I id, T t);
	Collection<T> findAll();
	T findByID(I i);
	boolean delete(I id);

}
