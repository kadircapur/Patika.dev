public class Main {
    public static void main(String[] args) {
        Fighter MuhammetAli = new Fighter("Muhammed Ali" , 10 , 100, 100, 50);
        Fighter YuriBoyka = new Fighter("Yuri Boyka" , 10 , 100, 100, 50);
        Ring ring = new Ring(MuhammetAli,YuriBoyka , 90 , 100);
        ring.run();
    }
}