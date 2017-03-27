/**
 * Created by Emil Käck on 2017-03-20.
 */
public class LinkedList {

    Node first;
    Node last;

    private class Node {

        public String data;
        Node next;
    }

    public Node addFirst(String insertData) {

            Node newNode;
            newNode = new Node();
            newNode.data = insertData;
            newNode.next = first;
            if (isEmpty()){
                first = newNode;
                last = newNode;
                return newNode;
            } else {
                first = newNode;
                first.next = newNode.next;
                return newNode;
            }
        }

    public Node addLast (String insertData) {

        Node newNode;
        newNode = new Node();
        newNode.data = insertData;
        newNode.next = null;

        if (isEmpty()) {
            first = newNode;
            last = newNode;
            return newNode;
        } else {
            last.next = newNode;
            last = newNode;
            return newNode;
        }
    }

    public boolean isEmpty(){

        return (first == null);
    }

    public Node removeFirst(){

        first = first.next;
        return (first);
    }

    public Node removeLast(){

        Node a = new Node();
        a = first;
        while ( a.next != last){
            a = a.next;
        }
        a.next = null;
        last = a;
        return (a);
    }

    public int size(){

        int size = 0;
        Node a = first;
        if (a == last){
            return 1;
        }
        else if (a == null){
            return 0;
        }else

         while (a != null){
            a = a.next;
            size ++;
        }
        return size;
    }

    public String toString(){

        String output = "";
        Node currNode = first;
        while (currNode != null){
            output += currNode.data + "->";
            currNode = currNode.next;
        }
        return (output);
    }
}


