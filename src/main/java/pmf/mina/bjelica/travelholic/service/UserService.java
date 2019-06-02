package pmf.mina.bjelica.travelholic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pmf.mina.bjelica.travelholic.dao.UserRepository;
import pmf.mina.bjelica.travelholic.entity.User;

/*
*	Services are data access objects
*	We use service in controllers to access data
*
*/
@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	// save, delete, ... see implementation of JpaRepository
	
}
