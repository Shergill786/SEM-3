import java.util.Scanner;

class BankAccount {
    private String username;
    private int accountNo;
    private double amountWithdraw;
    private double amountCredit;
    private double totalAmount=1000;

    public BankAccount(String username, int accountNo, double withdraw, double credit ) {
        this.username = username;
        this.accountNo = accountNo;
        this.amountWithdraw = withdraw;
        this.amountCredit = credit;
        this.totalAmount = totalAmount - withdraw + credit;
    }

    public void Username(String username) {
        this.username = username;
    }
    public void AccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public void AmountWithd(double amountWithdraw) {
        this.amountWithdraw = amountWithdraw;
    }
    public void AmountCred(double amountCredit) {
        this.amountCredit = amountCredit;
    }


    public void display() {
        
        System.out.println("Username " + username);
        System.out.println("Account No  " + accountNo);
        System.out.println("Withdraw " + amountWithdraw);
        System.out.println("Credit " + amountCredit);
        System.out.println("Total Amount  " + totalAmount);
    }
x   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String name = sc.nextLine();

        System.out.print("Enter Account No: ");
        int acc = sc.nextInt();

        System.out.print("Enter Withdraw Amount: ");
        double withdraw = sc.nextDouble();

        System.out.print("Enter Credit Amount: ");
        double credit = sc.nextDouble();
        if (credit<0){
            credit=0;
        }

        BankAccount obj = new BankAccount(name, acc, withdraw, credit);
        obj.display();

    }
}