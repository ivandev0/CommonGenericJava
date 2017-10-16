/**
 * Created by cilci_000 on 09.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        PeekingIncreasingIterator first = new PeekingIncreasingIterator(0, 10, 10);
        PeekingIncreasingIterator second = new PeekingIncreasingIterator(2, 15, 10);
        MergingPeekingIncreasingIterator mii = new MergingPeekingIncreasingIterator(first,second);

        while (mii.hasNext()) {
            System.out.print(mii.next() + " ");
        }

    }
}
