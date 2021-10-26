package fr.solutec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.Memo;
import fr.solutec.entities.User;
import fr.solutec.repository.MemoRepository;
import fr.solutec.repository.UserRepository;

@SpringBootApplication
public class ExoMemoApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepos;
	@Autowired
	private MemoRepository memoRepos;

	public static void main(String[] args) {
		SpringApplication.run(ExoMemoApplication.class, args);
		System.out.println("Commande terminée");
	}

	@Override
	public void run(String... args) throws Exception {
		
		User u1=new User(null, "Cornet", "Arthur", "carthur", "rose");
		userRepos.save(u1);
		User u2=new User(null, "Msaidie", "Zaher", "mzaher", "bonsai"); 
		userRepos.save(u2);
		User u3=new User(null, "Eustache", "Juliette", "ejuliette", "orchidee"); 
		userRepos.save(u3);
		User u4=new User(null, "Gallon", "Rose-Marie", "grosemarie", "pissenlit"); 
		userRepos.save(u4);
		
		Memo m1 = new Memo(null, "J'aime les roses", false, u1);
		memoRepos.save(m1);
		Memo m2 = new Memo(null, "J'aime les bonsais", false, u2);
		memoRepos.save(m2);
		Memo m3 = new Memo(null, "J'aime les orchidees", false, u3);
		memoRepos.save(m3);
		Memo m4 = new Memo(null, "J'aime les pissenlits", false, u4);
		memoRepos.save(m4);
		
	}

}
