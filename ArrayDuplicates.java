import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        String[] inputArr = input.split(",");

        ArrayList<String> solution = new ArrayList<>();
        Collections.addAll(solution, inputArr);

        for (int i = 0; i<solution.size()-1; i++){
            for (int n = i+1; n<solution.size(); n++)
                if (solution.get(i).equals(solution.get(n))){
                    solution.remove(n);
                    n--;
            }
        }

        for (int i = 0; i<solution.size(); i++){
            if(i<solution.size()-1) {
                System.out.print(solution.get(i) + ",");
            } else{
                System.out.print(solution.get(i));
            }

        }
    }
}

