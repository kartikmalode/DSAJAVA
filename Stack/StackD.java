import java.util.*;

public class StackD {

    /*public  static class Node{
        int data;
        Node next;
         Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;
        public static boolean isempty(){
            return head==null;
        }

        public static void push(int data){
         Node newNode = new Node(data);
         if (isempty()) {
            head = newNode;
            return;
            
         }
         newNode.next = head;
         head = newNode;

        }
        public  static int pop(){
            if (isempty()) {
                return -1;
                
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if (isempty()) {
                return -1;
                
            }
            return head.data;
        }
        

    }

    static class StackAL{

        //stack using arraylist

        static ArrayList<Integer> list = new ArrayList<Integer>();
        public static boolean isEmpty(){
            return list.size() ==0;

        }

        //push
        public void push(int data){
            list.add(data);
        }

        //pop
        public int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public int peek(){
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
    }*/

    // amazon 
    public static void pushAtbottom(Stack<Integer> s, int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtbottom(s, data);
        s.push(top);
    }

    //imp que Reverse a string using stack
  /*  public static String reversestring(String str){
        Stack<Character> s = new Stack<Character>();
        int idx = 0;
        while (idx<str.length()) {
            s.push(str.charAt(idx));
            idx++; 
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
           char curr = s.pop();
           result.append(curr);
            
        }
        return result.toString();
    }*/ 
    
    
    //reverse a stack

    public static void reversestack(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
            
        }
        int top = s.pop();
        reversestack(s);
        pushAtbottom(s,top);
    }
    public static void printstack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
            
        }
    }
    
    public static void main(String[] args) {
       // Stack s = new Stack();
       Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);

        /*pushAtbottom(s,4);

        while (!s.isEmpty()) {
          //  System.out.println(s.peek());
          System.out.println(s.pop());  
            
        }
       // String str = "abc";
       // String result = reversestring(str);
        // System.out.println(result);*/

        reversestack(s);
        printstack(s);
        
    }
}
