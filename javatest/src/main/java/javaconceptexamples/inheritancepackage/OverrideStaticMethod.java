package javaconceptexamples.inheritancepackage;
class Test1{
    static void test()
    {
        System.out.println("From test1 class");
    }
}
class Test2 extends Test1{
    static void test()
    {
        System.out.println("From test2 class");
    }
}

public class OverrideStaticMethod {
    public static void main(String args[]) {
        Test2.test();

    }
}