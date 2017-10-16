/**
 * Created by cilci_000 on 14.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        CyclicArrayDeque<Integer> cyclicArrayDeque = new CyclicArrayDeque<>();
        cyclicArrayDeque.pushFront(1);
        cyclicArrayDeque.pushFront(2);
        cyclicArrayDeque.pushFront(3);
        cyclicArrayDeque.pushBack(4);
        cyclicArrayDeque.pushBack(5);
        System.out.println(cyclicArrayDeque.popBack());
        System.out.println(cyclicArrayDeque.popFront());
        System.out.println(cyclicArrayDeque.popBack());
        System.out.println(cyclicArrayDeque.popBack());
        System.out.println(cyclicArrayDeque.popBack());

        cyclicArrayDeque.pushFront(1);
        cyclicArrayDeque.pushFront(2);
        cyclicArrayDeque.pushFront(3);
        cyclicArrayDeque.pushBack(4);
        cyclicArrayDeque.pushBack(5);
        System.out.println(cyclicArrayDeque.popFront());
        System.out.println(cyclicArrayDeque.popFront());
        System.out.println(cyclicArrayDeque.popFront());
        System.out.println(cyclicArrayDeque.popFront());
        System.out.println(cyclicArrayDeque.popFront());

        cyclicArrayDeque.pushFront(1);
        cyclicArrayDeque.pushFront(2);
        cyclicArrayDeque.pushFront(3);
        cyclicArrayDeque.pushBack(4);
        cyclicArrayDeque.pushBack(5);
        System.out.println(cyclicArrayDeque.popBack());
        System.out.println(cyclicArrayDeque.popBack());
        System.out.println(cyclicArrayDeque.popBack());
        System.out.println(cyclicArrayDeque.popBack());
        System.out.println(cyclicArrayDeque.popBack());
    }
}
