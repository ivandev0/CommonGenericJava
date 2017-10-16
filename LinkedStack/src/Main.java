/**
 * Created by cilci_000 on 09.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        LinkedStack<Integer> linkedStack = new LinkedStack<>();

        linkedStack.push(1);
        linkedStack.push(2);
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        linkedStack.push(1);
        linkedStack.push(-4);
        System.out.println(linkedStack.pop());
    }
}
