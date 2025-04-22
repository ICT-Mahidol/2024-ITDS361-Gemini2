//package th.ac.mahidol.ict.gemini.factory;
//
//import th.ac.mahidol.ict.gemini.model.Astronomer;
//import th.ac.mahidol.ict.gemini.model.DataProcessingRequirement;
//import th.ac.mahidol.ict.gemini.model.HawaiiSciencePlan;
//import th.ac.mahidol.ict.gemini.model.SciencePlan;
//
//import java.util.Map;
//
//public class HawaiiPlanFactory extends SciencePlanFactory {
//    @Override
//    public SciencePlan createSciencePlan(Map<String, Object> params) {
//        return new HawaiiSciencePlan(
//                (String) params.get("planID"),
//                (String) params.get("planName"),
//                (Astronomer) params.get("creator"),
//                (Float) params.get("funding"),
//                (String) params.get("objective"),
//                (String) params.get("startDate"),
//                (String) params.get("endDate"),
//                (String) params.get("target"),
//                (String) params.get("status"),
//                (DataProcessingRequirement) params.get("dataProcessingRequirement")
//        );
//    }
//}
