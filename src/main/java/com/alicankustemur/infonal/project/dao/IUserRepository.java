package com.alicankustemur.infonal.project.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.alicankustemur.infonal.project.model.User;

public interface IUserRepository extends MongoRepository<User, String>
{

}
