import java.util.*;
public class Stringpr {

    //anagrams = same character but in different order
    public static void anagrams(String str1 , String str2){

        char[] s1arr = str1.toCharArray();
        char[] s2arr = str2.toCharArray();

        Arrays.sort(s1arr);
        Arrays.sort(s2arr);
        System.out.println(Arrays.equals(s1arr,s2arr));


    }




    public static void main(String[] args) {
        String str1 = "eat";
        String str2 = "tea";
    /*   Scanner sc = new Scanner(System.in);
       // String str = sc.nextLine();
        int count = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch =='e' || ch=='i'||ch=='o' ||ch=='u' ){

                count++;
            }
        }*/
       // System.out.println("lower case vowel count is "+count);
        anagrams(str1, str2);

    }

    
}
