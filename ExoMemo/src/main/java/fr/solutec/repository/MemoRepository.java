package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Memo;
import fr.solutec.entities.User;

public interface MemoRepository extends CrudRepository<Memo, Long>{

}
