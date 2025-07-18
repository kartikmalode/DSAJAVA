import java.util.*;
public class Strings {

    public static boolean isPrime(String str){
        
        for(int i=0; i<=str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;

            }
        
         } return true;
    

    }

    public static float getShortestpath(String path){
        int x=0,y=0;
        for(int i =0; i<path.length(); i++){
            char dir= path.charAt(i);
            if(dir == 'S'){
                y--;
            }else if(dir=='N'){
                y++;
            }
            else if(dir== 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return(float)Math.sqrt(X2+Y2);
        
    }
    public static void main(String[] args) {
        String path= "WNEENESENNN";
        System.out.println(getShortestpath(path));
        
    }
    
}
