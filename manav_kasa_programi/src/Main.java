import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double perA = 2.14 , perE =3.67 , perD = 1.11 , perM =0.95, perP =5 ,
                a , e , d , m , p ;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kac Kilo :");
        a = input.nextDouble();

        System.out.print("Elma Kac Kilo :");
        e = input.nextDouble();

        System.out.print("Domates Kac Kilo :");
        d = input.nextDouble();

        System.out.print("Muz Kac Kilo :");
        m = input.nextDouble();

        System.out.print("Patlıcan Kac Kilo :");
        p = input.nextDouble();

        double armutFiyatı , elmaFiyatı , domatesFiyatı , muzFiyatı , patlıcanFiyatı,total ;


        armutFiyatı = a*perA;
        elmaFiyatı = e*perE;
        domatesFiyatı = d*perD;
        muzFiyatı = m*perM;
        patlıcanFiyatı = p*perP;

        total = armutFiyatı + elmaFiyatı+ domatesFiyatı + muzFiyatı + patlıcanFiyatı ;

        System.out.print("Toplam Tutar :" + total);

    }
}