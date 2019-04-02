package main.java.itdvn;

public class Main {
    public static void main(String[] args) {

        int [] arr = {3, 2,64,11,9,32,700,9,15,99,15,85,6,85};
        int temp;
        int iterationCount = 0;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                iterationCount++;
            }
        }

        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println("\nArr size: " + arr.length + "\nIterations: " + iterationCount);
    }
}
