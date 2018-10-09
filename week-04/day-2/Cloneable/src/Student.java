/*Create a Student class that has the same fields and methods as the Person class, and has the following additional fields:
        previousOrganization: the name of the student’s previous company / school
        skippedDays: the number of days skipped from the course
        methods:
        getGoal(): prints out "Be a junior software developer."
        introduce(): "Hi, I'm name, a age year old gender from previousOrganization who skipped skippedDays days from the course already."
        skipDays(numberOfDays): increases skippedDays by numberOfDays
        The Student class has the following constructors:
        Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
        Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0*/

public class Student extends Person implements Cloneable {
    String previousOrganisation;
    int skippedDays;

    public void introduce() {
        System.out.println("Hi, I'm " +name +", a " +age +" year old " +gender +" from " +previousOrganisation +" who skipped " +skippedDays +" days of the course already.");
    }
    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }
    public void skipDays(int numberOfDays){
        this.skippedDays += numberOfDays;
    }
    public Student(String name, int age, String gender, String previousOrganisation) {
        super(name, age, gender);
        this.previousOrganisation = previousOrganisation;
        this.skippedDays = 0;
    }
    public Student(){
        this.previousOrganisation = "The School of Life";
        this.skippedDays = 0;
    }
    // BUD
    public Object clone()throws CloneNotSupportedException {
        return super.clone();
    }
    // A NEBO
    public Student cloning() {
        Student X = new Student(name, age, gender, this.previousOrganisation);
        return X;
    }
}