package com.alicankustemur.infonal.project.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

@Configuration
@EnableMongoRepositories(basePackages = "com.alicankustemur.infonal.project.dao")
public class MongoDBConfig extends AbstractMongoConfiguration
{
	@Override
	public Mongo mongo() throws Exception
	{
		return new MongoClient(new ServerAddress("localhost", 27017));

	}

	@Override
	protected String getDatabaseName()
	{
		// VTODO Auto-generated method stub
		return "infonalproject";
	}
}
