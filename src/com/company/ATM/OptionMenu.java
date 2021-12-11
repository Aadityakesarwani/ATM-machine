package com.company.ATM;

import java.io.IOException;

import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
    HashMap<Integer,Integer> data = new HashMap<>();

    Scanner s = new Scanner(System.in);

    public void getLogin()throws IOException{

        int x = 1;
        do{
           try {
               x = 2;
               data.put(123, 12345);
               data.put(789, 56789);

               System.out.println("welcome to ATM project");
               System.out.println("Enter your custemer num");
               setCustmernum(s.nextInt());

               System.out.println("enter your pin nuber");
               setPin(s.nextInt());

           } catch (Exception e) {
               System.out.println("only use numbrs");

           }
           int cn = getCustmernum();
           int pn = getPin();
             if(data.containsKey(cn) && data.get(cn) == pn)
             {
                 getAccType();
             }
             else {
                 System.out.println("custemer number or pin number is wrong");
             }
        }while(x == 1);
    }





}
