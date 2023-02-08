import java.util.Arrays;
import java.util.Scanner;

public class FindLargestRemake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (N>=3 && N<=20){
            int[] sequence = new int[N];
            for (int i =0; i<N; i++){
                int next = in.nextInt();
                if(next>=-500 && next<=500) {
                    sequence[i] = next;
                }
            }
            Arrays.sort(sequence);
            System.out.println(sequence[N-1] + ", " + sequence[N-2] + " and " + sequence[N-3]);
        }
    }
}
