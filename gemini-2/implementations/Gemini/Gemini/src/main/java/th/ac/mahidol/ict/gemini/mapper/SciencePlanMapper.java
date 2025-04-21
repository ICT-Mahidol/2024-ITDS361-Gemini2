package th.ac.mahidol.ict.gemini.mapper;

import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.StarSystem;

import java.util.List;
import java.util.stream.Collectors;

public class SciencePlanMapper {

    public static SciencePlan mapToOCS(th.ac.mahidol.ict.gemini.model.SciencePlan localPlan) {
        SciencePlan ocsPlan = new SciencePlan();
        ocsPlan.setCreator(localPlan.getCreator().getUsername());
        ocsPlan.setSubmitter(localPlan.getCreator().getUsername());
        ocsPlan.setFundingInUSD(localPlan.getFunding());
        ocsPlan.setObjectives(localPlan.getObjective());
        ocsPlan.setStarSystem(StarSystem.CONSTELLATIONS.valueOf(localPlan.getTarget()));
        ocsPlan.setStartDate(localPlan.getStartDate().toString() + " 00:00:00");
        ocsPlan.setEndDate(localPlan.getEndDate().toString() + " 00:00:00");
        ocsPlan.setTelescopeLocation(SciencePlan.TELESCOPELOC.HAWAII);
        ocsPlan.setStatus(SciencePlan.STATUS.SUBMITTED);
        return ocsPlan;
    }

    public static List<SciencePlan> mapToOCSList(List<th.ac.mahidol.ict.gemini.model.SciencePlan> localPlans) {
        return localPlans.stream()
                .map(SciencePlanMapper::mapToOCS)
                .collect(Collectors.toList());
    }
}
