import java.util.ArrayList;
import java.util.Scanner;

public class ExamNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstX = in.nextInt();
        int lastY = in.nextInt();
        ArrayList<Integer> allThoseNumbers = new ArrayList<>();

        int desiredSum = in.nextInt();

        for (int i = firstX; i<= lastY; i++){
            int firstDigit = i / 100;
            int secondDigit = (i % 100) / 10;
            int thirdDigit = i % 10;
            int digitSum = firstDigit + secondDigit + thirdDigit;
            if(digitSum == desiredSum){
                allThoseNumbers.add(i);
            }
        }

        for (int k = 0; k < allThoseNumbers.size(); k++){
            System.out.println(allThoseNumbers.get(k));
        }


    }
}
