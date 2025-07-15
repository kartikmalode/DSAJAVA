import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int fact=1;
        System.out.println("enter positive integer");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            fact*=i;
        }
        System.out.println("Factorial" +fact);
    }
    
}

/* 



import java.util.*;
class Factorial {
public static void printMultiplicationTable(int number){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number:");
int n = sc.nextInt();
for(int i=1; i<=10; i++) {
System.out.println(n + " * " + i + " = " + n*i);
}
}
public static void main(String s[]) {
printMultiplicationTable(5);
}
}
*/