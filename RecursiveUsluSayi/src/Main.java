import java.util.Scanner;
/**
 * RecursiveUsluSayi
 */
public class Main {

    static int result = 1;
    static int us(int a, int b){
        if (a == 0){
            return 1;
        }

        result *= b;
        us(a-1,b);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.println("Taban sayisini giriniz: ");
        b = input.nextInt();
        System.out.println("Us sayisini giriniz: ");
        a = input.nextInt();

        System.out.println(us(a,b));
    }
}