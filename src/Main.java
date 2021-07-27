import model.Student;

import java.lang.reflect.Field;

public class Main
{
    public static void main(String[] args)
    {
        Student student = new Student("David Toribio", 18, "male", "123456");
        System.out.println("Student value declared on Constructor: ");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Gender: " + student.getGender());
        System.out.println("ID Number: " + student.getIdentificationNumber());


        System.out.println("\nStudent value declared after calling class methods(set/get): ");
        Student student2 = new Student();
        student2.setName("David");
        student2.setAge(18);
        student2.setGender("Male");
        student2.setIdentificationNumber("654321");

        System.out.println("Name: " + student2.getName());
        System.out.println("Age: " + student2.getAge());
        System.out.println("Gender: " + student2.getGender());
        System.out.println("ID Number: " + student2.getIdentificationNumber());

        System.out.println("\nStudent Attribute Names: ");
        for (Field fieldValue: Student.class.getDeclaredFields())
        {
            System.out.println(fieldValue.getName());
        }
    }
}
