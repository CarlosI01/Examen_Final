package thewosita.cj.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import thewosita.cj.modals.Profesor;
@Repository
public interface ProfesorDAO extends MongoRepository<Profesor, String>{

}
