package javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

class CollectionType {
    public static void main(String[] args) {
        ArrayList<Integer> arrListOne = new ArrayList<>();
        List<Integer> arrListTwo = Arrays.asList(10, 15, 20);
        arrListOne.add(5);
        arrListOne.add(10);
        arrListOne.add(200);
        arrListOne.add(180);
        for(Integer i : arrListOne) {
            System.out.println(i);
        }
        arrListOne.sort(null);
        System.out.println("Sorting");
        for(Integer i : arrListOne) {
            System.out.println(i);
        }
        arrListOne.sort(Comparator.reverseOrder());
        System.out.println("Desecnding order");
        for(Integer i : arrListOne) {
            System.out.println(i);
        }
        System.out.println("removed");
        arrListOne.remove(0);
        System.out.println(arrListOne);
        System.out.println(arrListOne.isEmpty() + " size = " + arrListOne.size());

        arrListOne.set(2, 600);
        for(Integer i : arrListOne) {
            System.out.println(i);
        }
        arrListOne.clear();
        System.out.println(arrListOne.isEmpty());

        ArrayList<Object> listOFObjects = new ArrayList<>();
        listOFObjects.add("element 1");
        listOFObjects.add(5);
        listOFObjects.add(20.84);
        System.out.println(listOFObjects);

        ArrayList<Object> filteredList = new ArrayList<>();
        for(Object val : listOFObjects) {
            if(val instanceof  Double || val instanceof Integer) {
                filteredList.add(val);
            }
        }
        System.out.println(filteredList);

        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Sally");
        students.put(2, "Mally");
        students.put(3, "Joe");
        students.put(4, "Jack");
        for(Integer studentNum : students.keySet()) {
            System.out.println("Student Number : " + studentNum + " Student Name " + students.get(studentNum));
        }

        System.out.println(students.isEmpty());
        students.remove(4);
        students.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));
        System.out.println(students.entrySet());
        System.out.println(students.containsKey(5));

        for(Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getValue());
        }
        Map<Integer, Integer> map = Map.ofEntries(
                Map.entry(1,1),
                Map.entry(2,4),
                Map.entry(3, 9)
        );
        System.out.println(map.get(1));
        HashSet<Object> set = new HashSet<>();
        set.add(5);
        set.add("Hello");
        set.add("Hello");
        for(Object val : set) {
            System.out.println(val);
        }
    }
}