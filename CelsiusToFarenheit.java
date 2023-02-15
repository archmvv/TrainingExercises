import java.util.Scanner;

public class CelsiusToFarenheit {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String[] entrance = input.split(" ");

        double[] numbers = new double[entrance.length];
        for (int i = 0; i<numbers.length; i++){
            numbers[i] = Double.parseDouble(entrance[i]);
        }

        double[] numbersConverted = new double[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numbersConverted[i] = (numbers[i]) * 1.8 + 32;
        }

        for (int i = 0; i<numbersConverted.length; i++){
            int help = (int) Math.round(numbersConverted[i]);
            System.out.printf("%d \n", help);
        }

    }
}
