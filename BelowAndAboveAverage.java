import java.util.ArrayList;
import java.util.Scanner;

public class BelowAndAboveAverage {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        String[] inputBefore = input.split(",");

        double[] inputAfter = new double[inputBefore.length];

        ArrayList<Double> below= new ArrayList<>();
        ArrayList<Double> equal = new ArrayList<>();
        ArrayList<Double> above = new ArrayList<>();


        for (int i = 0; i < inputBefore.length; i++) {
            inputAfter[i] = Double.parseDouble(inputBefore[i]);
        }
        double average = 0;
        double sum = 0;

        for (int i = 0; i<inputAfter.length; i++){
            sum = sum + inputAfter[i];
            average = sum / inputAfter.length;
        }

        for (int i = 0; i < inputAfter.length; i++) {
            if (inputAfter[i] > average){
                above.add(inputAfter[i]);
            } else if (inputAfter[i] < average){
                below.add(inputAfter[i]);
            } else {
                equal.add(inputAfter[i]);
            }
        }

        System.out.printf("avg: %.2f \n", average);

        System.out.print("below: ");
        for (int i = 0; i<below.size(); i++){

            if(i<below.size()-1) {
                System.out.printf("%.0f,", below.get(i));
            } else{
                System.out.printf("%.0f \n",below.get(i));
            }
        }

        System.out.print("above: ");
        for (int i = 0; i < above.size(); i++) {

            if(i<above.size()-1) {
                System.out.printf("%.0f,",above.get(i));
            } else{
                System.out.printf("%.0f",above.get(i));
            }
        }

    }
}
