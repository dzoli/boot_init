package pmf.mina.bjelica.travelholic.restful;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pmf.mina.bjelica.travelholic.entity.User;
import pmf.mina.bjelica.travelholic.service.UserService;

@RestController
@RequestMapping("/user")
public class UserApi {
	
	@Autowired
	UserService service;
	
	@GetMapping("/all")
	public List<User> getAllUsers(){
		return service.findAll();
	}

	// see docs for @PostMapping("/path"), @Valid, @RequestBody !!!
	
}
