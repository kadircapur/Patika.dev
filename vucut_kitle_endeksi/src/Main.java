import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo, kitleEndeks;
        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        kilo = input.nextDouble();

        kitleEndeks = kilo / (boy * boy) ;
        System.out.println("Vucut kitle endeksiniz: "+ kitleEndeks);
    }
}