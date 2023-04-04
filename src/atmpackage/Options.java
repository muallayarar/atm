package atmpackage;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account{

    Scanner scan=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data=new HashMap<>();

    boolean flag=true;

    public void login(){
        System.out.println("Hi! Welcome to Techproed ATM...");
        do{
            //acc. num      pin num.
            data.put(12345, 1234);//user 1
            data.put(23456, 2345);//user 2
            data.put(34567,3456);//user 3
            data.put(45678,4567);//user 4

            try {
                System.out.println("Enter account number");
                setAccountNumber(scan.nextInt());
                System.out.println("Enter the pin number");
                setPinNumber(scan.nextInt());
            }catch (Exception e){
                System.out.println("Hey! You have entered an invalid character!");
                System.out.println("Please enter an integer to proceed or you can type in 'Q' to exit");
                scan.nextLine();
                String exit= scan.next().toLowerCase();
                if(exit.equals("q")){
                    flag=false;
                }
                e.printStackTrace();
            }
            int count=0;
            for (Map.Entry<Integer,Integer> w: data.entrySet()) {
                    if (w.getKey().equals(getAccountNumber())&&w.getValue().equals(getPinNumber())){
                        System.out.println("Welcome to your account!");
                    }else {
                        count++;
                    }
            }
            if(count==data.size()){
                System.out.println("Account number or pin number does not match our users");
                System.out.println("Invalid user");
                System.out.println("Press any integer to try again or Press 'Q' to exit");
                String exit=scan.next();
                if (exit.equalsIgnoreCase("q")){
                    flag=false;
                }
            }

        }while (flag);

        }
    }



