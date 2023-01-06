/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacore;

import java.util.*;
/**
 *
 * @author dass2
 */
public class FibonacciSeries {
    
    public static void main(String[] args){
        
       int n = 0, m = 1,p=0, i; 
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of series how many time it will run.: ");
       int r = sc.nextInt();
       System.out.println(n + m);
       for(i = 2 ; i <= r ; i++){
           
           n = p + m; // n = 0+1 1+1 2
           System.out.println(n);
           p = m;     //m = 1 2
           m = n;  
       }
       
        
    }
    
    
}
