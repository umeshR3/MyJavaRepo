package testPackage;

import org.testng.annotations.Test;
import util.collectionUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTestclass {
    collectionUtil demo=new collectionUtil();
    ArrayList a=null;
    LinkedList ll=null;

    @Test
    public void test()
    {
        //System.out.println(demo.IntegrArrayList());
         a=demo.IntegrArrayList();
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }



        /*Iterator iterator=a.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }*/
    }
    @Test(dependsOnMethods = {"test"})
    public void convertToArraylist()
    {
        int[] arry={10,20,30,40};
     List print=demo.arrayToArrayList(arry);
     demo.printArrayList(print);
        System.out.println("-----------------");
        print.addAll(a);
        demo.printArrayList(print);

    }
    @Test
    public void LinkedListD()
    {
        //System.out.println(demo.IntegrArrayList());
        ll=demo.linkedListDemo();
        for(int i=0;i<ll.size();i++)
        {
            System.out.println(ll.get(i));
        }
    }
}