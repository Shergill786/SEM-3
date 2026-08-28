import java.util.ArrayList;
import java.util.ListIterator;

public class main{
    public static void main(String[] args) {

ArrayList<Integer> a = new ArrayList<>();
ArrayList<Integer> a2 = new ArrayList<>();
a.add(5);
a.add(6);
a.add(8);
a.add(7);

a.add(1,2);
a.remove(2);

a.set(2,12);// update the value

a.addAll(a2);
a.addAll(1,a2);

a.clear();

a.clone();

a.contains(1);

a.ensureCapacity(10);
a.forEach(System.out::println);
a.forEach(i -> {
    if (i >= 15) {
        System.out.println(i);
    }
});

a.get(1);// takes index
a.indexOf(4);// gives index

a.isEmpty();

a.lastIndexOf(1);

ListIterator<Integer> i = a.listIterator(2);

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println(a);
    }
}

