package javaconceptexamples.inheritancepackage;

public class PrintDuplicateInString {
    public static void main(String args[])
    {
        String str="uu";
        int count=0;
        char[] c=str.toCharArray();
        System.out.println("Duplicate elements present are");
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(c[i]==c[j])
                {
                    count++;
                    System.out.println(c[j]+""+count);
                }
            }
        }
    }
}
