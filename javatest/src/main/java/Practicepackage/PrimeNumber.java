package Practicepackage;

public class PrimeNumber {
    public static void main(String args[]) {
        int i, j, k;
        for (i = 1; i < 20; i++)
        {
            k=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    k=1;
                    break;
                }
            }
            if(k==0)
            {
                System.out.println(i);
            }
        }

    }
}
