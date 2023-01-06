/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacore;

/**
 *
 * @author dass2
 */
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        
        System.out.println("Enter a no. to check whether it is Armstrong or not :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int c = x, s, sum=0;
        while(x>0){
            s = x % 10;
            sum =  sum+(s*s*s);
            x = x/10;
        }
        if(c == sum){
            System.out.println("The no. "+c+" is Armstrong no.");
        }
        else{
            System.out.println("The no. "+c+" is not Armstrong no.");
        }
        
        
    }
    
}
