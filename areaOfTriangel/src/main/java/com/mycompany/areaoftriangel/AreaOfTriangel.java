/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areaoftriangel;
import java.util.Scanner;
public class AreaOfTriangel {

    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
       float base=10, height=7, hypo=12;
       float a,p;
       a=(base*height)/2;
       p=base+height+hypo;
       
       System.out.println("The area is:"+a+" The perimeter is:"+p);
       
     
        
    
     System.out.print("Please enter the buying price");
       float bPrice= myObj.nextFloat();
       
       System.out.print("Please enter the selling price");
       float sPrice= myObj.nextFloat();
       
       float profit= sPrice-bPrice;
       
       System.out.println("the profit is:"+profit);
       
       
       
    }
}
