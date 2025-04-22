package th.ac.mahidol.ict.gemini.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import th.ac.mahidol.ict.gemini.model.Astronomer;

@Repository
public interface AstronomerRepository extends CrudRepository<Astronomer, Integer> {
    Astronomer findById(int id);

    Astronomer findByUsername(String username);
}
