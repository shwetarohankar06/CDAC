public class ArrayManipulation {

    public static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n + 1];
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            int value = query[2];

            arr[start - 1] += value;  
            if (end < n) {
                arr[end] -= value;  
            }
        }

        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
        }

        return max;  
    }

    public static void main(String[] args) {
        // Test Case 1
        int n1 = 5;
        int[][] queries1 = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};
        System.out.println("Maximum value for(T1): " +arrayManipulation(n1, queries1));

        // Test Case 2
        int n2 = 4;
        int[][] queries2 = {{1, 3, 50}, {2, 4, 70}};
        System.out.println("Maximum value for(T2): " + arrayManipulation(n2, queries2));
    }
}

			
	