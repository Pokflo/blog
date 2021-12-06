package com.formation.blog.services;


import com.formation.blog.dao.DBManager;
import com.formation.blog.dao.Dao;
import com.formation.blog.models.User;

import java.sql.*;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;

public class UserService implements Dao<User, String> {

	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet resulset = null;

	public UserService() {
		this.connection = DBManager.getInstance();
	}

	public User insert(User user) {
		String query = "INSERT INTO user(email,mdp, nom, prenom,naissance,role) VALUES(?,?,?,?,?,?)";
		try {
			statement = connection.prepareStatement(query);
			statement.setString(1, user.getEmail());
			statement.setString(2, user.getMdp());
			statement.setString(3, user.getNom());
			statement.setString(4, user.getPrenom());
			statement.setDate(5, Date.valueOf(user.getNaissance()
					.toInstant()
					.atZone(ZoneId.of("Europe/Paris"))
					.toLocalDate()));
			statement.setInt(6, user.getRole());

			int i = statement.executeUpdate();
			if (i > 0) {
				return user;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void update(String id, User user) {

	}
	
	public Collection<User> findAll() {
		connection = DBManager.getInstance();
		String query = "SELECT * FROM user";
		Collection<User> users = new ArrayList<>();
		try {
			statement = connection.prepareStatement(query);
			resulset = statement.executeQuery();
			if (resulset.getRow() > 0) {
				while (resulset.next()) {
					users.add(this.resulsetToObject(resulset));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	public User findByID(String id) {
		return null;
	}

	public boolean delete(String id) {
		return false;
	}

	private User resulsetToObject(ResultSet rs) throws SQLException {
		User user = new User();
		user.setEmail(rs.getString("email"));
		user.setNom(rs.getString("nom"));
		user.setPrenom(rs.getString("prenom"));
		user.setMdp(rs.getString("mdp"));
		user.setNaissance(rs.getDate("naissance"));
		user.setRole(rs.getInt("role"));
		return user;
	}

}

