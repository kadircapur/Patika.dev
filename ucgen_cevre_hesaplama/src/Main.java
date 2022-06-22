import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x, y, z;
        double u;
        double a;

        Scanner girdi = new Scanner(System.in);

        System.out.println("1. kenar uzunlugunu giriniz: ");
        x = girdi.nextInt();
        System.out.println("2. kenar uzunlugunu giriniz: ");
        y = girdi.nextInt();
        System.out.println("3. kenar uzunlugunu giriniz: ");
        z = girdi.nextInt();

        u = (x + y + z) / 2;

        a = u * (u - x) * (u - y) * (u - z);
        System.out.println(a);

    }
}