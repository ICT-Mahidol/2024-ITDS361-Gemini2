package th.ac.mahidol.ict.gemini.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class SciencePlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // เป็น ID ที่ใช้สำหรับการอ้างอิงในฐานข้อมูล

    private String planID;
    private String planName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creator_id")
    private Astronomer creator;  // การเชื่อมโยงกับ Astronomer

    private float funding;
    private String objective;

    private String target;
    private String status;

    // การใช้งาน LocalDate สำหรับ startDate และ endDate
    private LocalDate startDate;
    private LocalDate endDate;

    // เชื่อมโยงกับ DataProcRequirement
    @OneToMany(mappedBy = "sciencePlan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DataProcRequirement> dataProcRequirements;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlanID() {
        return planID;
    }

    public void setPlanID(String planID) {
        this.planID = planID;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public Astronomer getCreator() {
        return creator;
    }

    public void setCreator(Astronomer creator) {
        this.creator = creator;
    }

    public float getFunding() {
        return funding;
    }

    public void setFunding(float funding) {
        this.funding = funding;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<DataProcRequirement> getDataProcRequirements() {
        return dataProcRequirements;
    }

    public void setDataProcRequirements(List<DataProcRequirement> dataProcRequirements) {
        this.dataProcRequirements = dataProcRequirements;
    }
}
