package fr.solutec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.User;
import fr.solutec.repository.UserRepository;

@SpringBootApplication
public class ExoMemoApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepos;

	public static void main(String[] args) {
		SpringApplication.run(ExoMemoApplication.class, args);
		System.out.println("Commande terminée");
	}

	@Override
	public void run(String... args) throws Exception {
		
		User u1=new User(null, "Cornet", "Arthur", "carthur", "rose"); //la valeur 0 équivaut à null pour int ; null=null pour Long
		userRepos.save(u1);
		User u2=new User(null, "Msaidie", "Zaher", "mzaher", "bonsai"); 
		userRepos.save(u2);
		User u3=new User(null, "Eustache", "Juliette", "ejuliette", "orchidee"); 
		userRepos.save(u3);
		User u4=new User(null, "Gallon", "Rose-Marie", "grosemarie", "pissenlit"); 
		userRepos.save(u4);
		
	}

}
