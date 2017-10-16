/**
 * Created by cilci_000 on 13.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        CyclicArrayQueue<Integer> cyclicArrayQueue = new CyclicArrayQueue<>();
        cyclicArrayQueue.enqueue(10);
        cyclicArrayQueue.enqueue(100);
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        cyclicArrayQueue.enqueue(-1);
        cyclicArrayQueue.enqueue(10);
        cyclicArrayQueue.enqueue(100);
        cyclicArrayQueue.enqueue(-1);
        cyclicArrayQueue.enqueue(10);
        cyclicArrayQueue.enqueue(100);
        cyclicArrayQueue.enqueue(-1);
        cyclicArrayQueue.enqueue(10);
        cyclicArrayQueue.enqueue(100);
        cyclicArrayQueue.enqueue(-1);
        cyclicArrayQueue.enqueue(10);
        cyclicArrayQueue.enqueue(100);

        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
        System.out.println(cyclicArrayQueue.dequeue());
    }
}
