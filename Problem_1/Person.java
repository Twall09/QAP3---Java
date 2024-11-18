public class Person {
    protected String myName;    
    protected int myAge;        
    protected String myGender;  

    // template we were given in the beginning of the problem.

   
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // Adding the gets and sets for the variables
    public String getName() {
        return myName;
    }

    public void setName(String name) {
        myName = name;
    }

    public int getAge() {
        return myAge;
    }

    public void setAge(int age) {
        myAge = age;
    }

    public String getGender() {
        return myGender;
    }

    public void setGender(String gender) {
        myGender = gender;
    }

    // toString
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}
