public class Student extends Person {
    protected String myIdNum;  
    protected double myGPA;    

    // Also a template we were given in the problem

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender); // Call the superclass to inherit other variables
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Adding the gets and sets for the variables
    public String getIdNum() {
        return myIdNum;
    }

    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public double getGPA() {
        return myGPA;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    // toString
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}

