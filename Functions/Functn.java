import java.util.Scanner;

public class Functn {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int palindome = sc.nextInt();

        if (Palin(palindome)) {
            System.out.println("Number "+palindome +" is palindome");
            
        } else {
            System.out.println("Number "+palindome +" is not palindome");

        }

    }

    public static boolean Palin(int num){
        int palindome = num;
        int reverse = 0;

        while (palindome!=0) {
            int reminder = palindome%10;
            reverse = reverse*10+reminder;
            palindome = palindome/10;
            
        }
        if (num ==reverse) {
            return true;
            
        } else {
            return false;
            
        }
       

    }
}
    

