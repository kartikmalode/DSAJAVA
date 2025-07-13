import java.util.*;

public class Abc{

    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    int week = sc.nextInt();
     switch(week){
        case 1: System.out.println("Sunday");
           break;
        case 2: System.out.println("Monday");
        break;
         case 3: System.out.println("Tuesday");
         break;
          case 4: System.out.println("Wensday");
          break;
           case 5: System.out.println("Thirsday");
           break;
            case 6: System.out.println("Friday");
            break;
             case 7: System.out.println("saturday");
             break;
             default:  System.out.println("invalid");

     }
    }
}