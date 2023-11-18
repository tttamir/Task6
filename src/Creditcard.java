import java.util.Scanner;

public class Creditcard {

    static Scanner sc = new Scanner(System.in);

    double accountNumber;
    double currentAmount;

    public Creditcard(double accountNumber, double currentAmount){
        this.accountNumber=accountNumber;
        this.currentAmount=currentAmount;
    }


    public void topUpCard( Creditcard creditcard){

        System.out.print("vvedite summu: ");
        int x= sc.nextInt();
        creditcard.currentAmount += x;
        System.out.println("na vashem creditcard - "+creditcard.currentAmount+"$");
    }
    public  void withdrawCard( Creditcard creditcard){
        System.out.print("snyat - ");
        int y = sc.nextInt();
        creditcard.currentAmount=creditcard.currentAmount-y;
        System.out.println("na vashem creditcard - "+creditcard.currentAmount);
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public double getAccountNumber() {
        return accountNumber;
    }
}
