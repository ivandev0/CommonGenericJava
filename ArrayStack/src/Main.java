/**
 * Created by cilci_000 on 09.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        arrayStack.push(10);
        arrayStack.push(100);
        arrayStack.push(-1);
        arrayStack.push(10);
        arrayStack.push(100);
        arrayStack.push(-1);
        arrayStack.push(10);
        arrayStack.push(100);
        arrayStack.push(-1);
        arrayStack.push(10);
        arrayStack.push(100);
        arrayStack.push(-1);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
    }
}
