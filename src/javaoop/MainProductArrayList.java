/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class MainProductArrayList { // for add more product
    public static void addProduct(List<Product> arr){
         Scanner cin = new Scanner(System.in);
        int n;
        System.out.print("Enter number for add =");
        n=cin.nextInt();
        for(int i=1;i<n;i++){
            Product obj = new Product();
            obj.input();
           // totalAmount+=obj.amount();
            arr.add(obj);
        }
    }
    public static void removeById(List<Product> arr){
          Scanner cin = new Scanner(System.in);
        int n;
        System.out.print("Enter number for add =");
        n=cin.nextInt();
        for(int i=1;i<n;i++){
            Product obj = new Product();
            obj.input();
             arr.remove(obj);
        }
    }
    
    public static void showAll(List<Product> arr){
        double totalAmount=0;
         for(Product temp:arr){ // show all product 
            System.out.println(temp);
            totalAmount+=temp.amount();
        }
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        System.out.println("\t\t\ttotalAmount "+df.format(totalAmount));
    
    }
    public static int menu(){
        System.out.println("1.Add Products");
        System.out.println("2.Show all Products");
        System.out.println("3.Remove Product by ID");
        System.out.println("4.Input Again");
        System.out.println("5.Exit");
        Scanner cin=new Scanner(System.in);
        int choose;
        do{
            System.out.println("Choose number");
            choose=cin.nextInt();
            
        }while(!(choose <=1 && choose>= 5));
        return choose;
            
    }
    public static void main(String[] args) {
        again: do{
            
        Scanner cin = new Scanner(System.in);
        int n;
        System.out.print("Enter n =");
        n=cin.nextInt();
        List< Product > arr=new ArrayList<>();
        double totalAmount=0;
        for(int i=0;i<n;i++){
            Product obj=new Product();
            obj.input();
            totalAmount+=obj.amount();
            arr.add(obj);
        }
        
            do{
                int choose=menu() ;
                switch (choose){
                    case 1:
                       addProduct(arr);
                       break;

                    case 2:
                        showAll(arr);
                        break;
                    case 3:
                        break;
                    case 4:
                        continue again;
                        //break;
                    case 5:
                        System.exit(0);
                     }
            }while(true);
           
        }while(true);
        
        }
    
}
