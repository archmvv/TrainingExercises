import java.util.Scanner;

public class VowelToLengthRatio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        int howMany = Integer.parseInt(number);

        if(howMany>=1 && howMany<=20) {
            String[] foods = new String[howMany];

            for (int i = 0; i < howMany; i++) {
                String next = in.nextLine();
                foods[i] = next;
            }

            double savedRatio = 0;
            double nextRatio = 0;

            String input = foods[0];
            int inputVowels = 0;
            int inputLength = input.length();
            for (int i = 0; i < inputLength; i++) {
                char found = input.charAt(i);
                if (found == 'a' || found == 'e' || found == 'i' || found == 'o' || found == 'u') {
                    inputVowels++;
                }
                savedRatio = inputVowels / (inputLength * 1.00);
            }
            for (int j = 1; j < foods.length; j++) {
                String nextInput = foods[j];
                int nextVowels = 0;
                int nextLength = nextInput.length();
                for (int i = 0; i < nextLength; i++) {
                    char found = nextInput.charAt(i);
                    if (found == 'a' || found == 'e' || found == 'i' || found == 'o' || found == 'u') {
                        nextVowels++;
                    }
                }
                nextRatio = nextVowels / (nextLength * 1.00);
                if (nextRatio < savedRatio) {
                    input = nextInput;
                    savedRatio = nextRatio;
                    inputVowels = nextVowels;
                    inputLength = nextLength;
                }
                if (nextRatio == savedRatio) {
                    if (nextVowels > inputVowels) {
                        input = nextInput;
                        savedRatio = nextRatio;
                        inputVowels = nextVowels;
                        inputLength = nextLength;
                    }
                }
                    if (nextRatio == savedRatio && nextVowels == inputVowels) {
                       if(nextLength > inputLength) {
                           input = nextInput;
                           savedRatio = nextRatio;
                           inputVowels = nextVowels;
                           inputLength = nextLength;
                       }
                    }
            }

//            int vowels = 0;
//            int length = input.length();
//
//            for (int i = 0; i < input.length(); i++) {
//                char found = input.charAt(i);
//                if (found == 'a' || found == 'e' || found == 'i' || found == 'o' || found == 'u') {
//                    vowels++;
//                }
//            }
//        }
            System.out.println(input + " " + inputVowels + "/" + inputLength);
        }
    }
}
