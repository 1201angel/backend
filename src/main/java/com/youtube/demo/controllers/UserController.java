package com.youtube.demo.controllers;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.youtube.demo.model.User;
import com.youtube.demo.service.UserService;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.youtube.demo.util.RestResponse;

@RestController
public class UserController {

	@Autowired
	protected UserService userService;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value="/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String userJson)
           throws JsonParseException, JsonMappingException, IOException {
	
		this.mapper = new ObjectMapper();
 User user = this.mapper.readValue(userJson, User.class);
 
 	if(!this.validate(user)) {
 		return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
 				"Los campos no estan llenos!!");
 	}
 
 		this.userService.save(user);
		
		return new RestResponse(HttpStatus.OK.value(),"Operacion exitosa");
	}

	@RequestMapping(value="/getUsers", method = RequestMethod.GET)
	public List<User> getUsers() {
		return this.userService.findAll();
	}
	
	private boolean validate(User user) {
		boolean isValid = true;
		
		if (StringUtils.trimToNull(user.getPrimerNombre()) == null) {
			isValid = false;
		}
		
		if (StringUtils.trimToNull(user.getPrimerApellido()) == null) {
			isValid = false;
		}
		
		if (StringUtils.trimToNull(user.getTelefono()) == null) {
			isValid = false;
		}
		
		if (StringUtils.trimToNull(user.getDireccion()) == null) {
			isValid = false;
		}
		return isValid;
	}
}
