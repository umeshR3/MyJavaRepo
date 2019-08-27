public class DuplicateArrayInString {
    static int count;

    public static void main(String args[])
    {
        String[] array={"abc","agc","abc","bba"};
        for(int i=0;i<array.length-1;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if((array[i].equals(array[j])) && (i != j))
                {
                    System.out.println(array[j]);

                }
            }

        }

    }
}
