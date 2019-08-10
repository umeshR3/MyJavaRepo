package javaconceptexamples.inheritancepackage;

public class ConstOverloading {
    ConstOverloading()
    {
        System.out.println("Hii constr1");
    }
    ConstOverloading(int i)

    {
        System.out.println("Vaklue of i "+i);
    }
    ConstOverloading(int i,int j)
    {
        System.out.println("Hi HJhdegyhjaggjv "+i+" "+j);
    }
    public static void main(String args[])
    {
        ConstOverloading c=new ConstOverloading();
        ConstOverloading c1=new ConstOverloading(10);
        ConstOverloading c2=new ConstOverloading(10,20);

    }

}
