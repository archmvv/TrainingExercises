import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int thisNumber = in.nextInt();
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i =2; i<=thisNumber; i++) {
            primes.add(i);
        }
//      System.out.println(primes);
        for(int k = 2; k <= thisNumber/2; k++){
                for (int n = 2; n <= thisNumber/2; n++){
                   for(int j = 0; j<primes.size(); j++){
                   if (primes.get(j) == n * k){
                       primes.remove(j);
                   }
                   }
                }
                }
//      System.out.println(primes);
        ArrayList<Integer> contents = new ArrayList<>();
        int check = thisNumber;

            for (int f = 0; f < primes.size() && check>2; f++) {
                int help = primes.get(f);
                   if(check % help ==0) {
                       contents.add(help);
                       check = check / help;
                       f = f-1;
                   }

            }


        for (int i = 0; i< contents.size();i++){
            System.out.println(contents.get(i));
        }
    }
}
