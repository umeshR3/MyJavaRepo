package sortingProgarmPackage;

class BubbleDemo{
    public void bubbleTest(int[] numberArray)
    {
       int len= numberArray.length;
        int temp;
        for(int i=0;i<=len-1;i++)
        {
            if(numberArray[i]>numberArray[i+1])
            {
                temp=numberArray[i];
                numberArray[i]=numberArray[i+1];
                numberArray[i+1]=temp;
            }
        }

    }
}

public class BubbleSort {
    public static void main(String[] args) {
        int[] numberArray={2,7,1,3,4};
        BubbleDemo b=new BubbleDemo();
        System.out.println("Array Befor sort");
        for(int i=0;i<numberArray.length;i++)
        {
            System.out.print(numberArray[i]);
        }
        System.out.println("After sort");
        for(int i=0;i<numberArray.length;i++)
        {
    }}

}
