import java.util.*;
import java.util.ArrayList;
public class Arraylists {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<Boolean> list2 = new ArrayList<Boolean>();

        list.add(2);
        list.add(5);
        list.add(3);
        list.add(6);

        //one or add method
        list.add(1,9);
        System.out.println(list);

       //int getelement = list.get(2);
       // System.out.println(getelement);

        list.remove(2);
        System.out.println(list);

       //set operation to set the index  the new value
        list.set(2, 10);
        System.out.println(list);

        //contains operation is use to the array the number is exits or not of the given index
        System.out.println(list.contains(2));
        System.out.println(list.contains(20));


        //size method to check the size of array

        System.out.println(list.size());

        //print arraylist
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();


        //reverse print
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();



        //find the maximum element of arrlist
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if (max< list.get(i)) {
               max = list.get(i);
                
            }
        }
        System.out.println("maimum element is "+max);


        //swaping the numbers in array
        int indx1 = 2 ,indx2 = 3;
        System.out.println(list);

        swap(list, indx1, indx2);
        System.out.println(list);


        //sorting an array list
        Collections.sort(list);// for ascending order
        System.out.println("asen"+list);

        //for descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);



        //multidimentional arraylist

        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();

        l1.add(5);
        l1.add(6);
        mainlist.add(l1);
        l2.add(6);
        l2.add(78);
        mainlist.add(l2);

        System.out.println(mainlist);

        for(int i=0; i<mainlist.size(); i++){
            ArrayList<Integer> cur = mainlist.get(i);
            for(int j=0; j<cur.size(); j++){
                System.out.print(cur.get(j)+" ");
            }
            System.out.println();
        }





        
    }
    public static void swap(ArrayList<Integer> list, int indx1, int indx2){
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }
    
}
