import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Girin : ");
        int sayi = input.nextInt();

        int basamakdegeri;
        //bir sayı gir
        //basamaklar bulunacak
        //basamaklar toplanacak
        //yazdır
        int sonuc=0;
        while(0!=sayi){
            basamakdegeri =sayi%10;
            sonuc+=basamakdegeri; // sonuc = sonuc+basamak degeri.
            sayi/=10;
        }
        System.out.println(sonuc);
    }
}