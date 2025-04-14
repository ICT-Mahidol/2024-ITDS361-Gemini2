package th.ac.mahidol.ict.gemini_factory;

import factory.ChilePlanFactory;
import factory.HawaiiPlanFactory;
import factory.SciencePlanFactory;
import model.SciencePlan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeminiFactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeminiFactoryApplication.class, args);

        SciencePlanFactory hawaiiFactory = new HawaiiPlanFactory();
        SciencePlan hawaiiPlan = hawaiiFactory.createSciencePlan();
        hawaiiPlan.describePlan();

        SciencePlanFactory chileFactory = new ChilePlanFactory();
        SciencePlan chilePlan = chileFactory.createSciencePlan();
        chilePlan.describePlan();
    }
}
