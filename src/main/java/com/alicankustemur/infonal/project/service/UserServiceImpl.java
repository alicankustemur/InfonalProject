package com.alicankustemur.infonal.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alicankustemur.infonal.project.dao.IUserRepository;
import com.alicankustemur.infonal.project.model.User;

@Service
public class UserServiceImpl implements IUserService
{

	@Autowired
	private IUserRepository userRepository;

	public void setUserRepository(IUserRepository userRepository)
	{
		this.userRepository = userRepository;
	}

	@Override
	public void addUser(User user)
	{
		userRepository.save(user);

	}

	@Override
	public User getUser(String id)
	{
		User user = userRepository.findOne(id);
		return user;

	}

	@Override
	public void deleteUser(String id)
	{
		userRepository.delete(id);

	}

	@Override
	public List<User> getAllUser()
	{
		return userRepository.findAll();
	}

}
