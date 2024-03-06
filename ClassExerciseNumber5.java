import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ClassExerciseNumber5 {

    public class ListPerformanceComparison {
        public static void main(String[] args) {
        int[] inputSizes = {1000, 10000, 100000};
        
        for (int size : inputSizes) {
            System.out.println("Input size: " + size);
            ArrayList<Integer> arrayList = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();
            
            long startTime, endTime;
            
            // ArrayList performance
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }
            endTime = System.nanoTime();
            System.out.println("ArrayList insertion time: " + (endTime - startTime) + "nanoseconds");
           
            // LinkedList performance
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }
            endTime = System.nanoTime();
            System.out.println("LinkedList insertion time: " + (endTime - startTime) + "nanoseconds");
           
            // Clearing lists for fairness
            arrayList.clear();
            linkedList.clear();
            
            Random rand = new Random();
            
            // ArrayList performance for random access
            for (int i = 0; i < size; i++) {
                arrayList.add(rand.nextInt(size));
            }
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                arrayList.get(i);
            }
            endTime = System.nanoTime();
            System.out.println("ArrayList random access time: " + (endTime - startTime) + " nanoseconds");
            
            // LinkedList performance for random access
            for (int i = 0; i < size; i++) {
                linkedList.add(rand.nextInt(size));
            }
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                linkedList.get(i);
            }
            endTime = System.nanoTime();
            System.out.println("LinkedList random access time: " + (endTime - startTime) + " nanoseconds");
            
            System.out.println();
        }
    }
}

}
