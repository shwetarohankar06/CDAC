package exe.java;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TollBooth manager = null;
        while (true) {
            TollBoothUtil.menuList();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
  
                case 1:
                    manager = TollBoothUtil.acceptRecord();
                    break;
                case 2:
                    if (manager != null) {
                        TollBoothUtil.printRecord(manager);
                    } else {
                        System.out.println("Please enter toll rates and vehicle counts first.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
    }
}


