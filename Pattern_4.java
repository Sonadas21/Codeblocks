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
1 2 3 4 5 

1 2 3 4 

1 2 3 

1 2 

1 
*/


import java.util.Scanner;


public class Pattern_4 {
    public static void main(String[] args){
        System.out.println("Enter the value to print the pattern.: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j,i;
        int tmp = n;
        
        for(i=n;i>0;i--){    // for vertical line.....
            int c = 1;
            for(j=tmp;j>0;j--){    // for horizontal line.......
                System.out.print(c+" ");     // the value we need to print......
                c = c + 1;
            }
            tmp = tmp - 1;
            System.out.println("\n");  // the new line we need to print....
//            n = n-1;  //don't need this one
        }   
        
    }
    
}
