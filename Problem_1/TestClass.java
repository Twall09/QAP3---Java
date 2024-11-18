public class TestClass {
    public static void main(String[] args) {
        // Constructing all of the classes...

        System.out.println();
        System.out.println("Person Class");
        Person mark = new Person("Mark", 65, "M");
        System.out.println(mark);

        System.out.println();
        System.out.println("Student Class");
        Student connor = new Student("Connor McDavid", 16, "M", "HS97071", 3.5);
        System.out.println(connor);

        System.out.println();
        System.out.println("Teacher Class");
        Teacher msRose = new Teacher("Claire Rose", 34, "F", "Computer Science", 60000);
        System.out.println(msRose);

        System.out.println();
        System.out.println("College Student Class");
        College keyin = new College("John Doe", 23, "M", "KC2024", 4.0, 2, "Software Development");
        System.out.println(keyin);
        System.out.println();
    }
}

