package assignementPrograms;

class MainTest{
    String a="UUma";
    int b=10;
    public void method1()
    {
        System.out.println("I am from method1");
    }
    public void method2()
    {
        System.out.println("I am from method2");
    }
    static class TestMain extends MainTest{
        @Override
        public void method1() {
            super.method1();
            System.out.println("This String is from MainTest class "+a);
        }

        @Override
        public void method2() {
            super.method2();
            System.out.println("This Int is from Main class "+b);
        }
    }
}
public class VariablesAndFunctions {
    public static void main(String args[])
    {
        MainTest.TestMain t= new MainTest.TestMain();
        t.method1();
        t.method2();
        System.out.println(t.a);
        System.out.println(t.b);

    }
}
