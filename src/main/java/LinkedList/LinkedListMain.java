package LinkedList;


import jdk.jshell.EvalException;

public class LinkedListMain {
    public static void main(String[] args) throws IllegalAccessException {
        LinkedList list = new LinkedList();

        list.addLast(5);
        list.addLast(9);
        list.addLast(6);
        list.addLast(11);
        list.addLast(0);
        list.addFirst(1);
        list.addFirst(1);
        list.deleteFirst();
        int index = list.indexOf(11);
        boolean contains = list.contains(11);
        System.out.println(contains);
        System.out.println(index);
        list.printList(list);
        list.reverse();
        list.printList(list);


    }
}
