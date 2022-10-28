

import java.util.Scanner;

interface Operations{
    void deposit(double amount);
    void withdraw(double amt);
    void getPreviousTrans();
}

class JavaBank implements Operations{
    double bal;
    double prevTrans;
    String customerName;
    String customerId;

    public JavaBank(String customerName,String customerId){
        this.customerName=customerName;
        this.customerId=customerId;
    }



    public void menu(){

        System.out.println("Welcome "+customerName);
        System.out.println("Your ID:"+customerId);
        System.out.println("***********");
        System.out.println("1) Check Balance");
        System.out.println("2) Deposit Amount");
        System.out.println("3) Withdraw Amount");
        System.out.println("4) Previous Transaction");
        System.out.println("5) Exit");

        Scanner sc=new Scanner(System.in);
        char option;

        do{
            System.out.println("Choose an option");
            option=sc.next().charAt(0);

            switch (option){
                case '1':
                    System.out.println("Balance ="+bal);
                    break;
                case '2':
                    System.out.print("Enter a amount to deposit :");
                    double amt=sc.nextDouble();
                    deposit(amt);
                    System.out.println("\n");
                    break;
                case '3':
                    System.out.print("Enter a amount to Withdraw :");
                    double amtW=sc.nextDouble();
                    withdraw(amtW);
                    System.out.println("\n");
                    break;
                case '4':
                    System.out.print("Previous Transaction:");
                    getPreviousTrans();
                    System.out.println("\n");
                    break;

                case '5':
                    System.out.println("......................");
                    break;
                default:
                    System.out.println("Choose a correct option to proceed");
                    break;
            }

        }while(option!='5');

        System.out.println("Thank you for using our banking services");
    }



    @Override
    public void deposit(double amount){
        if(amount!=0){
            bal+=amount;
            prevTrans=amount;
        }
    }

    @Override
    public void withdraw(double amt){
        if(amt!=0 && bal>=amt){
            bal-=amt;
            prevTrans=-amt;
        }
        else if(bal<amt){
            System.out.println("Bank balance less than what you asking for");
        }

    }

    @Override
    public void getPreviousTrans(){
        if(prevTrans>0){
            System.out.println("Deposited: "+prevTrans);
        }
        else if(prevTrans<0){
            System.out.println("Withdrawn: "+Math.abs(prevTrans));
        }
        else{
            System.out.println("No transaction occured");
        }

    }





}
