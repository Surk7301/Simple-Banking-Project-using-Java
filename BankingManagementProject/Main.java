package BankingManagementProject;

class Account{
    private String Number;
    private double Balance;
    private String name;
    private String Email;
    private String PhoneNumber;


    public Account(String Number, double Balance, String Name, String Email, String PhoneNumber){
        this.Number=Number;
        this.Balance=Balance;
        this.name=Name;
        this.Email=Email;
        this.PhoneNumber=PhoneNumber;

    }
    public void depositMoney(double depositedMoney)
    {
        this.Balance+=depositedMoney;
        System.out.println("Deposit is Successful, new Balance is: " + this.Balance);
    }

    public void withDrawMoney(double WithDrawalMoney)
    {
        if (this.Balance - WithDrawalMoney < 0){
        System.out.println("WithDraw Unsuccessful, Only " + this.Balance + " is left.");

    }else {
            this.Balance -= WithDrawalMoney;
            System.out.println("Withdraw Successful!, Current Balance is " + this.Balance );
        }
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        Account userAccount = new Account("12345",0.0, "Suraj", "123@gmail.com", "12121" );
        userAccount.depositMoney(100);
        userAccount.depositMoney(150);
        userAccount.withDrawMoney(200);

    }
}
