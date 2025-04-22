//package th.ac.mahidol.ict.gemini.model;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class HawaiiSciencePlan extends SciencePlan {
//
//    private final String telescope = "Hawaii";
//
//    public HawaiiSciencePlan(String planID, String planName, Astronomer creator, float funding, String objective,
//                             String startDate, String endDate, String target, String status,
//                             DataProcessingRequirement dataProcessingRequirement) {
//        super(planID, planName, creator, funding, objective, startDate, endDate, target, status, dataProcessingRequirement);
//    }
//
//    public String getTelescope() {
//        return telescope;
//    }
//
//    @Override
//    public Map<String, Object> getDetails() {
//        Map<String, Object> details = super.getDetails();
//        details.put("telescope", telescope);
//        return details;
//    }
//}
