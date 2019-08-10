package javaconceptexamples.inheritancepackage;
class Test{
    public void demo()
    {
        System.out.println("From demo method");
    }
    public void demo1(int i)
    {
        System.out.println("From demo1 with i value "+i);
    }
    public void demoe3(int i, double a)
    {
        System.out.println("From demo3 with two diffrent vlaue ");
    }
}
public class OverlodingDemo {
public static void main(String args[])
{
    Test test=new Test();
    test.demo();
    test.demo1(20);
    test.demoe3(20,30.22);
}
}
