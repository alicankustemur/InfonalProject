package com.alicankustemur.infonal.project.service;

import java.util.List;

import com.alicankustemur.infonal.project.model.User;

public interface IUserService
{
	public void addUser(User user);

	public User getUser(String id);

	public void deleteUser(String id);

	public List<User> getAllUser();
}
