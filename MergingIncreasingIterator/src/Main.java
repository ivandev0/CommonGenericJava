/**
 * Created by cilci_000 on 09.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        IncreasingIterator first = new IncreasingIterator(0, 10, 10);
        IncreasingIterator second = new IncreasingIterator(2, 15, 10);
        MergingIncreasingIterator mii = new MergingIncreasingIterator(first,second);

        while (mii.hasNext()) {
            System.out.print(mii.next() + " ");
        }
    }
}
