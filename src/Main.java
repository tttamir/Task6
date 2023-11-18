import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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