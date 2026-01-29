import java.util.*;
class StudentsInfo{
public static void main(String agrs[]){
Scanner input = new Scanner (System.in);
System.out.println("\t\t\tBASIC STUDENT INFO");
System.out.println("Enter your name: ");
String name = input.nextLine();
System.out.println("Enter your roll no: ");
int roll = input.nextInt();
System.out.print("Enter your SGPA: ");
double sgpa = input.nextDouble();
System.out.println("Are you a hosteller?: ");
boolean h = input.nextBoolean();
System.out.println("NAME: "+ name);
System.out.println("ROLL NO: "+roll);
System.out.println("sgpa: "+sgpa);
System.out.println("HOSTELLER: "+h);
}}
