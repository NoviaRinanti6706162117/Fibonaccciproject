/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmod8github;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Factorial {
    public static void main (String[] args) {
    Scanner input=new Scanner(System.in);
        int a, b, c, d, e, f, n, m, l=2, z;

           System.out.print("Masukan Angka : ");
           n=input.nextInt();

             m=n/2;

           for (a=1;a<=m;a++) {
             b=m;
           while (b>a) {
             System.out.print(" ");
              b--;
              }
              c=2;
              do {
              System.out.print("*"); }
           while (c++<l);
             l += 2;
            System.out.println(" ");
                    }
              l=((m-1)*2);
              z=m-1;
              for (d=z;d>=1;d--) {
              e=m;
           while (e>d) {
              System.out.print(" ");
              e--;
              }
              f=2;
              do {
              System.out.print("*");
              }          
           while (f++<l);
                l -= 2;
             System.out.println("");
        }
    }
}
