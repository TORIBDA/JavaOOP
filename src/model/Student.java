package model;
import java.lang.String;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String identificationNumber;

    public Student()
    {
        //Do something
    }
    public Student(String nameValue, int ageValue, String genderValue, String identificationNumberValue)
    {
        name = nameValue;
        age = ageValue;
        gender = genderValue;
        identificationNumber = identificationNumberValue;
    }
    public String getName()
    {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }
}
