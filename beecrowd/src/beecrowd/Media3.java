package beecrowd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
      
        
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        
        List<Integer> sortedList = new ArrayList<>(list);
        

        Collections.sort(sortedList);
        for (int i = 0; i < list.size(); i++) {
        	System.out.printf("%d%n", sortedList.get(i));
        }
        
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
        	System.out.printf("%d%n", list.get(i));
        }
        sc.close();
    }
}

