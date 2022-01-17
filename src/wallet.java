import java.util.Scanner;

public class wallet {

    private int value;
    private String owner;
    boolean zipped = true;

    public wallet(int value, String owner) {

        this.value = value;
        this.owner = owner;

    }

    public void showWallet() {
        System.out.println("The Owner is " + this.owner + " And he has " + this.value + " In his account");
    }

    public void addCoins() {

        if (zipped == true) {
            System.out.println("Your Wallet Is Zipped, Please Unzip To Add Coins");
        } else {
            System.out.println("Please Specify Ammount To Add");
            Scanner valueScan = new Scanner(System.in);
            int tempValue = valueScan.nextInt();
            this.value += valueScan.nextInt();
            System.out.println(tempValue + " Coins Have Been Added: Current Balance Is: " + this.value);
        }

    }

    public void unzip() {

        zipped = false;
        System.out.println("Your Wallet Has Been Unzipped");

    }

    public void zip() {

        zipped = true;
        System.out.println("Your Wallet Has Been Zipped");

    }

}
