package com.mycompany.profit;

import java.util.Scanner;
public class Profit {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
    
     System.out.print("Please enter the buying price");
       float bPrice= myObj.nextFloat();
       
       System.out.print("Please enter the selling price");
       float sPrice= myObj.nextFloat();
       
       float profit= sPrice-bPrice;
       
       System.out.println("the profit is:"+profit);
}
}
