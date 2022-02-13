import java.util.*;
import java.io.*;

/*
class A
{
void bark()
{
System.out.println("eating");
}
}

class B 
{
void bark()
{
System.out.println("barking");
}
}

class C extends B, A
{
 
    void sleep()
    {
        System.out.println("sleeping");
    }
}


c.bark();

class D extends B
{
    void dance()
    {
        System.out.println("dancing");
    }
}

*/


public class StacksAndQueues
{
    public static void main(String[] args)
    {   
        //B b = new B();
       // A a = new A();
        //b.eat();
        ///b.bark();/////
        //
        //C c = new C();
        //c.eat();
        //c.bark();
        //c.sleep();




        /*

            static int sum_ofNumbers(int a, int b)
    {
        return a+b;
    }

    static int sum_ofNumbers(int a, int b, int c)
    {
        return a+b+c;
    }

    static int sum_ofNumbers(long a, int b, int c)
    {
        return (int)a+b+c;
    }

        long a = 5;
        int b = 2;
        int c = 5;
        int sum = sum_ofNumbers(a,b,c);
        System.out.println(sum);

     






     
        
        // Create a new stack
        Stack<Integer> s = new Stack<Integer>();

        // Check if the s is empty
        System.out.println("Is s empty? " + s.empty()); // true

        // Push elements to the stack
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        // Print the s
        System.out.println("s: " + s);
        // [5 4 3 2 1]: MEMORY, Top: 5, In representation: [1 2 3 4 5]

        System.out.println("Size: " + s.size()); //5

        // Pop elements from the s
        System.out.println("Popped element: " + s.pop()); // [4 3 2 1]
        System.out.println("Popped element: " + s.pop()); // [3 2 1]
        System.out.println("Popped element: " + s.pop()); // [2 1]
        System.out.println("s: " + s);// [2 1]: memory, representation: [1 2]
        System.out.println("Size: " + s.size()); //2

        // Peek at the top element
        System.out.println("Top element: " + s.peek()); // 2

        // Check if the s is empty
        System.out.println("Is s empty? " + s.empty()); // false

        // Clear the s
        //s.clear();

*/




        



        // Create a new queue
        Queue<Integer> queue = new LinkedList<Integer>();
        //Size of Queue
        System.out.println("Size: " + queue.size());//0
        System.out.println("Is queue empty? " + queue.isEmpty()); // true

        // Enqueue elements to the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // Print the queue
        System.out.println("Queue: " + queue); //[1 2 3 4 5]

        // Dequeue elements from the queue
        System.out.println("Dequeued element: " + queue.remove()); //[2 3 4 5]
        System.out.println("Dequeued element: " + queue.remove()); //[3 4 5]
        System.out.println("Dequeued element: " + queue.remove()); //[4 5]
        System.out.println("Queue: " + queue);  //[4 5]

        // Check front element
        System.out.println("Front element: " + queue.element()); //4

        // Size of Queue
         System.out.println("Size: " + queue.size()); // 2
       
        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // false

        // Clear the queue
       // queue.clear();




        
    }
}


