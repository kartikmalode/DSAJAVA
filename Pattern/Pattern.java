public class Pattern {
    public static void main(String[] args) {

           for(int i=5; i>=1; i--){ // for(int i=1;i<=5; i++){
             for(int x=1; x<i; x++){//for(int x=5; x>i; x--){
                System.out.print(" ");
            }
            for(int j=5; j>=i; j--){//for(int j=1; j<=i; j++){
                System.out.print(j);
                
            }
            System.out.println();
        }

        int count = 1;

        for(int i=3; i>=1; i--){
            for(int x=3; x>i; x--){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(count);
                count++;
                
            }
          
            System.out.println();
        }


        int m =5;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=m; j++){
                if(i==1 ||j==1 ||j==m ||i==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }








       
       int n = 5;
       for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            if(i-j==0 || i+j == n+1 ){

            System.out.print("*");
            }else{
                System.out.print(" ");

            }
        }
        System.out.println();
        
       }
       
       
    
        
         int n1 = 5;
        int num= 1;
        for(int i=1; i<=n1; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" "+num);
                num++;
            }
            System.out.println();

        }





       int n2=4;
        char ch = 'A';
        for(int i=1; i<=n2; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
      
      
      
      
      
         int n3 = 5;
        for(int i =1; i<=n3; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
        
        
        
       int n4 =4;
        for(int i = 1; i<=n4; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
        System.out.println();
        }
        


        for(int i = 1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
