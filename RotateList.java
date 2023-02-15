import java.util.Scanner;

public class RotateList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String numbers = in.nextLine();
        String N = in.nextLine();

        String[] arrNumbers = numbers.split(",");

        int[] arr = new int[arrNumbers.length];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(arrNumbers[i]);
        }

        int n = Integer.parseInt(N);

        while(n>0) {

            int help = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = help;
            n--;
        }

        for (int i = 0; i < arr.length; i++) {
            if(i !=arr.length-1) {
                System.out.print(arr[i] + ",");
            }
            else {
                System.out.print(arr[i]);
            }
        }

        }

    }

