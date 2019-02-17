package stage03.hw51;

public class Main {
    public static void main(String[] args) {
        String[] skills = {"git", "Scala", "JBoss", "UML"};
        Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);

        String[] mlMethods = {"neural networks", "decision tree", "bayesian algorithms"};
        DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, mlMethods);
    }
}

class Employee {

    String name;
    String email;
    int experience;

    public Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public int getExperience() {
        return this.experience;
    }
}

class Developer extends Employee {

    String mainLanguage;
    String[] skills;

    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    public String getMainLanguage() {
        return this.mainLanguage;
    }

    public String[] getSkills() {
        return this.skills;
    }
}

class DataAnalyst extends Employee {

    boolean phd;
    String[] mlMethods;

    public DataAnalyst(String name, String email, int experience, boolean phd, String[] mlMethods) {
        super(name, email, experience);
        this.phd = phd;
        this.mlMethods = mlMethods;
    }

    public boolean isPhD() {
        return this.phd;
    }

    public String[] getMethods() {
        return this.mlMethods;
    }
}