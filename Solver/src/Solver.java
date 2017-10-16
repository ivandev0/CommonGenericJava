import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) ) = 101
 * ( 1 + ( 5 * ( 4 * 5 ) ) ) = ( 1 + ( 5 * 20 ) ) = 101
 * ( 1 + 100 ) = 101
 *
 * Считаем, что операции деления на ноль отсутствуют
 */
 /*class LinkedList {
    private class Node{
        String data;
        Node next, previous;

        Node(String data, Node next, Node previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }
    }
    private Node first, last;
    private int size = 0;

    void addLast(String n){
        if(first == null){
            first = new Node(n, null, null);
            last = first;
        } else {
            Node temp = new Node(n, null, last);
            last.next = temp;
            last = temp;
        }
        size++;
    }
    void insert(String n, int position){
        if(size == 0)
            addLast(n);
        if(position > size)
            return;
        if(position == 0){
            Node temp = new Node(n, first, null);
            first.previous = temp;
            first = temp;
            size++;
            return;
        }
        Node current = first.next, previous = first;
        for(int j = 2; j < position; j++){
            previous = current;
            current = current.next;
        }
        Node temp = new Node(n, current, previous);
        current.previous = temp;
        previous.next = temp;
        size++;
    }
    void remove(int i){
        if(i >= size)
            return;
        if(i == 0){
            if(first.next != null)
                first.next.previous = null;
            first = first.next;
            size--;
            return;
        }
        Node current = first.next, previous = first;
        for(int j = 2; j <= i; j++){
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
        if(i != size - 1)
            current.next.previous = previous;
        size--;
    }
    String get(int i){
        if(i >= size)
            return null;
        Node node = first;
        for(int j = 1; j <= i; j++){
            node = node.next;
        }
        return node.data;
    }
    int size(){
        return size;
    }
    String[] getArray(int begin, int end){
        String[] result = new String[end - begin];

        Node node = first;
        for(int i = 1; i <= begin+1; i++){
            node = node.next;
        }

        for(int i = begin + 1; i < end; i++){
            result[i - begin] = node.data;
            node = node.next;
        }

        return result;
    }

}*/
public class Solver {

    private static final String QUIT = "q";

    private static final char LEFT_PAREN   = '(';
    private static final char RIGHT_PAREN  = ')';
    private static final char PLUS         = '+';
    private static final char MINUS        = '-';
    private static final char TIMES        = '*';
    private static final char DIVISION     = '/';

    private static double evaluate(String[] values) {
        LinkedList<String> list = new LinkedList<>();
        for (String str: values) {
            list.push(str);
        }


        while (true) {
            int parenIndex = 0;
            for (int i = 0; i < list.size(); i++) {
                if(parenIndex != 0){
                    if(list.get(i).equals(String.valueOf(RIGHT_PAREN))){
                        //считай
                        parenIndex--;
                        String[] str = (String[])list.getArray(parenIndex, i);
                        String result = calculate(str);
                        for(int j = parenIndex; j <= i; j++){
                            list.remove(parenIndex);
                        }
                        list.insert(result, parenIndex);

                        i -= parenIndex;
                        parenIndex = 0;
                        continue;
                    }
                }
                if(list.get(i).equals(String.valueOf(LEFT_PAREN)))
                    parenIndex = i + 1;
            }
            if(list.size() == 1)
                break;
        }
        return Double.parseDouble(list.get(0));
    }

    public static void main(String[] args) {
        try (BufferedReader lineReader = new BufferedReader(new InputStreamReader(System.in))) {
            String sequence;
            while (!QUIT.equals(sequence = lineReader.readLine())) {
                System.out.println(evaluate(sequence.split(" ")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String calculate(String str[]){
        String result = "";
        double a = Double.parseDouble(str[0]);
        double b = Double.parseDouble(str[2]);
        switch (str[1].charAt(0)){
        case PLUS:
            result = String.valueOf(a+b);
            break;
        case MINUS:
            result = String.valueOf(a-b);
            break;
        case TIMES:
            result = String.valueOf(a*b);
            break;
        case DIVISION:
            result = String.valueOf(a/b);
            break;
        }
        return result;
    }

}
