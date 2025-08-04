import java.util.*;
public class Dequepr {

    // stack  using deque
    static class Stack {
    Deque<Integer> dqe = new LinkedList<>();

    public static void push(int data){
        dqe.addLast(data);
    }
    public static int pop(){
        return dqe.removeLast();
    }
    public static int peek(){
        return dqe.getLast();
    }
        
    }
    // queue using deque

    static class Queue {
        Deque<Integer> dqueue = new LinkedList<>();
    
        public static void add(int data){
            dqueue.addLast(data);
        }
        public static int remove(){
            return dqueue.removeFirst();
        }
        public static int peek(){
            return dqueue.getFirst();
        }
            
        }

    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<Integer>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        System.out.println(dq);
         dq.addLast(5);

         Stack s = new Stack();
         s.push(1);
         s.push(2);
         s.push(3);
         System.out.println("peek"+ s.peek());
         System.out.println(s.pop());
         System.out.println(s.pop());

         Queue q = new Queue();
         q.add(1);
         q.add(2);
         q.add(3);
         System.out.println("peek"+ q.peek());
         System.out.println(q.remove());
         System.out.println(q.remove());
    }
}


