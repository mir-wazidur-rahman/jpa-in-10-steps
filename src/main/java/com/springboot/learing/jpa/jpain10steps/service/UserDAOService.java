package com.springboot.learing.jpa.jpain10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springboot.learing.jpa.jpain10steps.entity.User;

@Repository
@Transactional //this says that all the method in the class will be involved in a transaction
public class UserDAOService {
	
	//this helps in connection with data base
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public long insert(User user) {
		//persist  function is used to store it into DB
		entityManager.persist(user);
		return user.getId();
		
	}

}
