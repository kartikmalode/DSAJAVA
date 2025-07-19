
import java.util.*;

public class Array {

   /*  public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i <numbers.length; i++){
            if(largest<numbers[i]){
                largest= numbers[i];
            }
        }
        return largest;

    }

    public static void printpairs(int numbers[]){
        int tp=0;
        for(int i= 0; i<numbers.length; i++){
            
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.err.print("(" +curr +","+numbers[j] +")");
                tp++;
            }
            System.out.println();

        }
        System.out.println("total pairs"+ tp);
        
    }

    public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;

        while (first<last) {

            int temp = numbers[last];
            numbers[last]  = numbers[first];
            numbers[first]= temp;

            first++;
            last--;
            
        }
       

    }*/

    public static void subarray(int numbers[]){
        int tp = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i+1; j<numbers.length; j++){
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.print(numbers[k]);
                }
                      tp++;
                System.out.println();
            }
            System.out.println();
        }System.out.println(tp+" ");
    }

    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<numbers.length; i++){
            cs = cs+numbers[i];
            if(cs<0){
                cs= 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println(ms);

    }
        
    
    public static void main(String[] args) {

        int numbers[] = {-2,-3,4,-1,-2,5,-1};
        kadanes(numbers);
      //  System.out.println("largrst no "+getlargest(numbers));
      // reverse(numbers);
      /*  for(int i= 0; i<numbers.length; i++){
        System.out.print(numbers[i]+" ");
       }
       System.out.println();*/

     //  printpairs(numbers);

     //subarray(numbers);
        


    }
}
