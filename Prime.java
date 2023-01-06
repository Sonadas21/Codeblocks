/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacore;

/**
 *
 * @author dass2
 */

//Prime or not.....only dividible by one and itself.....

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        
        System.out.println("Enter a no. to check whether it is prime or not : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i, check=0;
        for(i=2;i<x;i++){
            if(x % i == 0){
                System.out.println("The no. "+x+" is not Prime.");
                check = 1;
                break;
            }
        }
        if(check == 0){
            System.out.println("The no. "+x+" is Prime.");
        }
        
    }
    
}
