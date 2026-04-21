import java.util.ArrayList;
public class ProjectTeam {

    private String projectName;
    private ArrayList<Employee> employees;
    public ProjectTeam(String projectName) {
        this.projectName = projectName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void printTeamMembers() {
        System.out.println("========== Team: " + projectName + " ==========");
        for (Employee e : employees) {
            System.out.println(e.introduceYourself());
            System.out.printf("  Monthly cost: %.2f%n", e.calculateMonthlyCost());
        }
        System.out.println("================================================");
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Employee e : employees) {
            total += e.calculateMonthlyCost();
        }
        return total;
    }
    public Employee findById(String employeeId) {
        for (Employee e : employees) {
            if (e.getEmployeeId().equals(employeeId)) {
                return e;
            }
        }
        return null;
    }

    public void printDevelopers() {
        System.out.println("--- Developers on project: " + projectName + " ---");
        for (Employee e : employees) {
            if (e instanceof Developer) {
                Developer dev = (Developer) e;
                dev.printTechnologies();
            }
        }
    }
    public void printAutomationTesters() {
        System.out.println("--- Automation Testers on project: " + projectName + " ---");
        for (Employee e : employees) {
            if (e instanceof Tester) {
                Tester tester = (Tester) e;
                if (tester.isAutomationTester()) {
                    tester.runTestingReport();
                }
            }
        }
    }
}
