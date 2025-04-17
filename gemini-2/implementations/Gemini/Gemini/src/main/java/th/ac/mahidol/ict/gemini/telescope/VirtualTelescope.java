public class VirtualTelescope {

    // Attributes
    private String telescopeID;
    private String location;
    private String status;

    // Constructor
    public VirtualTelescope(String telescopeID, String location, String status) {
        this.telescopeID = telescopeID;
        this.location = location;
        this.status = status;
    }

    // Getters and Setters
    public String getTelescopeID() {
        return telescopeID;
    }

    public void setTelescopeID(String telescopeID) {
        this.telescopeID = telescopeID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Methods
    public void loadSciencePlan(SciencePlan plan) {
        // Logic to load the science plan
        System.out.println("Science plan loaded: " + plan);
    }

    public TestResult runTest(SciencePlan plan) {
        // Logic to run a test
        System.out.println("Running test on: " + plan);
        return new TestResult("Success"); // return mock result
    }

    public String generateTestReport(SciencePlan plan) {
        // Logic to generate a test report
        return "Test Report for Plan: " + plan.toString();
    }
}
