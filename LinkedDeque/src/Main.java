/**
 * Created by cilci_000 on 14.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        LinkedDeque<Integer> linkedDeque = new LinkedDeque<>();
        linkedDeque.pushFront(1);
        linkedDeque.pushFront(2);
        linkedDeque.pushFront(3);
        linkedDeque.pushFront(4);
        linkedDeque.pushFront(5);
        System.out.println(linkedDeque.popFront());
        System.out.println(linkedDeque.popFront());
        System.out.println(linkedDeque.popBack());
        System.out.println(linkedDeque.popBack());

        linkedDeque.pushBack(-4);
        linkedDeque.pushBack(-5);
        System.out.println(linkedDeque.popFront());
        System.out.println(linkedDeque.popFront());
    }
}
