import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.println("Kullanici adinizi giriniz: ");
            userName = input.nextLine();

            System.out.println("Sifrenizi giriniz: ");
            password = input.nextLine();

            if (userName.equals("Kadir") && password.equals("1234")) {
                System.out.println("Merhaba, Kadir Bankasina Hosgeldiniz!.");
                do {
                    System.out.println("1-Para Yatirma\n" + "2-Para Cekme\n" + "3-Bakiye Sorgula\n" + "4-Cikis Yap");
                    System.out.print("Lutfen Yapmak Istediginiz Islemi Seciniz.");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.println("Para Miktari: ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.println("Para Miktari: ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye Yetersiz!");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz: " + balance);

                    }

                } while (select != 4);
                System.out.println("Tekrar gorusmek uzere.");
                break;
            } else {
                right--;
                System.out.println("Hatali Kullanici Adi veya Sifre. Tekrar Deneyiniz!");
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur, lutfen banka ile iletisime geciniz.");
                } else {
                    System.out.println("Kalan Hakkiniz: " + right);
                }
            }
        }


    }
}