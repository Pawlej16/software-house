public class Tester extends Employee {

    private boolean automationTester;
    private int scenarioCount;

    public Tester(String employeeId, String firstName, String lastName,
                  double baseSalary, boolean automationTester, int scenarioCount) {
        super(employeeId, firstName, lastName, baseSalary);
        this.automationTester = automationTester;
        this.scenarioCount = scenarioCount;
    }

    public boolean isAutomationTester() { return automationTester; }
    public int getScenarioCount()        { return scenarioCount; }

    @Override
    public double calculateMonthlyCost() {
        double bonus = automationTester ? 1.15 : 1.05;
        return getBaseSalary() * bonus;
    }
    @Override
    public String introduceYourself() {
        String type = automationTester ? "automation" : "manual";
        return "Hi, I am " + getFirstName() + " " + getLastName()
                + ", a " + type + " Tester with " + scenarioCount + " test scenarios.";
    }
    public void runTestingReport() {
        System.out.println("--- Testing report for " + getFirstName() + " " + getLastName() + " ---");
        System.out.println("  Type            : " + (automationTester ? "Automation" : "Manual"));
        System.out.println("  Test scenarios  : " + scenarioCount);
        System.out.println("  Monthly cost    : " + String.format("%.2f", calculateMonthlyCost()));
        System.out.println("--------------------------------------------------");
    }
    @Override
    public String toString() {
        return super.toString() + " | automation=" + automationTester + ", scenarios=" + scenarioCount;
    }
}
