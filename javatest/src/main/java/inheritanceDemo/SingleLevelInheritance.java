package inheritanceDemo;
class A{
    public void test1(){
        System.out.println("I am from test1 class A");
    }

}
class B extends A{
    public void test2()
    {
        System.out.println("I am from test2 class B");
    }
}

public class SingleLevelInheritance {
public static void main(String args[])
{
    B b=new B();
    b.test1();
    b.test2();
}
}
