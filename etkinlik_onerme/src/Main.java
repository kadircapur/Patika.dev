import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int heat;

        Scanner scanner =new Scanner(System.in);

        System.out.println("Lütfen Hava Sicakligini Giriniz : ");
        heat =scanner.nextInt();

        if(heat>25){
            System.out.print("Yüzmeye gidebilirsiniz.");
        }else if(heat >=15){
            System.out.print("Pikniðe gidebilirsiniz.");
        }else if(heat>=10 ){
            System.out.print("Pikniðe gidebilirsiniz.");
            System.out.print("Sinemaya gidebilirsiniz.");
        }else if (heat>=5){
            System.out.print("Sinemaya gidebilirsiniz.");
        }else{
            System.out.print("Kayak yapmaya gidebilirsiniz.");
        }


    }
}