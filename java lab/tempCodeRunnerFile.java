import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class JavaCollectionsGuide {

    public static void main(String[] args) {
        demonstrateTreeSetBasics();
        demonstrateTreeSetRemoval();
        demonstrateTreeSetEnds();
        demonstrateTreeSetNavigation();
        demonstrateTreeSetSubsets();
        demonstratePriorityQueue();
        demonstrateArrayDeque();
        demonstrateHashMap();
        demonstrateTreeMap();
        demonstrateCollectionsUtilities();
    }

    private static void demonstrateTreeSetBasics() {
        heading("TreeSet: insertion, sorting, and size");

        TreeSet<Integer> numbers = new TreeSet<>();
        System.out.println("Is empty initially? " + numbers.isEmpty());

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10);
        numbers.addAll(Arrays.asList(20, 50));

        System.out.println("Sorted TreeSet: " + numbers);
        System.out.println("Size: " + numbers.size());
    }

    private static void demonstrateTreeSetRemoval() {
        heading("TreeSet: checking and removing elements");

        TreeSet<String> cities =
                new TreeSet<>(Arrays.asList("Delhi", "Mumbai", "Chandigarh", "Jaipur"));

        System.out.println("Contains Delhi? " + cities.contains("Delhi"));
        System.out.println("Contains Delhi and Jaipur? "
                + cities.containsAll(Arrays.asList("Delhi", "Jaipur")));

        cities.remove("Jaipur");
        System.out.println("After removing Jaipur: " + cities);

        cities.removeAll(Arrays.asList("Mumbai", "Delhi"));
        System.out.println("After removeAll: " + cities);

        cities.addAll(Arrays.asList("Delhi", "Mumbai"));
        cities.retainAll(Arrays.asList("Delhi", "Chandigarh"));
        System.out.println("After retainAll: " + cities);

        cities.clear();
        System.out.println("After clear: " + cities);
    }

    private static void demonstrateTreeSetEnds() {
        heading("TreeSet: first and last elements");

        TreeSet<Integer> scores = new TreeSet<>(Arrays.asList(75, 92, 64, 88, 99));

        System.out.println("Lowest score (first): " + scores.first());
        System.out.println("Highest score (last): " + scores.last());

        System.out.println("Polled lowest: " + scores.pollFirst());
        System.out.println("Polled highest: " + scores.pollLast());
        System.out.println("Remaining scores: " + scores);
    }

    private static void demonstrateTreeSetNavigation() {
        heading("TreeSet: navigation methods");

        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("lower(30), strictly less than 30: " + numbers.lower(30));
        System.out.println("floor(30), less than or equal to 30: " + numbers.floor(30));

        System.out.println("higher(30), strictly greater than 30: " + numbers.higher(30));
        System.out.println("ceiling(25), greater than or equal to 25: " + numbers.ceiling(25));
    }

    private static void demonstrateTreeSetSubsets() {
        heading("TreeSet: subset views");

        TreeSet<Integer> numbers =
                new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println("headSet(40), values below 40: " + numbers.headSet(40));
        System.out.println("headSet(40, true), values up to 40: "
                + numbers.headSet(40, true));
        System.out.println("tailSet(30), values from 30 onward: " + numbers.tailSet(30));
        System.out.println("tailSet(30, false), values above 30: "
                + numbers.tailSet(30, false));
        System.out.println("subSet(20, 50), from 20 inclusive to 50 exclusive: "
                + numbers.subSet(20, 50));
        System.out.println("subSet(20, true, 50, true), including both bounds: "
                + numbers.subSet(20, true, 50, true));
    }

    private static void demonstratePriorityQueue() {
        heading("PriorityQueue: processing by priority");

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(40);
        queue.offer(10);
        queue.offer(30);

        System.out.println("Top priority (smallest): " + queue.peek());
        while (!queue.isEmpty()) {
            System.out.println("Polled: " + queue.poll());
        }
    }

    private static void demonstrateArrayDeque() {
        heading("ArrayDeque: stack and queue behavior");

        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.push("Page 1");
        deque.push("Page 2");
        System.out.println("Popped from stack: " + deque.pop());

        deque.offerLast("User A");
        deque.offerLast("User B");
        System.out.println("Polled from queue: " + deque.pollFirst());
    }

    private static void demonstrateHashMap() {
        heading("HashMap: key-value lookup");

        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Math", 95);
        marks.put("Science", 88);

        System.out.println("Math: " + marks.get("Math"));
        System.out.println("English: " + marks.getOrDefault("English", 0));
        marks.forEach((subject, score) -> System.out.println(subject + ": " + score));
    }

    private static void demonstrateTreeMap() {
        heading("TreeMap: keys kept in sorted order");

        TreeMap<Integer, String> employees = new TreeMap<>();
        employees.put(103, "Rohan");
        employees.put(101, "Ananya");
        employees.put(102, "Vikram");

        System.out.println("Sorted map: " + employees);
        System.out.println("First ID: " + employees.firstKey());
        System.out.println("IDs below 103: " + employees.headMap(103));
    }

    private static void demonstrateCollectionsUtilities() {
        heading("Collections: utility operations");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 1, 7, 1, 9));

        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);

        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Frequency of 1: " + Collections.frequency(numbers, 1));
    }

    private static void heading(String title) {
        System.out.println("\n--- " + title + " ---");
    }
}