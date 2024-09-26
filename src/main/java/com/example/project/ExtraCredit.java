package com.example.project;
import java.util.Scanner;
import java.math.BigDecimal;

import java.math.RoundingMode;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();
       
                //COPY AND PASTE YOUR CODE HERE 
        
        //your code here

        

        double costTip = cost * (double)(percent/100.0);
        BigDecimal bigDecimal = new BigDecimal(costTip);
        BigDecimal costTipRound = bigDecimal.setScale(2, RoundingMode.HALF_UP);

        double totalBill = cost + costTip;
        BigDecimal bigDecimal1 = new BigDecimal(totalBill);
        BigDecimal totalBillRound = bigDecimal1.setScale(2, RoundingMode.HALF_UP);

        double personCostBeforeTip = cost/people;
        BigDecimal bigDecimal2 = new BigDecimal(personCostBeforeTip);
        BigDecimal personCostBeforeTipRound = bigDecimal2.setScale(2, RoundingMode.HALF_UP);

        double personCostTip = costTip/people;
        BigDecimal bigDecimal3 = new BigDecimal(personCostTip);
        BigDecimal personCostTipRound = bigDecimal3.setScale(2, RoundingMode.HALF_UP);

        double personCostAfterTip = personCostTip +personCostBeforeTip;
        BigDecimal bigDecimal4 = new BigDecimal(personCostAfterTip);
        BigDecimal personCostAfterTipRound = bigDecimal4.setScale(2, RoundingMode.HALF_UP);

        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" +cost +"\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: "  + percent+"%"+"\n" );
        result.append("Total tip: " + "$" + costTipRound + "\n" );
        result.append("Total Bill with tip: " +"$" + totalBillRound+"\n" );
        result.append("Per person cost before tip: " + "$" + personCostBeforeTipRound+"\n" );
        result.append("Tip per person: " +"$" + personCostTipRound+"\n" );
        result.append("Total cost per person: " +"$" +personCostAfterTipRound+"\n" );
        result.append("-------------------------------\n");


        //the two lines  should go below result.append("-------------------------------\n"); 
    
        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 2;
        int percent =5;
        double cost = 29.56;
        String items =""; 
        String item;

        //Your scanner object and while loop should go here
        Scanner scan = new Scanner(System.in);
        boolean ifPlaced = false;
       
        while (ifPlaced == false){
            System.out.println(" Enter an item name or type '-1' to finish: ");
            item = scan.nextLine();
            if( item.equals("-1")){
                ifPlaced = true;
                
            }
            if( ifPlaced == false){
            items += item + "\n";
            }
            
        }
        scan.close();
       
        System.out.println(calculateTip(people,percent,cost,items));
    }
}
