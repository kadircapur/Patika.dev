import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Faktoriyel Sayisi: ");
        n = input.nextInt();

        for (int i=1; i <= n ; i++){
            total = total * i ;
        }

        System.out.println(n+". Faktoriyel :" + total);
    }
}