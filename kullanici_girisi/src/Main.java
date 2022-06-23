import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword,reset;


        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanici adinizi giriniz: ");
        userName = inp.nextLine();

        System.out.print("Kullanici sifrenizi giriniz: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Sisteme giris basarili !");
        }
        else {
            System.out.println("Kullanici adi veya sifreniz hatali !");
            System.out.print("Sifrenizi sifirlamak ister misiniz? (Evet/Hayir)");
            reset = inp.nextLine();

            if (reset.equals("Hayir")) {
                System.out.println("Lutfen tekrar giris yapiniz.");
            }
            else if (reset.equals("Evet")) {
                System.out.println("Yeni sifre giriniz: ");
                newPassword = inp.nextLine();
            }
        }
    }
}