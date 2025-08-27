
import java.util.InputMismatchException;
import java.util.Scanner;

public class BMICalculator {
   public static void main(String[] args) {
    double weight = 0;
    double height = 0;
 try{
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your weight in kg: ");
    weight = scanner.nextDouble();
    System.out.print("Enter your height in cm: ");
    height = scanner.nextDouble();
    double bmi = weight / ((height / 100) * (height / 100));
    System.out.println("Your BMI is: " + bmi);
    if (bmi < 18) {
        System.out.println("You are underweight.");
    } else if (bmi >= 18 && bmi < 24.9) {
        System.out.println("You have a normal weight.");
    } else if (bmi >= 25 && bmi < 30.0) {
        System.out.println("You are overweight.");
    } else {
        System.out.println("You are obese.");
    }
   }
   catch(InputMismatchException ei){
    System.out.println("Invalid input. Please enter numeric values for weight and height.");
    
    try{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your weight in kg: ");
    weight = sc.nextDouble();
    System.out.print("Enter your height in cm: ");
    height = sc.nextDouble();
    double bmi = weight / ((height / 100) * (height / 100));
    System.out.println("Your BMI is: " + bmi);
    if (bmi < 18) {
        System.out.println("You are underweight.");
    } else if (bmi >= 18 && bmi < 24.9) {
        System.out.println("You have a normal weight.");
    } else if (bmi >= 25 && bmi < 30.0) {
        System.out.println("You are overweight.");
    } else {
        System.out.println("You are obese.");
    }
   }
   catch(InputMismatchException eia){
    System.out.println("Invalid input. Please enter numeric values for weight and height.");

     try{
    Scanner sca = new Scanner(System.in);
    System.out.print("Enter your weight in kg: ");
    weight = sca.nextDouble();
    System.out.print("Enter your height in cm: ");
    height = sca.nextDouble();
    double bmi = weight / ((height / 100) * (height / 100));
    System.out.println("Your BMI is: " + bmi);
    if (bmi < 18) {
        System.out.println("You are underweight.");
    } else if (bmi >= 18 && bmi < 24.9) {
        System.out.println("You have a normal weight.");
    } else if (bmi >= 25 && bmi < 30.0) {
        System.out.println("You are overweight.");
    } else {
        System.out.println("You are obese.");
    }
   }
   catch(InputMismatchException eio){
    System.out.println("Invalid input. Please enter numeric values for weight and height.");

 }   
   }
 
   }
 finally{
    System.out.println("End of line");
 }
}}
