public class Main {

    public static void main(String[] args) {

        ProjectTeam team = new ProjectTeam("Campus App");

        Employee e1 = new Developer("E-101", "Anna",    "May",   12000.0, "Java",   4);
        Employee e2 = new Tester(   "E-201", "Peter",   "Fox",    9800.0, true,    25);
        Employee e3 = new Developer("E-102", "Charles", "Smith", 11500.0, "Kotlin", 3);
        Employee e4 = new Tester(   "E-202", "Laura",   "Green",  8500.0, false,   40);

        team.addEmployee(e1);
        team.addEmployee(e2);
        team.addEmployee(e3);
        team.addEmployee(e4);

        team.printTeamMembers();

        System.out.printf("Total monthly team cost: %.2f%n%n", team.calculateTotalCost());

        System.out.println("== Individual introductions ==");
        System.out.println(e1.introduceYourself());
        System.out.println(e2.introduceYourself());
        System.out.println();

        if (e1 instanceof Developer) {
            Developer developer = (Developer) e1;
            developer.printTechnologies();
        }

        team.printDevelopers();
        team.printAutomationTesters();

        System.out.println("== equals() comparison ==");
        Tester sameId      = new Tester("E-201", "Other", "Data", 9000.0, false, 10);
        Tester differentId = new Tester("E-999", "Other", "Data", 9000.0, false, 10);
        System.out.println("e2.equals(same ID, different data) : " + e2.equals(sameId));
        System.out.println("e2.equals(different ID)            : " + e2.equals(differentId));
        System.out.println();

        System.out.println("== toString() output ==");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println();

        System.out.println("== final method getEmployeeId() ==");
        System.out.println("ID of e1: " + e1.getEmployeeId());
        System.out.println("ID of e2: " + e2.getEmployeeId());
        System.out.println();

        Employee found = team.findById("E-102");
        if (found != null) {
            System.out.println("Found by ID E-102: " + found);
        }
    }
}