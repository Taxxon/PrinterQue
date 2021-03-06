/**
 * Created by emka15 on 2017-03-20.
 */
public class Test {
    public static void main(String[]arg){

        String namn1 = "Emil";
        String namn2 = "Nils";
        String namn3 = "Anton";

        // Testa LinkedList
        LinkedList a = new LinkedList();
        a.addFirst(namn1);
        System.out.println(a.toString());
        a.addFirst(namn2);
        System.out.println(a.toString());
        a.addLast(namn3);
        System.out.println(a.toString());
        System.out.println(a.size());
        System.out.println(a.isEmpty());
        a.removeFirst();
        System.out.println(a.toString());
        a.removeLast();
        System.out.println(a.toString());
        System.out.println(a.size());
        a.removeFirst();
        System.out.println(a.toString());
        System.out.println(a.size());
        System.out.println(a.isEmpty());
        a.removeFirst();
        a.removeLast();

        //Testa PrintQueue
        System.out.println("\n");
        PrintQueue p = new PrintQueue();
        p.enqueue(namn1);
        System.out.println(p.l);
        p.enqueue(namn2);
        System.out.println(p.l);
        p.enqueue(namn3);
        System.out.println(p.l);
        System.out.println(p.isEmpty());
        System.out.println(p.size());
        p.dequeue();
        System.out.println(p.l);
        p.dequeue();
        System.out.println(p.l);
        p.dequeue();
        System.out.println(p.isEmpty());
        System.out.println(p.size());
        p.dequeue();
        System.out.println(p.l);
    }
}
