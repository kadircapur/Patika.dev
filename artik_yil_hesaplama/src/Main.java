import java.util.Scanner;

public class Main {
    /*  Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
        1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
        100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
        Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year;

        System.out.print("Yil giriniz: ");
        year = input.nextInt();

        if (year % 100 == 0 && year % 400 == 0){
            System.out.println(year + " bir artik yildir");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " bir artik yil değildir");
        }

        if (year % 100 != 0 && year % 4 == 0){
            System.out.println(year + " bir artik yildir");
        } else if (year % 100 != 0 && year % 4 != 0) {
            System.out.println(year + " bir artik yil değildir");
        }
    }
}