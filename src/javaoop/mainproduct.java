/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class mainproduct {
    public static void main(String[] args) {
//        Product obj = new Product();
        double totalAmount =0;
        Scanner cin= new Scanner(System.in);
        int n;
        System.out.print("Enter n =");
        n=cin.nextInt();
        Product []obj = new Product[n];
        for(int i = 0; i<n;i++){
            
            obj[i]= new Product();
            obj[i].input();
            totalAmount+=obj[i].amount();
            
        }
      
       for(Product abc:obj){
           System.out.println(abc);
           System.out.println("_________________________________________");
       }
        DecimalFormat df2 =new DecimalFormat("$#,##0.00");
        System.out.println("\t\t\tTotal Amount= $"+totalAmount);
        
    }
    
    
}
