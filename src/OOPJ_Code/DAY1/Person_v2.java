package OOPJ_Code.DAY1;

public class Person_v2 {
  // attributes
  private String name;
  private int age;
  private char gender;
  private double height;

  // the constructor of the class Person_v2
  public Person_v2(String _name, int _age, char _gender, double _height) {
    // init the inputs from the "outside" to the internal attributes
    name = _name;
    age = _age;
    gender = _gender;
    height = _height;
  }

  // a method to introduce itself
  public void intro() {
    String genderStr = (gender == 'm') ? "Male" : "Female";

    System.out.printf("%s, %d, %s, %.1fm.\n", 
        name, age, genderStr, height); 
  }
}




