import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin Satır sayısını giriniz:");
        int satirSayisi= scan.nextInt();
        System.out.print("Dizinin Sutun sayısını giriniz:");
        int sutunSayisi= scan.nextInt();
        Mayin mayin = new Mayin(satirSayisi, sutunSayisi);
        mayin.run();
    }
}