package LinkedList;

public class LinkedList {

    private Node first;
    private Node last;

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    //addFirst
    public void addFirst(int item) {
        var node = new Node(item);

        if (first == null) {
            first = last = node;
        }
        else {
            Node temp = first;
            first = node;
            first.next = temp;
        }
    }

    //addLast
    public void addLast(int item) {
        var node = new Node(item);

        if (first == null) {
            first = last = node;
        }
        else {
            last.next = node;
            last=node;
        }
    }

    //deleteFirst
    public void deleteFirst() {
        first = first.next;
    }

    //index of
    public int indexOf(int item) throws IllegalAccessException {
        int count = 0;
        var currNode = first;

        if (first == null) {
            throw new IllegalAccessException("List is empty");
        }
        else{
            while (currNode!=null){
                if (currNode.value==item){
                    return count;
                }
                currNode=currNode.next;
                count++;
            }
        }
        return -1;
    }

    public boolean contains(int item) {
        var currNode = first;
        while (currNode != null) {
            if (currNode.value == item) {
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }

    public void reverse(){
        var curr = first.next;
        var prev = first;

        while(curr!=null){
            var next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
//            System.out.println("\ncurrent value: "+curr.value);
//            System.out.println("prev value: "+prev.value);
//            System.out.println("next value: "+next.value);
//            System.out.println("===========================");
        }
        last = first;
        last.next =null;
        first=prev;

    }

    //deleteLast
    public void deleteLast() throws IllegalAccessException {
        var currNode = first.next;
        var prev = first;

        if (currNode == null) {
            first=last=null;
        } else if (first == null) {
            throw new IllegalAccessException("list is empty");
        } else {
            while (currNode != null) {
                if (currNode.next != null) {
                    prev = currNode;
                }
                currNode =currNode.next;

            }
            currNode=prev;
            last=currNode;
            last.next=null;

        }


    }

    //deleteItem
    public void deleteItem(int item) {
        var node = new Node(item);

        if (first == null) {
            try {
                throw new IllegalAccessException("can't delete from an empty list");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } else {
            var currNode = first;

            while (currNode != null) {
                if (currNode.value == item)  {
                    if (currNode.next != null) {
                        currNode = currNode.next;
                    }
                    else {

                    }
                }
                if (currNode != null) {
                    currNode= currNode.next;
                }

            }
        }
    }
    public void size(){

    }
    public void printList(LinkedList list) {
        var currNode = list.first;
        System.out.print("\nLinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.value+" ");
            currNode=currNode.next;
        }
    }


    //deleteLast

    //contains

    //indexOf
}
