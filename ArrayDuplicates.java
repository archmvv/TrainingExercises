import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDuplicates {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String[] numbers = input.split(",");
//        int[] numbersParsed = new int[numbers.length];
//
//        for (int i = 0; i<numbers.length;i++){
//            numbersParsed[i] = Integer.parseInt(numbers[i]);
//        }

        ArrayList<String> refined = new ArrayList<>();

        for (int k =0; k<numbers.length; k++){
            refined.add(numbers[k]);
        }

        for (int m = 0; m<refined.size(); m++){
            for (int n =m+1; n<refined.size(); n++){
                if (refined.get(m).equals(refined.get(n))){
                    refined.remove(n);
                    m--;
                }
            }
        }
        for (int i = 0; i < refined.size(); i++) {
            if(i != refined.size()-1){
                System.out.print(refined.get(i) +",");
            } else {
                System.out.println(refined.get(i));
            }
        }
    }
}
