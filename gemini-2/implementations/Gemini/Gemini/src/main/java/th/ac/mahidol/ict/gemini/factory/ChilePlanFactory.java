package th.ac.mahidol.ict.gemini.factory;

import th.ac.mahidol.ict.gemini.model.*;

import java.util.Map;

public class ChilePlanFactory extends SciencePlanFactory {
    @Override
    public SciencePlan createSciencePlan(Map<String, Object> params) {
        return new ChileSciencePlan(
                (String) params.get("planID"),
                (String) params.get("planName"),
                (Astronomer) params.get("creator"),
                (Float) params.get("funding"),
                (String) params.get("objective"),
                (String) params.get("startDate"),
                (String) params.get("endDate"),
                (String) params.get("target"),
                (String) params.get("status"),
                (DataProcessingRequirement) params.get("dataProcessingRequirement")
        );
    }
}
