public class Developer extends Employee {

    private String mainLanguage;
    private int repositoryCount;

    public Developer(String employeeId, String firstName, String lastName,
                     double baseSalary, String mainLanguage, int repositoryCount) {
        super(employeeId, firstName, lastName, baseSalary);
        this.mainLanguage = mainLanguage;
        this.repositoryCount = repositoryCount;
    }

    public String getMainLanguage()   {
        return mainLanguage; }
    public int getRepositoryCount()   {
        return repositoryCount; }

    @Override
    public double calculateMonthlyCost() {
        return getBaseSalary() * 1.10;
    }
    @Override
    public String introduceYourself() {
        return "Hi, I am " + getFirstName() + " " + getLastName()
                + ", a Developer specialising in " + mainLanguage
                + ". I manage " + repositoryCount + " repositories.";
    }

    public void printTechnologies() {
        System.out.println("--- Tech profile of " + getFirstName() + " " + getLastName() + " ---");
        System.out.println("  Primary language : " + mainLanguage);
        System.out.println("  Repositories     : " + repositoryCount);
        System.out.println("--------------------------------------------------");
    }
    @Override
    public String toString() {
        return super.toString()
                + " | language=" + mainLanguage
                + ", repos=" + repositoryCount;
    }
}