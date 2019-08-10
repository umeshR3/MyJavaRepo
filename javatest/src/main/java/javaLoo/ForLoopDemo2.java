package javaLoo;

public class ForLoopDemo2 {
    public void demo()
    {
        for (int i=6;i>=1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ForLoopDemo2 obj=new ForLoopDemo2();
        obj.demo();
    }
}
