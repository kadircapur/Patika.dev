import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n1, n2, i = 1, eb = 0;

        System.out.println("Birinci sayiyi giriniz>> ");
        n1 = girdi.nextInt();
        System.out.println("Ikinci sayiyi giriniz>>");
        n2 = girdi.nextInt();

        while (i <= n1 && i <= n2) {
            if ((n1 % i) == 0 && (n2 % i) == 0) {
                eb = i;

            }

            i++;
        }
        System.out.println("Ebob: " + eb);
        System.out.println("Ekok: " + (n1 * n2 / eb));
    }
}