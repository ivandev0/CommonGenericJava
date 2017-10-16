/**
 * Created by cilci_000 on 13.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        LinkedQueue<Integer> linkedStack = new LinkedQueue<>();

        linkedStack.enqueue(1);
        linkedStack.enqueue(2);
        System.out.println(linkedStack.dequeue());
        System.out.println(linkedStack.dequeue());
        System.out.println(linkedStack.dequeue());
        linkedStack.enqueue(1);
        linkedStack.enqueue(-4);
        System.out.println(linkedStack.dequeue());
        linkedStack.enqueue(3);
        System.out.println(linkedStack.dequeue());
    }
}
