public class SwitchCaseExample1 {
    public static void main(String args[]) {
        int num = 2;
        switch(num + 2) {
            case 1: 
                System.out.println("Case1: Value is: " + num); 
                break;
            case 2:
                System.out.println("Case2: Value is: " + num); 
                break;
            case 4: // Changed from 3 to 4 to actually match your math
                System.out.println("Case4: Value is: " + num); 
                break;
            default:
                System.out.println("Default: Value is: " + num);
        }
    }
}