package javaconceptexamples.inheritancepackage;
class A1 extends B1{
    int i=10;
    static int j=20;
}
class B1 {
    double b=30;
    char c='t';
    static int s=20;

    public void test()
    {
        System.out.println("Test");
    }

}

public class WithInheritance {
    public static void main(String args[])
    {
        A1 a=new A1();
        a.test();
        System.out.println(a.s);
        B1 b=new B1();
        //System.out.println(b.i);
        System.out.println(b.b);
       // System.out.println(b.j);
        System.out.println(b.c);
    }
}
