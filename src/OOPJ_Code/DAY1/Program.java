package OOPJ_Code.DAY1;

public class Program {
    public static void main(String[] args) {
        // instantiates 4 different Person_v2 object
        // from the Person_v2 class
        Person_v3 john = new Person_v3("John", 1977, 'm', "teacher");
        Person_v3 mary = new Person_v3("Mary", 1969, 'f', "police");
        Person_v3 harry = new Person_v3("Harry", 2000, 'm', "student");
        Person_v3 jane = new Person_v3("Jane", 2001, 'f', "student");
        john.intro();
        mary.intro();
        harry.intro();
        jane.intro();
    }
}
