package inheritanceDemo;
abstract class Base
{
    public abstract void test1();
    public void test2 ()
    {
        System.out.println("I am from test2");
    }
}
interface InterfaceDemo{

    public void in_test();
    public void in_test2();

}
class child extends Base implements InterfaceDemo
{
    public void test1()
    {
        System.out.println("I am from Base class and test1");
    }


    @Override
    public void in_test() {
        System.out.println("I am from in_test");
    }

    @Override
    public void in_test2() {
        System.out.println("I am from in_test2");
    }
}
public class MaltipleInheriantce {
    public static void main (String args[])
    {
        child c=new child();
        c.in_test();
        c.in_test2();
        c.test1();
        c.test2();
    }

}
