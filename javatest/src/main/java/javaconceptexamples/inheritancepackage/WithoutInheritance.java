package javaconceptexamples.inheritancepackage;

import com.sun.org.apache.xpath.internal.SourceTree;

class A
{
    static int j=8980;
    int i=10;
    double d=12.23;
}
class B
{
    char c='t';
    float f = (float) 34.564;
}
public class WithoutInheritance {
    public static void main(String args[])
    {
        System.out.println("Program start");
        A a=new A();
        System.out.println(a.j);
        System.out.println(a.d);
        System.out.println(a.i);
        B b=new B();
        System.out.println(b.c);
        System.out.println(b.f);
        //if we try to access variables of A using B instance then we will get compile time error
        //System.out.println(b.i);
        //System.out.println(b.d);
    }
}
