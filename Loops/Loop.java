import java.util.Scanner;

public class Loop {

    public static void main(String args[]){

       /* for(int i= 1; i<=4; i++){
            System.out.println();
        } 

        int n = 10899;
        while(n>0){
            int lastDigit= n%10;
            System.out.print(lastDigit);
            n/=10;
        }System.out.print("");
        int n = 10899;
        int rev = 0;
        while(n>0){
          int lastDigit = n%10;
          rev = rev*10+lastDigit;
          n/=10;
        }System.out.println(rev);*/

        Scanner sc = new Scanner(System.in);

        do{
            int n = sc.nextInt();

            if (n%10==0) {
                break;//also use continue to skip the value
            }
          System.out.println(n);
        }while(true);

    } 
}
