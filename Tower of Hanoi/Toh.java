

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Hazim Hanif
 */
public class Toh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stack<Integer> A = new Stack();
        Stack<Integer> B = new Stack();
        Stack<Integer> C = new Stack();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number of plate? :");
        int n = sc.nextInt();
        int res = 3%2;
        double step = Math.pow(2, n)-1;
        int count=0;
        
        for(int i=0 ;i<=n;i++){
            A.push(i);
        }
        
        B.push(0);
        C.push(0);
        
        //The "0" inside the stack implies the base of the stack. 
        
        System.out.printf("\nTotal number of steps to complete: %.0f  \n",step);

        System.out.println("The \"0\" inside the stack implies the base of the stack. ");
                System.out.println("");
        
        display(step,count,A,B,C);
        
        if(res==0){
            
            //AB - AC - BC
            even(step,count,A,B,C);
            
        }else{
            
            //AC - AB - CB
            odd(step,count,A,B,C);
        }
        

    }
    
     
    public static void even(double step,int count,Stack<Integer> A,Stack<Integer> B,Stack<Integer> C){
            
        
            while(true){

                        
                        if(count==step)
                            break;

                    if(A.peek()>B.peek()){
                        B.push(A.pop());
                    }else{
                        A.push(B.pop());
                    }

                count++;
               display(step,count,A,B,C);


                if(count==step)
                  break;

                 if(A.peek()>C.peek()){
                        C.push(A.pop());
                    }else{
                        A.push(C.pop());
                    }

                  count++;
                display(step,count,A,B,C);

                if(count==step)
                      break; 

                  if(B.peek()>C.peek()){
                        C.push(B.pop());
                    }else{
                        B.push(C.pop());
                    }

                 count++;
               display(step,count,A,B,C);


                    }
        }
    
    
    public static void odd(double step,int count,Stack<Integer> A,Stack<Integer> B,Stack<Integer> C){
            
           while(true){

                        
                        if(count==step)
                            break;

                    if(A.peek()>C.peek()){
                        C.push(A.pop());
                    }else{
                        A.push(C.pop());
                    }

                count++;
                display(step,count,A,B,C);

                if(count==step)
                  break;

                 if(A.peek()>B.peek()){
                        B.push(A.pop());
                    }else{
                        A.push(B.pop());
                    }

                  count++;
               display(step,count,A,B,C);

                if(count==step)
                      break; 

                  if(C.peek()>B.peek()){
                        B.push(C.pop());
                    }else{
                        C.push(B.pop());
                    }

                 count++;
                display(step,count,A,B,C);



                    }



        
        }
    
    
    public static void display(double step,int count,Stack<Integer> A,Stack<Integer> B,Stack<Integer> C){
        
         System.out.println("This is step "+count);
                System.out.println("Stack A: "+A);
                System.out.println("Stack B: "+B);
                System.out.println("Stack C: "+C);
                System.out.println("");
        
    }
        
     
     
    
}
