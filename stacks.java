import java.util.ArrayList;

public class stacks{
    public static class Stack{
        static ArrayList<Integer> List = new ArrayList<>();

        public static boolean isEmpty(){
            return List.size()==0;
        }
        public static void push(int data){
            List.add(data);
        }
        public static int pop(){
            int top = List.size()-1;
            List.get(List.size()-1);
            return top;
        }
        public static int peek(){
            return List.size()-1;
        }
    }


    public static void main(String args[]){
        Stack.push(3);//bottom
        Stack.push(4);
        Stack.push(5);//Top
        System.out.print(Stack.List);

    }
}