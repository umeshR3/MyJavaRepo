package testPackage;

import org.testng.annotations.Test;
import util.collectionUtil;

import java.util.HashSet;
import java.util.Iterator;

public class SetTestClass {
    collectionUtil demo=new collectionUtil();
    HashSet a=null;
    @Test
    public void setTest()
    {
        a=demo.setDemo();
        Iterator itr=a.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
