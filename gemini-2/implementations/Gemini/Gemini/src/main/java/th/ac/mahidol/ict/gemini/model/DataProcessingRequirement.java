package th.ac.mahidol.ict.gemini.model;

import com.google.gson.Gson;

public class DataProcessingRequirement {

    private String fileType;
    private String fileQuality;
    private String colorType;
    private float contrast;
    private float brightness;
    private float saturation;
    private float highlights;
    private float exposure;
    private float shadows;
    private float whites;
    private float blacks;
    private float luminance;
    private float hue;

    public DataProcessingRequirement(String fileType, String fileQuality, String colorType, float contrast,
                                     float brightness, float saturation, float highlights, float exposure,
                                     float shadows, float whites, float blacks, float luminance, float hue) {
        this.fileType = fileType;
        this.fileQuality = fileQuality;
        this.colorType = colorType;
        this.contrast = contrast;
        this.brightness = brightness;
        this.saturation = saturation;
        this.highlights = highlights;
        this.exposure = exposure;
        this.shadows = shadows;
        this.whites = whites;
        this.blacks = blacks;
        this.luminance = luminance;
        this.hue = hue;
    }

    // === Getters and Setters ===
    public String getFileType() { return fileType; }
    public void setFileType(String fileType) { this.fileType = fileType; }

    public String getFileQuality() { return fileQuality; }
    public void setFileQuality(String fileQuality) { this.fileQuality = fileQuality; }

    public String getColorType() { return colorType; }
    public void setColorType(String colorType) { this.colorType = colorType; }

    public float getContrast() { return contrast; }
    public void setContrast(float contrast) { this.contrast = contrast; }

    public float getBrightness() { return brightness; }
    public void setBrightness(float brightness) { this.brightness = brightness; }

    public float getSaturation() { return saturation; }
    public void setSaturation(float saturation) { this.saturation = saturation; }

    public float getHighlights() { return highlights; }
    public void setHighlights(float highlights) { this.highlights = highlights; }

    public float getExposure() { return exposure; }
    public void setExposure(float exposure) { this.exposure = exposure; }

    public float getShadows() { return shadows; }
    public void setShadows(float shadows) { this.shadows = shadows; }

    public float getWhites() { return whites; }
    public void setWhites(float whites) { this.whites = whites; }

    public float getBlacks() { return blacks; }
    public void setBlacks(float blacks) { this.blacks = blacks; }

    public float getLuminance() { return luminance; }
    public void setLuminance(float luminance) { this.luminance = luminance; }

    public float getHue() { return hue; }
    public void setHue(float hue) { this.hue = hue; }

    // === Methods ===
    public boolean isValid() {
        // ตรวจสอบค่าที่ควรไม่เป็น null และตัวเลขให้อยู่ในช่วงที่เหมาะสม
        return fileType != null && fileQuality != null && colorType != null;
    }

    public boolean isCompatibleWithLegacyOCS() {
        // ตัวอย่าง: เงื่อนไขจำกัดสำหรับระบบเก่า
        return fileType.equalsIgnoreCase("JPEG") && fileQuality.equalsIgnoreCase("LOW");
    }

    public String toJSON() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public void updateProcessingRequirement() {

        if (fileQuality == null) fileQuality = "STANDARD";
        if (colorType == null) colorType = "sRGB";
        if (contrast == 0) contrast = 1.0f;

    }
}
