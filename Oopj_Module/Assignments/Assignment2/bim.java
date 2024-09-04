import java.util.*;
public class bim{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Height in CM: ");
        double heightInCm = scan.nextDouble();
        System.out.print("Enter a weight in KG: ");
        double weightInKg = scan.nextDouble();

        double heightInMeters = heightInCm / 100;
        
        double bmi = weightInKg / (heightInMeters * heightInMeters);
		
        System.out.printf("Your BMI score is: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Category: Normal weight");
        } else if (bmi >= 25.0 && bmi < 29.9) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obesity");
        }
    }
}

