public class Backtracking {
    public static void main(String[] args) {
        int arr[]= new int[5];
        changearr(arr, 0, 1);
        printarr(arr);
        String str ="abc";
        findsubset(str, " ", 0);

        permutation(str, "");
        
    }
    public static void printarr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    public static void changearr(int arr[], int i, int val){
        if (i ==arr.length) {
            printarr(arr);
            return;
            
        }
        arr[i] = val;
        changearr(arr, i+1, val+1);
        arr[i] = arr[i]-2;
        
    }
    //fin d subset

   public static void findsubset(String str, String ans, int i){
    //base case
    if (i== str.length()) {
        System.out.println(ans);
        return;
    }
    //yes choice
    findsubset(str, ans+str.charAt(i), i+1);
    //no choice
    findsubset(str, ans, i+1);
   }
    //find permutation
    public static void permutation(String str, String ans){
        if (str.length()==0) {
            System.out.println(ans);
            return;
            
        }
        for(int i=0; i<str.length();i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0, i)+ str.substring(i+1);
            permutation(newstr, ans+curr);
        }
    }
}
