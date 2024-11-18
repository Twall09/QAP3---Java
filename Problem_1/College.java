public class College extends Student {
    private String myMajor; 
    private int myYear;     

    // College student from Task 4

    public College(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa); // Call the superclass to inherit other variables
        myYear = year;
        myMajor = major;
    }

    // Adding the gets and sets for the variables
    public String getMajor() {
        return myMajor;
    }

    public void setMajor(String major) {
        myMajor = major;
    }

    public int getYear() {
        return myYear;
    }

    public void setYear(int year) {
        myYear = year;
    }

    // toString
    public String toString() {
        return super.toString() + ", Year: " + myYear + ", Major: " + myMajor;
    }
}

