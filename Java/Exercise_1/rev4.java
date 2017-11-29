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
public class rev4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] even =new int[10];
        int[] odd =new int[10];
        
        even=myEven(even);
        odd=myOdd(odd);
        
        System.out.println("Even num:");
        for(int i=0;i<even.length;i++)
            System.out.print(even[i]+" ");
        
        System.out.println("\nOdd num:");
        for(int i=0;i<odd.length;i++)
            System.out.print(odd[i]+ " ");
        
        int[][] combined=myCombine(even,odd);
        
        System.out.println("\nCombined:");
        for(int i=0;i<combined.length;i++){
            for(int j=0;j<combined[i].length;j++) 
                System.out.print(combined[i][j]+" ");
            System.out.println("");
        }
        
    }
    
    public static int[] myEven(int[] myArray){
        
        int num;
        Random rand = new Random();
        
        for(int i=0;i<myArray.length;i++){
            
            do{
                num=rand.nextInt(100)+1;
            }while(num%2==1);
            
            myArray[i]=num;
        }
        
        return myArray;
        
    }
 
    public static int[] myOdd(int[] myArray){
        
        int num;
        Random rand = new Random();
        
        for(int i=0;i<myArray.length;i++){
            
            do{
                num=rand.nextInt(100)+1;
            }while(num%2==0);
            
            myArray[i]=num;
        }
        
        return myArray;
        
    }
    
    public static int[][] myCombine(int[] even,int[] odd){
        
        int[][] my2D = new int[2][odd.length];
        
        for(int i=0;i<2;i++)
            for(int j=0;j<odd.length;j++)
                if(i==0)
                    my2D[i][j]=even[j];
                else
                    my2D[i][j]=odd[j];
        
        return my2D;
        
    }
    
    
}
