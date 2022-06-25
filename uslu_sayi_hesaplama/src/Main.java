import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y, total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Ussu alinacak sayi: ");
        x = input.nextInt();
        System.out.print("Us olacak sayi: ");
        y = input.nextInt();

        for (int i = 1; i <= y ; i++) {
            total = total * x;
        }
        System.out.println("Cevap: "+total);
    }
}