import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queueinterlive {

    // queue reversal 
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {
            s.push(q.remove());
            
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
            
        }
    }

// Interlive using queue 
     public static void interlive(Queue<Integer> q){
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();
        for(int i=0; i<size/2; i++){
            firstHalf.add(q.remove());
        }
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
            
        }
     }
    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

       // interlive(q);
        // while (!q.isEmpty()) {
        //     System.out.print(q.remove()+ " ");
        // }
        // System.out.println();
       reverse(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove()+ " ");
        }
        System.out.println();

        
    }
}
