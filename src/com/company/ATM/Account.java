package com.company.ATM;


import java.text.DecimalFormat;
import java.util.Scanner;

 class Account{
    private int custmernum;
    private int pin;
    private double savingAccBalance ;


    public void setCustmernum(int custmernum) {
        this.custmernum = custmernum;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setSavingAccBalance(double savingAccBalance) {
        this.savingAccBalance = savingAccBalance;
  }

    public int getCustmernum() {
        return custmernum;
    }

    public int getPin() {
        return pin;
    }

    public double getSavingAccBalance() {
        return savingAccBalance;
   }


//   view balance
     DecimalFormat moneyFormat = new DecimalFormat("'$',## ,##0 ,00");

     public void viewBal()
     {
         System.out.println(moneyFormat.format(getSavingAccBalance()));
     }

    void withDrawFund(double amount){

//         amount = s.nextInt();
        if(savingAccBalance < amount)
        {
            System.out.println("cannot enough money for withdraw");
        }
        else {
             savingAccBalance = (savingAccBalance - amount);
            System.out.println("balance is now:" + savingAccBalance);
        }
    }

    void depositFund(double amount) {

//        amount = s.nextInt();
        if( amount <= 0)
        {
            System.out.println("money cannot be negative or zero");
        }
        else {
            savingAccBalance = (savingAccBalance + amount);
            System.out.println("balance is now:" + savingAccBalance);
        }
    }
     public double getAccType() {
         System.out.println("1:for saving account\n2:for exit");
         int select = s.nextInt();
         switch(select){
             case 1:
                 ShowSavingAcc();
                 break;
             case 2:
                 System.out.println("thank you \n   visit agin");
                 break;
         }
         return 0;
     }

Scanner s = new Scanner(System.in);
     void ShowSavingAcc(){
         System.out.println("1:for withdrawFund\n2:for depositFund");
         int select = s.nextInt();

         switch(select){
             case 1:
                 System.out.println("current balance is :");
                 viewBal();
                 System.out.println("enter amount which you want to withdraw");
                 withDrawFund(s.nextInt());
                getAccType();
                 break;
             case 2:
                 System.out.println("current balance is :");
                 viewBal();
                 System.out.println("enter amount which you want to deposit");
                 depositFund(s.nextInt());
                 getAccType();
                 break;

             default:
                 System.out.println("somthing went wrong");
         }
     }

}
