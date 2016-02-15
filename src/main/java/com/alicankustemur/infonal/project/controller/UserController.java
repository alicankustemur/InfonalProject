package com.alicankustemur.infonal.project.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alicankustemur.infonal.project.service.UserServiceImpl;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

@Controller
public class UserController
{

	private static final String				VIEW_INDEX	= "user";
	private final static org.slf4j.Logger	logger		= LoggerFactory.getLogger(UserController.class);

	@Autowired(required = false)
	private UserServiceImpl					userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String view(ModelMap model)
	{

		try
		{
			MongoClient mongoClient = new MongoClient("localhost", 27017);
			DB db = mongoClient.getDB("infonalproject");
			DBCollection coll = db.getCollection("user");

			DBCursor cursor = coll.find();
			int i = 1;

			while (cursor.hasNext())
			{
				System.out.println("Inserted Document: " + i);
				System.out.println(cursor.next());
				i++;
			}

		}
		catch (Exception e)
		{
			// VTODO: handle exception
		}

		return VIEW_INDEX;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(ModelMap model, @RequestParam("name") String name, @RequestParam("surname") String surname)
	{

		System.out.println("Name = " + name + "\n" + "Surname = " + surname);

		return VIEW_INDEX;
	}

}
