package ru.schepin.examples.queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue queue = new LinkedList<Integer>();


        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }

        Object poll = queue.poll();
        System.out.println(poll);
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(((LinkedList) queue).get(3));
        System.out.println(queue.offer(156));
        System.out.println(((LinkedList) queue).peekLast());

        System.out.println(queue.peek());
        System.out.println(((LinkedList) queue).peekFirst());

        ((LinkedList) queue).offerLast(5456);

        System.out.println();
        Iterator iterator = ((LinkedList) queue).listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        boolean contains = queue.contains(5);
        System.out.println(contains);
        Collection<Integer> integers = new ArrayList<>();

        Stack<Integer> integers1 = new Stack<>();
        integers1.push(5);
        int search = integers1.search(5);
        System.out.println(search);

    }
}
