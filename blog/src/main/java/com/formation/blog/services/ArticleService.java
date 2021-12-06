package com.formation.blog.services;

import java.util.Collection;

import com.formation.blog.dao.Dao;
import com.formation.blog.models.Article;



public class ArticleService implements Dao <Article, Integer> {
	public Article insert(Article article) {
		return null;
	}


	public void update(Integer id, Article article) {

	}

	public Collection<Article> findAll() {
		return null;
	}


	public Article findByID(Integer id) {
		return null;
	}


	public boolean delete(Integer id) {
		return false;
	}
}
