class Student {
    private String name;
    private int marks;

    // Setter with validation
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks!");
        }
    }

    // Getter
    public int getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Main class
public class Student1 {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Alice");
        s.setMarks(85);

        System.out.println("Student: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    }
}