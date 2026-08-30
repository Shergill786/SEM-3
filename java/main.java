
// import java.util.*;

// // import java.util.ArrayList;
// // import io.*;
// // import java..util.Array;
// // import java.util.ListIterator;

// // public class main{
// //     public static void main(String[] args) {

// // ArrayList<Integer> a = new ArrayList<>();
// // ArrayList<Integer> a2 = new ArrayList<>();
// // a.add(5);
// // a.add(6);
// // a.add(8);
// // a.add(7);

// // a.add(1,2);
// // a.remove(2);

// // a.set(2,12);// update the value

// // a.addAll(a2);
// // a.addAll(1,a2);

// // a.clear();

// // a.clone();

// // a.contains(1);

// // a.ensureCapacity(10);
// // a.forEach(System.out::println);
// // a.forEach(i -> {
// //     if (i >= 15) {
// //         System.out.println(i);
// //     }
// // });

// // a.get(1);// takes index
// // a.indexOf(4);// gives index

// // a.isEmpty();

// // a.lastIndexOf(1);

// // ListIterator<Integer> i = a.listIterator(2);

// //         while (i.hasNext()) {
// //             System.out.println(i.next());
// //         }

// //         System.out.println(a);




// // a.remove(4);
// // a.removeAll(a);
// // a.removeIf(i->(i%2==0){
// //     System.err.println("even");
// // })

// // a.removeRange(1,4);
// // a.retainAll(a2);

// // a.size();
// // b=a.subList(fromIndex, toIndex);

// // Object O = A1.toArray()



// // a.trimToSize();

// //     }
// // }

// // linked list 

// // import java.util.LinkedList;
// // public class main{
// //     public static void main(String[] args) {
// //         LinkedList<Integer> a = new LinkedList<>();

// //     a.add(1);
// //     a.peek();
// //     a.poll();
// //     a.pop();


// //     }
// // }
// // import java.util.HashSet;
// // import java.util.Iterator;
// // public class main{
// //     public static void main(String[] args) {
        
// // HashSet<Integer> a = new HashSet<>();

// //     a.remove(1);


// //     Iterator<Integer> it = a.iterator();

// //         while (it.hasNext()) {
// //             System.out.println(it.next());
// //         }

// //     a.clears(1);
// //     a.contains(2);
// //     a.remove(a);
// //     a.size();
// //     a.clone();
// //     a.isEmpty();




// //     }
// // }
// // import java.util.TreeSet;

// // TreeSet<Integer> a=new TreeSet<>();

// // a.add(10);
// // a.first();
// // a.remove();
// // a.size();

// // a.ceiling();//greater or max
// // a.floor();//lesser or min
// // a.descendingSet();

// // a.isEmpty();
// // a.last();


// HASHMAP

// import java.util.HashMap;

// public class main{
//     public static void main(String[] args) {
        
//         HashMap<Integer,String> a=new HashMap<>();
//     a.put();
//     a.get();
//     a.put(key,2);
//     a.remove(key);

//     a.keySet();
//     a.values();

//     a.containsKey(a);
//     a.containsValue(a);
    
//     a.clear();
//     a.size();



//     }
// }


// treemap
import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        TreeMap<Integer, String> a = new TreeMap<>();

        // Adding elements
        a.put(1, "Apple");
        a.put(2, "Banana");
        a.put(3, "Mango");

        // Remove using key
        a.remove(2);

        // Traverse key-value pairs
        for (Map.Entry<Integer, String> e : a.entrySet()) {
            System.out.println(
                e.getKey() + " : " + e.getValue()

            
            );
        }

        a.keySet();
        
    }
}