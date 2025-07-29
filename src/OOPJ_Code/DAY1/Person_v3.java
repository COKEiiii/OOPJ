package OOPJ_Code.DAY1;
import java.time.LocalDate;
public class Person_v3 {
    private String name;
    private int yob;
    private char gender;
    private String job;

    public Person_v3(String _name, int _yob, char _gender, String _job) {
        name = _name;
        yob = _yob;
        gender = _gender;
        job = _job;
    }
    public String getAge() {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear-yob;
        return Integer.toString(age);
    }
    public void intro() {
        String genderStr = (gender == 'm') ? "Male" : "Female";
        if (genderStr.equals("Male")) {
            System.out.printf("%s, %s, %s%n", name, getAge(), job);
        }else{
            System.out.printf("%s, %s%n", name, job);
        }
    }
}