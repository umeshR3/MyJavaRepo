package inheritanceDemo;
class conTest {
    public conTest()
    {
        System.out.println("consTest");
    }
    public static void test()
    {
        System.out.println("from static");
    }

}

public class conDemo {
    public static void main(String[] args)
    {
        conTest obj=new conTest();
        conTest.test();
    }
}
