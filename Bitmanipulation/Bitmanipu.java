public class Bitmanipu {
    public static void main(String[] args) {
      /*   int x=3,y=4;
        System.out.println("Before swap: x = "+x+" and y = "+y);//swap using xor
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("Before swap: x = "+x+" and y = "+y);//swap using xor*/
        //set the 6th bit means bit ko 1 kardo
        int x= 11;
        x= x|(1<<6);
        System.out.println(x);


        //clear a bit bit ko 0 kardo
        int y= 9;
        y = y& (~(1<<3));
        System.out.println(y);

    }

    
}
