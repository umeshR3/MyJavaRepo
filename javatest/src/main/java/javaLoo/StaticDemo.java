package javaLoo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

class Test {
    private Test()
    {

    }
    public int add(int a,int b){
        return a+b;
    }
    static Test test;
    public Properties getPopetryObject() throws FileNotFoundException {
        File file = new File("D:\\01Automation\\MyJavaRepo\\selenium\\src\\test\\resources\\Properties.properties");
        FileInputStream fileInputStream = new FileInputStream(file);

        Properties properties = new Properties();

        return properties;
    }
public static Test getInstance()
{
    if (test==null)
    {
        test=new Test();
    }
    return test;
}
   /*public String toString()
    {
        return "umesh";
    }*/
}
public class StaticDemo {
    public static void main(String[] args) throws FileNotFoundException {

        Test test=Test.getInstance();


        test.add(10,20);



        String str=new String("HI");

        System.out.println(test.toString());
        Test test1=Test.getInstance();

        System.out.println(test1);

    }
}
