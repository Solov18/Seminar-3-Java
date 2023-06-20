
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Object o = new Object();
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(10));
            //list1.add(new Random().nextInt(15));
        }
        //list.addAll(2,list1);
        System.out.println(list);
         System.out.println(list.size());
        //System.out.println(list.isEmpty());
        //System.out.println(list.get(2));
        //list.set(2, 45);
        //System.out.println(list);
        //list.remove(  2);
        //System.out.println(list);
        //list.clear();
        //list.forEach(n-> list1.add(0,n ));
        //System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            int even = list.get(i) % 2;
            if (even == 0) {
                System.out.println("Четное число:" + list.get(i));
                list.remove(i);


            }
            //System.out.println(list);

        }
        Collections.sort(list);
        System.out.println("Список с удаленными четными числами: \n " + list);
    }
}


