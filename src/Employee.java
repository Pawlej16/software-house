public class Employee {

    private String employeeId;
    private String firstName;
    private String lastName;
    private double baseSalary;

    public Employee(String employeeId, String firstName, String lastName, double baseSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }

    public final String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName()  { return firstName; }
    public String getLastName()   { return lastName; }
    public double getBaseSalary() { return baseSalary; }

    public double calculateMonthlyCost() {
        return baseSalary;
    }

    public String introduceYourself() {
        return "Hi, I am " + firstName + " " + lastName + " (ID: " + employeeId + ").";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + " [id=" + employeeId
                + ", name=" + firstName + " " + lastName
                + ", baseSalary=" + baseSalary + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return employeeId.equals(other.employeeId);
    }

    @Override
    public int hashCode() {
        return employeeId.hashCode();
    }
}