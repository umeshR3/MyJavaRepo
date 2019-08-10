package assignementPrograms;

public class EvenNumberFrom1to100 {
    public static void main(String args[])
    {
        int n=100;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even number from 1-100 ----------"+i);
            }
           /* else
            {
                System.out.println("Odd Numbers From 1-100 ==========="+i);
            }*/
        }
    }
}
