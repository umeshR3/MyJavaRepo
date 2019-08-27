package inheritanceDemo;
class constuctDemo{
   /* public constuctDemo()
    {
        System.out.println("I am default constructor");
    } */
    public constuctDemo(int i)
    {
        System.out.println("i am from single parameter "+i);
    }
}
class Demo2 extends constuctDemo {
    public Demo2(int j,int x) {
        super(10);
        System.out.println("I am from Demo2 constructor" + j);
    }
}
class Demo3 extends Demo2{
    public Demo3()
    {
        super(20,30);
        System.out.println("I am from demo3 ");
    }
}

public class constructo_chain {
    public static void main(String args[])
    {
        Demo3 con=new Demo3();
    }

}
