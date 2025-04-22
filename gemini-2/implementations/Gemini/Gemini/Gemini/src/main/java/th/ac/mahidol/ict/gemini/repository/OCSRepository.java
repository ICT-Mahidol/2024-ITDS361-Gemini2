package th.ac.mahidol.ict.gemini.repository;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.SciencePlan;
import org.springframework.stereotype.Repository;

@Repository
public class OCSRepository {
    private final OCS ocs = new OCS(true); // โหลด mock data ด้วย

    public String saveSciencePlan(SciencePlan plan) {
        return ocs.createSciencePlan(plan);
    }
}
