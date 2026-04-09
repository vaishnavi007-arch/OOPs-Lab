interface Employee {
    void work();
    double getSalary();
}

class Manager implements Employee {
    private double salary = 50000;

    public void work() {
        System.out.println("Manager manages team");
    }

    public double getSalary() {
        return salary;
    }
}

class Developer implements Employee {
    private double salary = 30000;

    public void work() {
        System.out.println("Developer writes code");
    }

    public double getSalary() {
        return salary;
    }
}

public class main_class {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        e1.work();
        System.out.println("Salary: " + e1.getSalary());

        Employee e2 = new Developer();
        e2.work();
        System.out.println("Salary: " + e2.getSalary());
    }
}