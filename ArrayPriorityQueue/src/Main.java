public class Main {
    public static void main(String[] args) {
        ArrayPriorityQueue<Integer> arrayPriorityQueue = new ArrayPriorityQueue<>();

        arrayPriorityQueue.add(100);
        arrayPriorityQueue.add(10);
        arrayPriorityQueue.add(5);
        arrayPriorityQueue.add(30);
        arrayPriorityQueue.add(50);
        System.out.println(arrayPriorityQueue.peek());
        System.out.println(arrayPriorityQueue.extractMin());
        System.out.println(arrayPriorityQueue.extractMin());
        System.out.println(arrayPriorityQueue.extractMin());
        System.out.println(arrayPriorityQueue.extractMin());
        System.out.println(arrayPriorityQueue.extractMin());


    }
}
