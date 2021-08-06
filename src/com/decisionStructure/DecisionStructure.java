package com.decisionStructure;

import javax.swing.*;
import java.util.Scanner;

public class DecisionStructure
{
    public static void main(String[] args)
    {
        int number;
        String input;

     //   input= JOptionPane.showInputDialog("Please enter a number: ");
      //  number=Integer.parseInt(input);


        //user
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");

        number=scan.nextInt();


        if(number==5)
        {
            System.out.println("The number is exactly 5!");
           // JOptionPane.showMessageDialog(null,"The number is exactly 5!");
        }
       else if(number>5)
        {
            System.out.println("The number is greater than 5!");
          //  JOptionPane.showMessageDialog(null,"The number is greater than 5!");
        }
        if(number==10)
        {
            System.out.println("The number is exactly 10!");
            //JOptionPane.showMessageDialog(null,"The number is exactly 10");
        }

        System.exit(0);
    }
}
