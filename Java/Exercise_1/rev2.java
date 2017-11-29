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
public class rev2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int[][] num = new int[3][3];
        
        int[][] num2 = {
                       {1,2,3},
                       {4,5,6}
                       };
    
        Random rand = new Random();
        
        
        for(int i=0;i<num2.length;i++)
            for(int j=0;j<num2[i].length;j++)
                num2[i][j]=rand.nextInt(100);
        
        for(int i=0;i<num2.length;i++){
            for(int j=0;j<num2[i].length;j++) 
                System.out.print(num2[i][j]+" ");
            System.out.println("");
        }

        
    }
    
}
