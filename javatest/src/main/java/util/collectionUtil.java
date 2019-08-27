package util;

import java.util.*;

public class collectionUtil {
    public ArrayList IntegrArrayList() {
        ArrayList<Integer> array = new ArrayList<>();
        {
            array.add(10);
            array.add(20);
            array.add(30);
            array.add(40);
            array.add(50);

        }
        return array;
    }

    public List arrayToArrayList(int[] arry) {
        List arrayToArrayList = new ArrayList();

        for (int a : arry) {
            arrayToArrayList.add(a);
        }

 /*       List<int[]> arrylist = Arrays.asList(arry);
        System.out.println(arrylist.size());*/
        return arrayToArrayList;
    }

    public void printArrayList(List arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public HashSet setDemo() {
        HashSet hashSet = new HashSet();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(50);
        hashSet.add(25);
        hashSet.add("Umesh");
        hashSet.add("Umesh");

        return hashSet;
    }

    public LinkedList linkedListDemo() {
        LinkedList ll = new LinkedList();
        ll.add(28);
        ll.add(39);
        ll.add("Umesh");
        ll.add(29);
        ll.add("Umesh");

        return ll;
    }



}