package th.ac.mahidol.ict.gemini.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SciencePlan {

    protected String planID;
    protected String planName;
    protected Astronomer creator;
    protected float funding;
    protected String objective;
    protected String startDate;
    protected String endDate;
    protected String target;
    protected String status; // Created, Tested, Submitted

    protected DataProcessingRequirement dataProcessingRequirement;

    public SciencePlan(String planID, String planName, Astronomer creator, float funding,
                       String objective, String startDate, String endDate, String target, String status,
                       DataProcessingRequirement dataProcessingRequirement) {
        this.planID = planID;
        this.planName = planName;
        this.creator = creator;
        this.funding = funding;
        this.objective = objective;
        this.startDate = startDate;
        this.endDate = endDate;
        this.target = target;
        this.status = status;
        this.dataProcessingRequirement = dataProcessingRequirement;
    }

    // === Getter & Setter ===
    public String getPlanID() { return planID; }
    public void setPlanID(String planID) { this.planID = planID; }

    public String getPlanName() { return planName; }
    public void setPlanName(String planName) { this.planName = planName; }

    public Astronomer getCreator() { return creator; }
    public void setCreator(Astronomer creator) { this.creator = creator; }

    public float getFunding() { return funding; }
    public void setFunding(float funding) { this.funding = funding; }

    public String getObjective() { return objective; }
    public void setObjective(String objective) { this.objective = objective; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }

    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }

    public String getTarget() { return target; }
    public void setTarget(String target) { this.target = target; }

    public String getStatus() { return status; }

    public void setStatus(String status) {
        if (status.equals("Created") || status.equals("Tested") || status.equals("Submitted")) {
            this.status = status;
        }
    }

    public DataProcessingRequirement getDataProcess() {
        return this.dataProcessingRequirement;
    }

    public void setDataProcessingRequirement(DataProcessingRequirement dpr) {
        this.dataProcessingRequirement = dpr;
    }

    // === Methods ===

    public boolean validateInput() {
        return planID != null && !planID.isEmpty()
                && planName != null && !planName.isEmpty()
                && creator != null
                && funding >= 0
                && objective != null && !objective.isEmpty()
                && startDate != null && endDate != null
                && target != null && !target.isEmpty();
    }

    public boolean isCompatibleWithLegacyOCS() {
        return dataProcessingRequirement != null && dataProcessingRequirement.isValid();
    }

    public Map<String, Object> getDetails() {
        Map<String, Object> details = new HashMap<>();
        details.put("planID", planID);
        details.put("planName", planName);
        details.put("creator", creator.getUsername());
        details.put("funding", funding);
        details.put("objective", objective);
        details.put("startDate", startDate);
        details.put("endDate", endDate);
        details.put("target", target);
        details.put("status", status);
        return details;
    }

    public boolean checkDateRange() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date start = sdf.parse(startDate);
            Date end = sdf.parse(endDate);
            return !start.after(end);
        } catch (ParseException e) {
            return false;
        }
    }

}
