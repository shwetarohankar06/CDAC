package exe.java;

import java.util.Scanner;

public class BMITrackerrUtil {
    private Scanner sc = new Scanner(System.in);

    public BMITrackerr acceptRecord() {
        System.out.print("Enter weight : ");
        double weight = sc.nextDouble();
        System.out.print("Enter height : ");
        double height = sc.nextDouble();
        return new BMITrackerr(weight, height);
    }

    public void printRecord(BMITrackerr tracker) {
        System.out.println(tracker);
    }

    // Method to display the menu
    public void menuList() {
        System.out.println("1. Calculate BMI");
        System.out.println("2. Display Last BMI Record");
        System.out.println("3. Exit");
    }
}

