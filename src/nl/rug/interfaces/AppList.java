package nl.rug.interfaces;

import java.util.*;

public class AppList {


    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        Queue<String> stack = new LinkedList<>();

        stack.offer("Joris");
        stack.offer("Raymond");

        System.out.println(lengte(names));


        Set<String> namen2 = new HashSet<>();
        lengte(namen2);
    }


    public static int lengte(List list) {

        return list.size();
    }

    public static int lengte(Set set) {
        return set.size();
    }
}
