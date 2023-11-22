import java.util.Scanner;

public class Bankomat {
    Scanner sc = new Scanner(System.in);
    int numberOfBills;
    int bills;

    int sum = numberOfBills*bills;
    public Bankomat(int numberOfBills, int bills){
        this.numberOfBills=numberOfBills;
        this.bills=bills;
    }

    public void setBills(int bills) {
        this.bills=bills;
    }
    public void setNumberOfBills(int numberOfBills) {
        this.numberOfBills = numberOfBills;
    }

    public int getBills() {
        return bills;
    }

    public int getNumberOfBills() {
        return numberOfBills;
    }

    public void addBills(int numberOfBills, int bills){
        System.out.print("Vvedi bill - ");
        setBills(bills);
    }
    public boolean withdrawMoney(int sum){
        if (sum<=sum){
            sum-=sum;
            return true;
        }
        return false;
    }
}
