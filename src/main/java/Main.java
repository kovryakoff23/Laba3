import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main (String [] args){
        ArrayList<Integer> testArrayList = new ArrayList<>();
        LinkedList<Integer> testLinkedList = new LinkedList<>();
        int t = 5;
        long timeStart = System.nanoTime();
        for (int i = 0; i < 1000; i++){
            testArrayList.add(t);
        }
        long timeEnd = System.nanoTime();
        System.out.println("add ArrayList" + " 1000 " + (timeEnd-timeStart) + "ms");
        timeStart = System.nanoTime();
        for (int i = 0; i < 1000; i++){
            testLinkedList.add(t);
        }
        timeEnd = System.nanoTime();
        System.out.println("add LinkedList" + " 1000 " + (timeEnd-timeStart) + "ms");
        timeStart = System.nanoTime();
        for (int i = 0; i < 1000; i++){
            testArrayList.get(i);
        }
        timeEnd = System.nanoTime();
        System.out.println("get ArrayList" + " 1000 " + (timeEnd-timeStart) + "ms");
        timeStart = System.nanoTime();
        for (int i = 0; i < 1000; i++){
            testLinkedList.get(i);
        }
        timeEnd = System.nanoTime();
        System.out.println("get LinkedList" + " 1000 " + (timeEnd-timeStart) + "ms");
        timeStart = System.nanoTime();
        for (int i = 0; i < 1000; i++){
            testArrayList.set(i, t);
        }
        timeEnd = System.nanoTime();
        System.out.println("set ArrayList" + " 1000 " + (timeEnd-timeStart) + "ms");
        timeStart = System.nanoTime();
        for (int i = 0; i < 1000; i++){
            testLinkedList.set(i, t);
        }
        timeEnd = System.nanoTime();
        System.out.println("set LinkedList" + " 1000 " + (timeEnd-timeStart) + "ms");
        timeStart = System.nanoTime();
        for (int i = 0; i < 1000; i++){
            testArrayList.remove(0);
        }
        timeEnd = System.nanoTime();
        System.out.println("delete ArrayList" + " 1000 " + (timeEnd-timeStart) + "ms");
        timeStart = System.nanoTime();
        for (int i = 0; i < 1000; i++){
            testLinkedList.remove(0);
        }
        timeEnd = System.nanoTime();
        System.out.println("delete LinkedList" + " 1000 " + (timeEnd-timeStart) + "ms");
    }
}
