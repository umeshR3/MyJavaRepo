package javaconceptexamples.inheritancepackage;
class A2{
    int i=90;
}
class B2 extends A2{
    double d=30;
}
class E extends B2{
    Boolean b=true;
}
public class InheritanceDemo1 {
    public static void main(String args[])
    {
        System.out.println("Program start");
        B2 b=new B2();
        System.out.println(b.d);
        System.out.println(b.i);
        System.out.println("------------------");
        E e1=new E();
        System.out.println(e1.d);
        System.out.println(e1.i);
        System.out.println(e1.b);
    }
}
