import java.util.*;
public class Arraylistcontainer {
    public static void main(String[] args) {
        //array list container with water
        ArrayList<Integer> height = new ArrayList<Integer>();
        height.add(11);
        height.add(15);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);
       // height.add(8);
        //height.add(3);
        //height.add(7);
        //System.out.println(containerwater(height));
        int tar = 16;
       // System.out.println(pairsum(height, tar));
        System.out.println(pairsum2(height, tar));

    }
   /*  public static int containerwater( ArrayList<Integer> height){
        int maxwater = 0;
        int lp =0;
        int  rp =height.size()-1;

        while (lp<rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int wd = rp-lp;
            int currwater = ht*wd;
            maxwater = Math.max(maxwater, currwater);

            if (height.get(lp)<height.get(rp)) {
                lp++;
                
            }else{
                rp--;
            }
            
        }
        return maxwater;



    }
    //pair sum 2 approach
    public static boolean pairsum(ArrayList<Integer> height, int tar){
      int lp =0;
      int rp = height.size()-1;
      while (lp!=rp) {

        if (height.get(lp)+height.get(rp)==tar) {
            return true;
            
        }
        if (height.get(lp)+height.get(rp)<tar) {
            lp++;
        }else{
            rp--;

        }
        
        
      } 
      return false; 
    
    }*/
// pair sum or sorted and roteted array
    public static boolean pairsum2(ArrayList<Integer> height, int tar){
        int bp = -1;
        int n = height.size();
        for(int i=0; i<height.size();i++){
            if (height.get(i)>height.get(i+1)) {//breking pont
                bp =i;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;

        while (lp!=rp) {

            if (height.get(lp)+height.get(rp)==tar) {
                return true;
                
            }
            if (height.get(lp)+height.get(rp)<tar) {
                lp = (lp+1)%n;
            }else{
                rp = (n+rp-1)%n;
    
            }


    }
    return false;
}
}

    

