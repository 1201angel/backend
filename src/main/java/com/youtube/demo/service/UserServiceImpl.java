package com.youtube.demo.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.youtube.demo.dao.UserRepository;
import com.youtube.demo.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	protected UserRepository userRepositoy;

	@Override
	public User save(User user) {
		return this.userRepositoy.save(user);
	}

}
