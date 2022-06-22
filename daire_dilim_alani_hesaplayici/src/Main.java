import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double yaricap, aci, alan, pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yaricapini giriniz: ");
        yaricap = input.nextDouble();
        System.out.print("Merkez acisi olcusunu giriniz: ");
        aci = input.nextDouble();

        alan = ((pi * (yaricap * yaricap)) * aci) / 360;

        System.out.println("Daire dilimi alani: " +alan);



    }
}