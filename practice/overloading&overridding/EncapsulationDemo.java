//Problem:
//Create a class Student with:
//- Private variables: name, rollNumber.
//- Public methods: setName(), getName(), setRollNumber(), //getRollNumber().
//Write a program to:
//- Set values for a student.
//- Print them using getters.

class Student {
    private String name;
    private int rollNumber;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public int getRollNumber() {
        return rollNumber;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Vaishnavi");
        s.setRollNumber(101);

        System.out.println("Student Name: " + s.getName());
        System.out.println("Roll Number: " + s.getRollNumber());
    }
}
