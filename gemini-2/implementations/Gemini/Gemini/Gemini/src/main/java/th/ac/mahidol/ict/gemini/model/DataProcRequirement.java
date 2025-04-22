package th.ac.mahidol.ict.gemini.model;

import jakarta.persistence.*;

@Entity
public class DataProcRequirement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileType;
    private String fileQuality;
    private String colorType;
    private String contrast;
    private String brightness;
    private String saturation;
    private String highlights;
    private String exposure;
    private String shadows;
    private String whites;
    private String blacks;
    private String luminance;
    private String hue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "science_plan_id")
    private SciencePlan sciencePlan;  // เชื่อมโยงกับ SciencePlan

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileQuality() {
        return fileQuality;
    }

    public void setFileQuality(String fileQuality) {
        this.fileQuality = fileQuality;
    }

    public String getColorType() {
        return colorType;
    }

    public void setColorType(String colorType) {
        this.colorType = colorType;
    }

    public String getContrast() {
        return contrast;
    }

    public void setContrast(String contrast) {
        this.contrast = contrast;
    }

    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    public String getSaturation() {
        return saturation;
    }

    public void setSaturation(String saturation) {
        this.saturation = saturation;
    }

    public String getHighlights() {
        return highlights;
    }

    public void setHighlights(String highlights) {
        this.highlights = highlights;
    }

    public String getExposure() {
        return exposure;
    }

    public void setExposure(String exposure) {
        this.exposure = exposure;
    }

    public String getShadows() {
        return shadows;
    }

    public void setShadows(String shadows) {
        this.shadows = shadows;
    }

    public String getWhites() {
        return whites;
    }

    public void setWhites(String whites) {
        this.whites = whites;
    }

    public String getBlacks() {
        return blacks;
    }

    public void setBlacks(String blacks) {
        this.blacks = blacks;
    }

    public String getLuminance() {
        return luminance;
    }

    public void setLuminance(String luminance) {
        this.luminance = luminance;
    }

    public String getHue() {
        return hue;
    }

    public void setHue(String hue) {
        this.hue = hue;
    }

    public SciencePlan getSciencePlan() {
        return sciencePlan;
    }

    public void setSciencePlan(SciencePlan sciencePlan) {
        this.sciencePlan = sciencePlan;
    }
}
