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

public class EvenOdd {
    
    public static void main(String[] args){
        
        System.out.println("Enter the no to check whether it is even or odd : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if( x % 2 == 0){
            
            System.out.println("The no. "+x+" is even");
            
        }
        else{
            System.out.println("The no. "+x+" is odd");
        }
        
    }
    
}
