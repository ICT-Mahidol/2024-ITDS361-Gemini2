package th.ac.mahidol.ict.gemini.factory;

import th.ac.mahidol.ict.gemini.model.SciencePlan;
import java.util.Map;

public abstract class SciencePlanFactory {
    public abstract SciencePlan createSciencePlan(Map<String, Object> params);
}