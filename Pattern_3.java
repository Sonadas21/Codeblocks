/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacore;

/**
 *
 * @author dass2
 */

/*
5 4 3 2 1 

5 4 3 2 

5 4 3 

5 4 

5 
*/

import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args){
        System.out.println("Enter the value to print the pattern.: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j,i;
        int tmp = n;
        
        for(i=n;i>0;i--){    // for vertical line.....
            int c = n;
            for(j=tmp;j>0;j--){    // for horizontal line.......
                System.out.print(c+" ");     // the value we need to print......
                c = c - 1;
            }
//            c = c ;
            tmp = tmp - 1;
            System.out.println("\n");  // the new line we need to print....
//            n = n-1;  //don't need this one
        }   
        
    }
    
}
