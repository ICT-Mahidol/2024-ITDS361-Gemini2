package th.ac.mahidol.ict.gemini.repository;
//
//import edu.gemini.app.ocs.model.SciencePlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.mahidol.ict.gemini.model.SciencePlan;

@Repository
public interface SciencePlanRepository extends JpaRepository<SciencePlan, Long> {
}
