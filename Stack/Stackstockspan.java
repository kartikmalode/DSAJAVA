package Stack;
import java.util.*;
public class Stackstockspan {

    public static void stack(int stock[], int span[]){
        Stack<Integer> s  = new Stack<Integer>();
        span[0] = 1;
        s.push(0);

        for(int i = 0; i<stock.length; i++){
            int currprice = stock[i];
            while (!s.isEmpty() && currprice > stock[s.peek()]) {
                s.pop();
                
            }
            if (s.isEmpty()) {
                span[i] = i+1;
                
            } else {
                int prevhigh = s.peek();
                span[i] = i- prevhigh;
                
            }
            s.push(i);
        }

    }
    public static void main(String[] args) {
        int stock[] = {100,80,60,70,60,85,100};
        int span[] = new int[stock.length];

        stack(stock, span);

        for(int i = 0; i<span.length; i++){
            System.out.println(span[i]+" ");
        }
       System.out.println();
        //next greter element using stack

        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<Integer>();
        int nextgreater[] = new int[arr.length]; 

        for(int i =arr.length-1; i>=0; i--){
            //1 while
            while (!s.isEmpty() && arr[s.peek()]<= arr[i]) {
                s.pop();
                
            }
            //2 if else
            if (s.isEmpty()) {
                nextgreater[i] = -1;
                
            } else {
                nextgreater[i] = arr[s.peek()];
                
            }

            //3 push s
            s.push(i);

        }

        for(int i = 0; i<nextgreater.length; i++){
            System.out.print(nextgreater[i]+ " ");
        }
        System.out.println();



        
        
    }
}
