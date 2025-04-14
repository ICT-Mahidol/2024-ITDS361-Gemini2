package factory;

import model.HawaiiSciencePlan;
import model.SciencePlan;

public class HawaiiPlanFactory extends SciencePlanFactory {
    @Override
    public SciencePlan createSciencePlan() {
        return new HawaiiSciencePlan();
    }
}
