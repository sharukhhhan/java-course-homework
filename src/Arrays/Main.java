package Arrays;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[6];
        String[] names = {"Jack", "Noorali", "Jons"};
        for (String name: names) {
            System.out.println(name);
        }
        ;
        System.out.printf("%s%8s%n", "index", "element");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%5d%8d%n", i, a[i]);
        }

        ArrayList<String> list = new ArrayList<String>();

        list.add("Name");
        list.add("Surname");


        if (list.contains("Surname")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(list.indexOf("Surname"));

        System.out.println(list.size());
        System.out.println(list.get(1));




    }
}
