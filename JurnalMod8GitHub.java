/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmod8github;

/**
 *
 * @author Praktikan
 */
public class JurnalMod8GitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1=0,n2=1,n3,i,count=10;    
        System.out.print(n1+" "+n2);//printing 0 and 1    

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
        {    
         n3=n1+n2;    
         System.out.print(" "+n3);    
         n1=n2;    
         n2=n3;    
        }

    }
    
}
