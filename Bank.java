package Bank_Account;

import java.util.Scanner;

public class Bank {
    int acc_Number;
    String cust_Name;
    float balance;
    float rate_of_interest;

    public Bank(int acc_Number, String cust_Name, float balance, float rate_of_interest) {
        this.acc_Number = acc_Number;
        this.cust_Name = cust_Name;
        this.balance = balance;
        this.rate_of_interest = rate_of_interest;
    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        Bank call = new Bank(12309, "Nanik Athwal", (float) 177780.4, (float) 9.43);

        call.displayAccountDetails();

        boolean verify_Deposit = call.deposit(2000);
        if(verify_Deposit == true)
            System.out.println("Transaction successful.");
        else
            System.out.println("Transaction failed.");

        boolean verify_Withdraw = call.withdraw(1000);
        if(verify_Withdraw == true)
            System.out.println("Amount withdrawn successful.");
        else
            System.out.println("Amount withdrawn failed.");

        System.out.println("The rate of interest is " + call.getRateOfInterest());

        System.out.println("Account details after updation...");
        call.displayAccountDetails();
    }

    public boolean deposit(float amount)
    {
        if(this.acc_Number == 0)
        {
            System.out.println("You do not have any account in our bank.");
        }
        else
        {
            this.balance = amount;
            System.out.println("Your amount has been deposited successfully.");
            return true;
        }
        return false;
    }

    public boolean withdraw(float amount)
    {
        if(this.balance - amount < 5000)
        {
            System.out.println("You do not have sufficient balance to withdraw.");
        }
        else
        {
            this.balance -= amount;
            System.out.println("Amount " + amount + "has been debited from the account. The remaining balance is " + this.balance + ".");
            return true;
        }
        return false;
    }

    public float getRateOfInterest()
    {
        return this.rate_of_interest;
    }

    public void displayAccountDetails()
    {
        System.out.println("\nFollowing are the account details :-\n");
        System.out.println("Account number : " + this.acc_Number);
        System.out.println("Customer name : " + this.cust_Name);
        System.out.println("Account balance " + this.balance);
        System.out.println("Rate of interest " + this.rate_of_interest + "\n");
    }
}
