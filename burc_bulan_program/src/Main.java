import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);
        System.out.print("Dogdunuz Ay: ");
        month = input.nextInt();

        System.out.print("Dogdugunuz Gun: ");
        day = input.nextInt();

        if (month == 1) {
            if (day < 22) {
                System.out.println("Burcunuz 'Oglak'");
            } else {
                System.out.println("Burcunuz 'Kova'");
            }
        }
        if (month == 2) {
            if (day < 19) {
                System.out.println("Burcunuz 'Kova'");
            } else {
                System.out.println("Burcunuz 'Balik'");
            }
        }
        if (month == 3) {
            if (day < 20) {
                System.out.println("Burcunuz 'Balik'");
            } else {
                System.out.println("Burcunuz 'Koc'");
            }
        }
        if (month == 4) {
            if (day < 20) {
                System.out.println("Burcunuz 'Koc'");
            } else {
                System.out.println("Burcunuz 'Boga'");
            }
        }
        if (month == 5) {
            if (day < 21) {
                System.out.println("Burcunuz 'Boga'");
            } else {
                System.out.println("Burcunuz 'Ikizler'");
            }
        }
        if (month == 6) {
            if (day < 22) {
                System.out.println("Burcunuz 'Ikizler'");
            } else {
                System.out.println("Burcunuz 'Yengec'");
            }
        }
        if (month == 7) {
            if (day < 22) {
                System.out.println("Burcunuz 'Yengec'");
            } else {
                System.out.println("Burcunuz 'Aslan'");
            }
        }
        if (month == 8) {
            if (day < 22) {
                System.out.println("Burcunuz 'Aslan'");
            } else {
                System.out.println("Burcunuz 'Basak'");
            }
        }
        if (month == 9) {
            if (day < 22) {
                System.out.println("Burcunuz 'Basak'");
            } else {
                System.out.println("Burcunuz 'Terazi'");
            }
        }
        if (month == 10) {
            if (day < 22) {
                System.out.println("Burcunuz 'Terazi'");
            } else {
                System.out.println("Burcunuz 'Akrep'");
            }
        }
        if (month == 11) {
            if (day < 21) {
                System.out.println("Burcunuz 'Akrep'");
            } else {
                System.out.println("Burcunuz 'Yay'");
            }
        }
        if (month == 12) {
            if (day < 21) {
                System.out.println("Burcunuz 'Yay'");
            } else {
                System.out.println("Burcunuz 'Oglak'");
            }
        }


    }
}