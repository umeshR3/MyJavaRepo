package javaconceptexamples.inheritancepackage;
class A4{
    A4()
    {
        System.out.println("A4");
    }
}
class B4 extends A4{
    B4()
    {
        System.out.println("B4");
    }
    B4(int i)
    {
        System.out.println("B$ with i value "+i);
    }
}
class D1 extends B4{
    D1()
    {
        super(45);
        System.out.println("From D1");
    }

}

public class UseOfSuperkeyword {
    public static void main(String args[])
    {
        D1 d=new D1();
    }
}
