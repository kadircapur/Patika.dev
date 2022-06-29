import java.util.Scanner;

public class Main {

    static int toplama(int a, int b) {
        int result = a + b;
        System.out.println("Toplama : " + result);
        return result;

    }


    static int cıkarma(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;

    }

    static int carpma(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;

    }

    static int bolme(int a, int b) {

        int result = a / b;

        System.out.println("Bolme : " + result);
        return result;

    }

    static int mod(int a, int b) {
        return a % b;
    }

    static int usalma(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        return result;
    }

    static void alanCevre(int a, int b) {
        System.out.println("Dairenin Çevresi " + (2 * (a + b)));
        System.out.println("Dairenin Alanı " + (a * b));
    }

    public static void main(String[] args) {
        // gelişimiş hesap makinesi programı yazacağız ...

        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Mod Alma\n"
                + "6- Üslü Sayı Hesaplama\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";


        while (true) {
            System.out.println(menu);
            System.out.println(" Bir İşlem Seciniz ");
            select = scan.nextInt();

            if (select == 0 || select > 7) {
                break;
            }
            System.out.println(" birinci sayiyi  giriniz ");
            int a = scan.nextInt();
            System.out.println(" ikinci sayiyi  giriniz ");
            int b = scan.nextInt();


            switch (select) {
                case 1:
                    toplama(a, b);
                    break;

                case 2:
                    cıkarma(a, b);
                    break;

                case 3:
                    carpma(a, b);
                    break;

                case 4:
                    if (bolme(a, b) == 0)
                        System.out.println("ikinci sayi 0 olamaz ");
                    bolme(a, b);
                    break;

                case 5:
                    System.out.println("mod alma hesabı ; " + mod(a, b));

                case 6:

                    System.out.println(" üs hesabı ; " + usalma(a, b));

                case 7:
                    alanCevre(a, b);


            }


        }

        System.out.println("güle güle ");


    }

}