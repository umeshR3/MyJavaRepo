package javaconceptexamples.inheritancepackage;
class Demo1
{
    public void test1()
    {
        System.out.println("From test1");
    }
    public void test2()
    {
        System.out.println("From test2");
    }
}
class Demo2 extends Demo1{
    public void test1()
    {
        System.out.println("From Demo2 in test1");
    }
    public void test3()
    {
        System.out.println("From test3");
    }
}

public class OverloaddingUsingInheritance {
    public static void main(String[] args)
    {
        Demo2 d=new Demo2();
        d.test1();
        d.test2();
        d.test3();
    }
}
