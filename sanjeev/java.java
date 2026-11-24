// import java.util.ArrayList;
// import java.util.Collections;

// public class java {
//     public static void main(String[] args) {
// ArrayList<String> a = new ArrayList<>();
// a.add("red");
// a.add("blue");
// a.add("green");
// a.add("yellow");

// Collections.sort(a);

// System.out.println(a);
//     }
// }


// arraylist ordered collection 
// import java.util.ArrayList;
// import java.util.Collections;

// public class java {
//     public static void main(String[] args) {
// ArrayList<String> a = new ArrayList<>();
// a.add("red");
// a.add("blue");
// a.add("green");
// a.add("yellow");

// Collections.sort(a);

// System.out.println(a);
//     }
// }


// a.set(0,"hello");
// a.addAll(l2);
// a.clear();
// a.remove(0);
// a.clone();
// a.contains("red");
// a.indexOf("red");
// a.get(0);
// a.forEach(i)->System.out.println(i*i);
// a.forEach(i->{(if i<=50) System.out.println(i);});
// a.isEmpty();
// a.lastIndexOf("red");
// a.remove("red");
// a.removeAll("red");
// a.removeif(i->(i%2==0));
// a.removeif(i->(i.startsWith("r")));
// a.removeif(i->i.isEmpty());
// a.removerangelist(1,4);
// a.retainAll(l2);
// a.set(0,"orange");
// a.size();
// a.sublist(1,4);
// a.toArray();
// 



// linked list double linked list (node )
// import java.util.LinkedList;
// public class java {
//     public static void main(String[] args) {
// LinkedList<String> l= new LinkedList<String>();

// l.add("red");
// l.set(0,"hello");
// l.remove(0);
// l.size();
// for i=0 ;i<l.size();i++){
//     System.out.println(l.get(i));
// }
// l.addFirst("read");
// l.addLast("blue");
// l.clear();
// l.clone();
// l.contains("red");
// l.descendingIterator();
// Iterator<String> I = l.descendingIterator();
// while(I.hasNext()){
//     System.out.println(I.next());
// }

// l.element();
// lgetFirst();
// l.getLast();
// l.indexOf("red");
// l.lastIndexOf("red");
// l.offerfirst("red");
// l.offerlast("red");
// l.polllast();
// l.pollfirst();
// l.pop();
// l.push("red"); REPRESENTATION OF STACK
// l.toarray();
// l.tostring();


 
    
// }
// }
// }
// }    

// VECTOR
// dynamic array size can increase or decrease
// ordered collection ,doublicate value ,nulll

// import java.util.Vector;
// public class java {
    
//     public static void main(String[] args) {
//         Vector<String> v = new Vector<>();
//         v.add("red");
//         v.add("blue");
//         v.add("green");
//         v.add("yellow");

//         System.out.println(v);
//     }
// }

// vector v=new vector();
// v.add("red");
// v.set(0,"hello");
// v.remove(0);
// for (int i:v1){
//     System.out.println(i);
// }

// v.addElement("red");
// v.capacity();
// v.clear();
// v.contains("red");
// v.indexOf("red");
// v.elementAt(0);
// v.equals(v1);
// v.firstElement();
// v.get(0);
// v.hashcode();
// v.isEmpty();
// v.firstIndexOf("red");
// v.lastIndexOf("red");
// v.remove();
// v.removeAll();
// v.removeif(i->(i%2==0));
// v.removerange(1,4);
// v.retainAll(v1);
// v.sort();
// l.collections.reverseOrder();
// v.toArray();
// v.toString();


// STACK
// import java.util.Stack;
// public class java {

//     public static void main(String[] args) {
//         Stack<String> s = new Stack<>();
//         s.push("red");
//         s.push("blue");
//         s.push("green");
//         s.push("yellow");

// s.pop();
// s.peek();
// s.isEmpty();
// s.empty();
// s.search("red");

//         System.out.println(s);
//     }
// }
//

// HASHSET
// no douplicate 

// import java.util.*;

// import java.util.*;
// hashset<integer> h = new HashSet<>();
// h.add("red");
// System.out.println(h);
// h.remove("red");

// h.clear();
// h.contains("red");
// h.clone();
// h.isEmpty();

// LINKEDHASHSET
// import java.util.*;

// LinkedHashSet<String> l = new LinkedHashSet<>();
// l.add("red");
// l.remove("red");
// for (String i:l){
//     System.out.println(i);

// }
// same as hashset but maintain insertion order

// l.size();
// l.clear();
// l.equals(l1);
// l.isEmpty();
// l.toArray();
// l.toString();

// TREESET
// import java.util.*;

// TreeSet<String> t = new TreeSet<>();
// t.add("red");
// t.first();
// t.last();
// t.contains("red");
// t.higer("red");
// t.lower("red");
// t.pollfirst();
// t.polllast(); remove and return first and last element
// t.remove("red");
// for (String i:t){
//     System.out.println(i);
// }
// same as hashset but maintain ascending order
// t.tailset(10); greater then or equal to 10
// t.subset(10,20); greater then or equal to 10 and less then 20
// t.headset(10); less then 10
// t.floor(10); less then or equal to 10
// t.ceiling(10); greater then or equal to 10


// priority queue
// import java.util.*;
// import java.util.PriorityQueue;
// PriorityQueue<Integer> p = new PriorityQueue<>();
// heap data structure

// p.add(10);
// p.peek();
// p.poll();
// System.out.println(p);
// p.remove(10);
// p.clear();
// p.comparator();
// p.contains(10);
// p.isEmpty();
// foreach (int i:p){
//     System.out.println(i);
// }
// p.removeif(i->(i%2==0));
// p.toarray();
// p.offer(10);

// abstract queues

// import java.util.*;
// import java.util.AbstractQueue;

// AbstractQueue<Integer> a = new AbstractQueue<Integer>() {
//     a.add(10);
//     a.element();
//     a.remove();
//    
// }

// abstract collection

// import java.util.*;
// abstract collection<Integer> a = new abstract collection<Integer>() {
//     a.add(10);
//     a.clear();
//     a.containsall(10);
//     a.isEmpty();
//     a.iterator();
//     a.remove(10);
//     a.size();
//     a.toArray();
//     a.toString();

// };

// linked list<> l =new LinkedList<>();
// l.set(0,"hello");
// l.remove(0);
// for (String i:l){
//     System.out.println(i);
// }
// l.add(1,"red");
// l.addFirst("red");
// l.addLast("red");
// l.clear();
// l.clone();
// l.contains("red");
// l.descendingIterator();
// l.element();
// l.getFirst();
// l.getLast();
// l.indexOf("red");
// l.lastIndexOf("red");
// l.firstIndexOf("red");
// l.offerFirst("red");
// l.offerLast("red"); tail and head
// l.peek();
// l.peekFirst();
// l.peekLast();
// l.pollFirst();
// l.pollLast();
// l.poll();
// l.pop();
// l.remove();
// l.removeFirst();
// l.removeLast();
// l.removeFirstOccurrence("red");
// l.removeLastOccurrence("red");
// l.set(0,"hello");
// l.size();
// l.toArray();
// l.toString();


// array double queue
// import java.util.*;
// ArrayDeque<String> a = new ArrayDeque<>(); 
// a.add("red");
// a.removefirst();
// a.removeLast();
// a.offerFirst("red");
// a.offerLast("red");
// a.getfirst();
// a.getLast();
// a.pop();
// a.poll();
// a.peek();
// a.descendingIterator();
// a.addfirst("red");
// a.addLast("red");
// a.clone();
// aclear();
// a.contains("red");
// a.isEmpty();
// a.iterator();
// a.removeall("red");
// a.size();
// a.toArray();


// HASHMAP

// import java.util.*;
// HashMap<String,String> h = new HashMap<>();

// h.put(1,"red");
// h.put(2,"blue");
// h.put(3,"green");
// for(Map.Entry<String,Interger>i:h.entrySet()){
//     System.out.println(i.getKey()+" "+i.getValue());
// }
// System.out.println(h);

// h.get(1);
// h.put(1,"yellow");
// h.remove(1);
// h.clear();
// h.clone();
// h.compute("1",(key,val)->val.concat("yellow"));
// h.containsKey(1);
// h.containsValue("red");
// h.compute("red",(key,val)->(val==null)?"10":val+1);
// h.entrySet();
// h.isEmpty();
// h.keyset();
// h.size();
// h.values();

// absract base classes
// list ,map ,set ,queue ,collection



// linkedHashmap<String,String> l = new LinkedHashMap<>();
// it allows null key and multiple null values
// l.put(1,"red");  
// l.put(null,"blue");
// l.put(2,null);
// same 
// l.getkey(1);
// l.getvalue("red");

// treeMap<String,String> t = new TreeMap<>();
// it does not allow null key but multiple null values
// import java.util.*;
// TreeMap<String,Integer> t = new TreeMap<>(); 
// t.put(1,"red");
// System.out.println(t);

// treeMap<String,Integer> t =new treeMap<>(new sort);
// same 
// t.firstKey();
// t.lastKey();
// t.tailMap(1); greater then or equal to 1
// t.headMap(1); less then 1
// t.subMap(1,2); greater then or equal to 1 and less then 2
// t.lowerKey(1); less then 1
// t.higherKey(1); greater then 1
// t.floorKey(1); less then or equal to 1
// t.ceilingKey(1); greater then or equal to 1
// t.firstEntry();
// t.lastEntry();
// t.pollFirstEntry();
// t.pollLastEntry();
// t.descendingKeySet();    
// t.descendingMap();
