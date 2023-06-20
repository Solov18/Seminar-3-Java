
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Object o = new Object();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(10));
        }
        System.out.println(list);
         System.out.println(list.size());
         for (int i = 0; i < list.size(); i++) {
            int even = list.get(i) % 2;
            if (even == 0) {
                System.out.println("Четное число:" + list.get(i));
                list.remove(i);
            }
        }
        Collections.sort(list);
        System.out.println("Список с удаленными четными числами: \n " + list);
    }
}


