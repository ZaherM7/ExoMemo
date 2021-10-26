package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.repository.UserRepository;
import fr.solutec.entities.*;

@RestController @CrossOrigin("*")
public class UserRest {
	@Autowired
	private UserRepository userRepos;
	
	@PostMapping("login")
	public boolean connexion(@RequestBody User u) {
		Optional<User> p = userRepos.findByLoginAndMdp(u.getLogin(), u.getMdp());
		if (p.isPresent()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	

}
