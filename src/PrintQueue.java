/**
 * Created by Emil Käck on 2017-03-27.
 */
public class PrintQueue {
    LinkedList l = new LinkedList();

    public boolean isEmpty(){
        return l.isEmpty();
    }

    public int size(){
        return l.size();
    }

    public void enqueue(String insertData){
        l.addLast(insertData);
        l.toString();
    }

    public String dequeue(){
        String temp = l.toString();
        l.removeFirst();
        return temp;
    }
}
