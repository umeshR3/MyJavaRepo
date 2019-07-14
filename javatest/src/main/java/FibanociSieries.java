public class FibanociSieries {
    public static void main(String args[])
    {
        int n1=0,n2=1,temp,count=5;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=2;i<=count;i++)
        {
            temp=n1+n2;
            System.out.println(temp);
            n1=n2;
            n2=n1;

        }

    }
}
