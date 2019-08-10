package javaLoo;

public class ForLoopDemo {
    int count=5;
    public void starDemo()
    {
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ForLoopDemo demo=new ForLoopDemo();
        demo.starDemo();
    }
}
