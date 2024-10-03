import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int newLength = removeDuplicates(nums);
        System.out.println("New length of the array: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int newIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[newIndex - 1]) {
                nums[newIndex] = nums[i];
                newIndex++;
            }
        }
        return newIndex;
    }
}
