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

//Main class..........

public class SwapNos {
    
    public static void main(String[] args){
        
        System.out.println("Choose either we use third no or not. if yes hen press 1 or press 2 .: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the 1st value : ");
        int x = sc.nextInt();
        System.out.println("Enter the 2nd value : ");
        int y = sc.nextInt();
        Swap obj = new Swap();
        if (a == 1){
            
            obj.SwapInTwo(x , y);
        
        }
        else{
            
            obj.SwapThree(x , y);
        
        }
        
        
    }
    
    
}

//Sub class..........

class Swap{
    
    void SwapInTwo(int x, int y){
        
        x = x + y; // 4+5 = 9
        y = x - y; // 9-5 = 4
        x = x - y; // 9 - 4 = 5
        System.out.println("After swapping the 1st value is "+x+" and the 2nd value is "+y);
        
    }

    void SwapThree(int x , int y){
        int q = 0;
        q = x;
        x = y;
        y = q;
        System.out.println("After swapping the 1st value is "+x+" and the 2nd value is "+y);
    
    }    
 
}