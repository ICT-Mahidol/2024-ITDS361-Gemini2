package th.ac.mahidol.ict.gemini.model;

import edu.gemini.app.ocs.model.StarSystem;
import edu.gemini.app.ocs.model.SciencePlan.TELESCOPELOC;
import th.ac.mahidol.ict.gemini.model.DataProcRequirementDTO;

public class SciencePlanDTO {
    public String creator;
    public String planID;
    public String planName;
    public String submitter;
    public double fundingInUSD;
    public String objectives;
    public String starSystem;
    public String startDate;
    public String endDate;
    public String telescopeLocation;
    public DataProcRequirementDTO dataProcRequirement;
}