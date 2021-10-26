package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Memo;
import fr.solutec.repository.MemoRepository;
import fr.solutec.repository.UserRepository;

@RestController @CrossOrigin("*")
public class MemoRest {
	@Autowired
	private MemoRepository memoRepos;
	@Autowired
	private UserRepository userRepos;

	@GetMapping("memo/user/{id}")
	public Iterable<Memo> getMemos(@PathVariable Long id) {
		Iterable<Memo> m=memoRepos.findByUserId(id);
		return m;
	}
	

}
