package com.youtube.demo.service;

import java.util.List;

import com.youtube.demo.model.User;

public interface UserService {

	/**
	 * Guarda Un usuario
	 * @param user
	 * @return el usuario guaradado
	 */
	User save(User user);

	/**
	 * Recupera la lista de usuarios
	 * @param user
	 * @return el usuario guaradado
	 */
	List<User> findAll();



}
