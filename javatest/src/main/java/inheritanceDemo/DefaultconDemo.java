package inheritanceDemo;
class Test{
    Test()
    {
        System.out.println("I am from Test con");
    }
}
class Test1 extends Test {
    Test1() {
        System.out.println("I am from Test1");
    }

}
class Test2 extends Test1
{
    Test2()
    {
        System.out.println("I am from Test2");
    }
}

public class DefaultconDemo {
    public static void main(String args[])
    {
        Test2 test=new Test2();
    }
}
