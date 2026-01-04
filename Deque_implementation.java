import java.util.*;

public class Deque_implementation {

    public static void main(String args[]){
        Deque<Integer> d= new LinkedList<>();
        d.addFirst(3);
        d.addLast(5);
        System.out.print(d);
        d.removeLast();
        d.removeFirst();

    }
}