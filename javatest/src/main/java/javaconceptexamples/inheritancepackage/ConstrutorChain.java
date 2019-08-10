package javaconceptexamples.inheritancepackage;
class A3 {
    A3() {
        System.out.println("Froom A3");
    }
}
class B3 extends A3{
    B3()
    {
        System.out.println("From B3");
    }
}
class C3 extends B3
{
    C3()
    {
        System.out.println("From c3");
    }
}

public class ConstrutorChain {
    public static void main(String args[])
    {
        C3 c=new C3();
    }
}
