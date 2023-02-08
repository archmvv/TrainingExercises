import java.util.Scanner;

public class MatrixNumbersRemake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int chislo= input;
        int red = input;

        for (int i=1; i<=red; i++){
            for (int j=0; j< chislo; j++){
                System.out.print(j+i + " ");
            }
            System.out.println();
        }



    }
}
