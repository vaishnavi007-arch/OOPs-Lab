import java.util.Scanner;


class Father {
    protected double landArea;
    protected String propertyType;

  
    Father(double landArea, String propertyType) {
        this.landArea = landArea;
        this.propertyType = propertyType;
    }

    void showProperty() {
        System.out.println("Total Land Area: " + landArea + " acres");
        System.out.println("Property Type: " + propertyType);
    }
}

class ChildOne extends Father {
    private String usage;

    ChildOne(double landArea, String propertyType, String usage) {
        super(landArea, propertyType);
        this.usage = usage;
    }

    void showUsage() {
        System.out.println("\n--- Child One Details ---");
        showProperty();
        System.out.println("Usage: " + usage);
    }
}


class ChildTwo extends Father {
    private String usage;

    ChildTwo(double landArea, String propertyType, String usage) {
        super(landArea, propertyType);
        this.usage = usage;
    }

    void showUsage() {
        System.out.println("\n--- Child Two Details ---");
        showProperty();
        System.out.println("Usage: " + usage);
    }
}


public class Property {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter total land area (in acres): ");
        double landArea = sc.nextDouble();
        sc.nextLine();  

        System.out.print("Enter property type: ");
        String propertyType = sc.nextLine();

        
        System.out.print("Enter usage for Child One: ");
        String usage1 = sc.nextLine();

        System.out.print("Enter usage for Child Two: ");
        String usage2 = sc.nextLine();


        ChildOne child1 = new ChildOne(landArea, propertyType, usage1);
        ChildTwo child2 = new ChildTwo(landArea, propertyType, usage2);

     
        child1.showUsage();
        child2.showUsage();

        sc.close();
    }
}