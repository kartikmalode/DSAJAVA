public class RecursionBasic {
    public static void main(String[] args) {
        int n=5;
        printdec(n);
       System.out.println(fact(n));
       System.out.println(Calsum(n));
       System.out.println(Fibonochi(n));
       int arr[]= {5,5,5,5};
      System.out.println(Issorted(arr, 0));

     System.out.println(Firstoccurence(arr, 5, 0));

       System.out.println(Lastoccurence(arr, 5, 0));

       System.out.println(power(10, 2));
       System.out.println(optimisedpower(2, 5));
       System.out.println(Tillingpr(4));

       String str = "appnacollege";
       RemoveDuplicate(str, 0, new StringBuffer(""), new boolean[26]);

       System.out.println(friendspair(3));
       PrintBinary(3, "", 0);
    }
    public static void printdec(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        //swap this below to line for printing the decresing order
        printdec(n-1);
        System.out.print(n+" ");
        
    }//facorial no
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n* fact(n-1);
        return fn;
    }

    //print first natural number sum
    public static int Calsum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = Calsum(n-1);
        int sn = n+Calsum(n-1);
        return sn;

    }
    // print fibbonochi series
    public static int Fibonochi(int n){
        if(n==0 || n==1){
            return n;
        }

        int fnm1 = Fibonochi(n-1);
        int fnm2 = Fibonochi(n-2);
        int fn = fnm1+fnm2;
        return fn;
    }

    //check the array is sorted or not
    public static boolean Issorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if (arr[i]> arr[i+1]) {
            return false;
            
        }
        return Issorted(arr, i+1);
    }

    //first occurence of an array
    public static int Firstoccurence(int arr[],int key,int i){
        if (i==arr.length) {
            return -1;
            
        }
        if(arr[i]==key){
            return i;
        }
        return Firstoccurence(arr, key, i+1);
    }


        //last occurence of an array
        public static int Lastoccurence(int arr[],int key,int i){
            if (i==arr.length) {
                return -1;
                
            }
            int isFound = Lastoccurence(arr, key, i+1);
            if (isFound != -1 ) {
                return isFound;
            }
            if (arr[i]== key) {
                return i;
            }
            return isFound;

        }

        // print xto the power of n
        public static int power(int x, int n){
            if(n==0){
                return 1;
            }
            int xnm1 = power(x, n-1);
            int xn = x* xnm1;
            return xn;
            //in single line = return x*power(x,n-1);
        }
        // power in optimized code
        public static int optimisedpower(int a,int n){
            if (n==0) {
                return 1;
                
            }
            int halfpwr = optimisedpower(a, n/2);
            int halfpwrsq = halfpwr * halfpwr;
            if (n%2 !=0) {
                halfpwrsq = a*halfpwrsq;
                
            }
            return halfpwrsq;

        }


        //tilling problem

        public static int Tillingpr(int n){
            if (n==0|| n==1) 
            return 1;{
                
            }
            int fnm1 = Tillingpr(n-1);
            int fnm2 = Tillingpr(n-2);
            int total = fnm1+ fnm2;
            return total;
        }

        //removing duplicate 
        public static void RemoveDuplicate(String str, int idx, StringBuffer newstr,boolean map[]){

            if (idx == str.length()) {
                System.out.println(newstr);
                return;
                
            }
            char currchar= str.charAt(idx);
            if (map[currchar-'a']==true) 
            {
                RemoveDuplicate(str, idx+1, newstr, map);
            } else {
                map[currchar-'a'] = true;
                RemoveDuplicate(str, idx+1, newstr.append(currchar), map);
            }
        }

        // friends pairing problem
        public static int friendspair(int n){
            if (n==1||n==2) {
                return n;
            }
            return friendspair(n-1)+ (n-1)*friendspair(n-2);

        }

        //print binary string

        public static void PrintBinary(int n, String str, int lastplace){
            if (n==0) {
                System.out.println(str);
               return; 
            }
            PrintBinary(n-1, str+"0", 0);
            if (lastplace==0) {

                PrintBinary(n-1, str+"1", 1);
            }
        }

}
