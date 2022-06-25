import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi = input.nextInt();
        System.out.print("4'un katlari: ");
        for (int i = 1; i < sayi; i *= 4) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("5'in katlari: ");
        for (int i = 1; i < sayi; i *= 5) {
            System.out.print(i + " ");
        }
    }
}