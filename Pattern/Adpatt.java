public class Adpatt {

    public static void main(String[] args) {
        //0-1 traingle
        zeroone(5);
        Buteerfly(5);
        solidrobus(5);
        hollorombus(5);
        diamond(5);

    }
    public static void zeroone(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){

                if ((i+j)%2 == 0) {
                    System.out.print(" 1");
                    
                } else {
                    System.out.print(" 0");
                    
                }
            }
            System.out.println();
        }
    }
    public static void Buteerfly(int m){
        for(int i=1; i<=m; i++){
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");

            }
            
                //spaces
                for(int j=1; j<=2*(m-i); j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }

                System.out.println();
            
        }
        for(int i=m; i>=1; i--){
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");

            }
            
                //spaces
                for(int j=1; j<=2*(m-i); j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }

                System.out.println();
            
        }
    }

    public static void solidrobus(int x){
        for(int i=1; i<=x; i++){
            for(int j=1; j<=x-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=x; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void hollorombus(int y){
        for(int i=1; i<=y; i++){
            for(int j=1; j<=y-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=y; j++){
                if (i==1 ||i==y ||j==1 ||j==y) {
                    System.out.print("*");
                    
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int z){
        for(int i=1; i<=z; i++){
            for(int j=1; j<=z-i; j++){
                System.out.print(" ");
            }
           for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
           }
           System.out.println();
        }
        for(int i=z; i>=1; i--){
            for(int j=1; j<=z-i; j++){
                System.out.print(" ");
            }
           for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
           }
           System.out.println();
        }
        
        
    }
}