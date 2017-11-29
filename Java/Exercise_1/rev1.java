/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

import java.util.Random;

/**
 *
 * @author pensyarah
 */
public class rev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] mcd = new int[10];
        
        Random rand = new Random();
        
        for(int i =0;i<mcd.length;i++)
            mcd[i] = rand.nextInt(100);
        
        System.out.println("Unsorted: ");
        for(int i =0;i<mcd.length;i++)
            System.out.print(mcd[i]+" ");

        
        for(int i=0;i<mcd.length;i++)
            for(int j=1;j<mcd.length;j++)
                if(mcd[i]>mcd[j]){
                    int temp=mcd[i];
                    mcd[i]=mcd[j];
                    mcd[j]=temp;
                }
        
        System.out.println("\nSorted: ");
        for(int i =0;i<mcd.length;i++)
            System.out.print(mcd[i]+" ");
        
    }
    
}
