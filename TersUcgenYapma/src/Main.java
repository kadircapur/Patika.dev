import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayisini Giriniz: ");
        int bSayi = input.nextInt();

        for (int i = bSayi; i > 0; i--) {
            for (int k = bSayi - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = (2*i)-1; j>0 ; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}