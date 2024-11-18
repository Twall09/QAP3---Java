public class Teacher extends Person {
    private String mySubject;  
    private double mySalary;   

    // Teacher class from Task 3

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender); // Call the superclass to inherit other variables 
        mySubject = subject;
        mySalary = salary;
    }

    // Adding the gets and sets for the variables
    public String getSubject() {
        return mySubject;
    }

    public void setSubject(String subject) {
        mySubject = subject;
    }

    public double getSalary() {
        return mySalary;
    }

    public void setSalary(double salary) {
        mySalary = salary;
    }

    // toString
    public String toString() {
        return super.toString() + ", Subject: " + mySubject + ", Salary: " + mySalary;
    }
}

