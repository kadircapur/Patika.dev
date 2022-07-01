import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {0, 19, 36, 22, 35, 26, 25, 29, 18, 18, 36, 38, 7, 37, 8, 8};
        int[] equalNumbers = new int[numbers.length];
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    if (numbers[i] % 2 == 0) {
                        equalNumbers[counter++] = numbers[i];
                        break;
                    }
                }
            }
        }


        System.out.println(Arrays.toString(equalNumbers));
    }
}