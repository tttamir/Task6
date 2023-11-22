import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a=10;
//
//        Bankomat[] test = new Bankomat[a];
//
//        Bankomat bankomat = new Bankomat(10, 20);
//        Bankomat bankomat1 = new Bankomat(7, 50);
//        Bankomat bankomat2 = new Bankomat(5, 100);
//        test[0] = bankomat;
//        test[1] = bankomat1;
//        test[2] = bankomat2;
//        Bankomat bankomat3 = new Bankomat(0,0);
//        int b = sc.nextInt();
//        if (b==20 || b==50 || b==100) {
//            bankomat3.setBills(b);
//            bankomat3.getBills();
//        }
//        else System.out.println("Vvodit mozhno tolko 20,30,50");




        System.out.println("--------------------------------------");

//        Scanner sc = new Scanner(System.in);

        Creditcard creditcard1 = new Creditcard(1234, 10);
        Creditcard creditcard2 = new Creditcard(1432, 20);
        Creditcard creditcard3 = new Creditcard(1324, 50);

        creditcard1.topUpCard( creditcard1);
        creditcard2.topUpCard( creditcard2);
        creditcard3.withdrawCard( creditcard3);

        System.out.println(creditcard1.getCurrentAmount()+"$ "+creditcard1.accountNumber);
        System.out.println(creditcard2.getCurrentAmount()+"$ "+creditcard2.accountNumber);
        System.out.println(creditcard3.getCurrentAmount()+"$ "+creditcard3.accountNumber);

    }
}