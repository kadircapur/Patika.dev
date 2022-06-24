import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double normalTutar, yasIndirimi, indirimliTutar, perKm = 0.1;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km turunden giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Yasinizi giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz: 1 => Tek Yon , 2 => Cift Yon");
        yolculukTipi = input.nextInt();

        normalTutar = mesafe * 0.10;

        if (mesafe<=0 || yas <=0 || (yolculukTipi != 1 && yolculukTipi!= 2)) {
            System.out.println("Hatalı veri girdiniz !");
        }
        else {
            normalTutar = perKm*mesafe;
            normalTutar = (yas<12) ? normalTutar*0.5 : normalTutar;
            normalTutar = (yas>12 && yas<24) ? normalTutar*0.9 : normalTutar;
            normalTutar = (yas>65) ? normalTutar*0.7 : normalTutar;
            normalTutar = (yolculukTipi == 2) ? normalTutar*0.8*2 : normalTutar;
            System.out.print("Toplam tutar : " +normalTutar + " TL");
        }

    }
}