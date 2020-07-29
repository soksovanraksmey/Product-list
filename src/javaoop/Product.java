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
public class Product {
    
    int id;
    String name ;
    int qty;
    double price;
    
    double amount(){
       return qty*price;
    }
    
    public Product(){
        
    }
    public void input(){
        Scanner cin= new Scanner(System.in);
        System.out.print("Enter id=");
        id=cin.nextInt();
        System.out.print("Enter name=");
        cin.nextLine();
        name = cin.nextLine();
        System.out.print("Enter qty=");
        qty=cin.nextInt();
        System.out.print("Enter price=$");
        price=cin.nextDouble();
        DecimalFormat df2= new DecimalFormat("$#,##0.00");
        System.out.println("Amount ="+df2.format(amount()));
        System.out.println("____________________________________________");
    }
    
    public Product(int id , String name,int qty,double price ){
        this.id= id ;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    @Override
    public String toString(){
        DecimalFormat df1 = new DecimalFormat("000");
        DecimalFormat df2 = new DecimalFormat("$#,##0.00");
        return df1.format(id)+"\t"+name+"\t"+qty+"\t"+df2.format(price)+"\t"+df2.format(amount());
    }
}
    

