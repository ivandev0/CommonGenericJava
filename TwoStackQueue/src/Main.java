/**
 * Created by cilci_000 on 13.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        TwoStackQueue<Integer> twoStackQueue = new TwoStackQueue<>();
        twoStackQueue.enqueue(-1);
        twoStackQueue.enqueue(4);
        twoStackQueue.enqueue(3);
        twoStackQueue.enqueue(2);
        System.out.println(twoStackQueue.dequeue());
        System.out.println(twoStackQueue.dequeue());
        System.out.println(twoStackQueue.dequeue());
        System.out.println(twoStackQueue.dequeue());
        System.out.println(twoStackQueue.dequeue());
        System.out.println(twoStackQueue.dequeue());
    }
}
