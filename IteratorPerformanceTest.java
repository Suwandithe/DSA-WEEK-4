import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class IteratorPerformanceTest {
    public static void main(String[] args) {
        int size = 1000000; // Adjust size as needed
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Random random = new Random();

        // Populate lists
        for (int i = 0; i < size; i++) {
            int value = random.nextInt();
            arrayList.add(value);
            linkedList.add(value);
        }

        // Test performance of direct access using indices
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            int element = arrayList.get(i);
        }
        long endTime = System.nanoTime();
        long arrayListTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            int element = linkedList.get(i);
        }
        endTime = System.nanoTime();
        long linkedListTime = endTime - startTime;

        System.out.println("Direct Access (ArrayList): " + arrayListTime + " nanoseconds");
        System.out.println("Direct Access (LinkedList): " + linkedListTime + " nanoseconds");

        // Test performance of iterator access
        startTime = System.nanoTime();
        Iterator<Integer> arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            int element = arrayListIterator.next();
        }
        endTime = System.nanoTime();
        arrayListTime = endTime - startTime;

        startTime = System.nanoTime();
        Iterator<Integer> linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            int element = linkedListIterator.next();
        }
        endTime = System.nanoTime();
        linkedListTime = endTime - startTime;

        System.out.println("Iterator Access (ArrayList): " + arrayListTime + " nanoseconds");
        System.out.println("Iterator Access (LinkedList): " + linkedListTime + " nanoseconds");
    }
}
