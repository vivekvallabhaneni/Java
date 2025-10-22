package oop;

public class Bankdetails {
    private double balance;
    private int accountnumber;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }
        public static void main(String[] args) {
            Bankdetails b1=new Bankdetails();
            b1.setAccountnumber(234567843);
            b1.setBalance(78247823);
            System.out.println("Account number:"+b1.getAccountnumber());
            System.out.println("Available Balance:"+b1.getBalance());
        }
}
