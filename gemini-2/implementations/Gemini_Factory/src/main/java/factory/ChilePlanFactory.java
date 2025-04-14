package factory;

import model.ChileSciencePlan;
import model.SciencePlan;

public class ChilePlanFactory extends SciencePlanFactory {
    @Override
    public SciencePlan createSciencePlan() {
        return new ChileSciencePlan();
    }
}
