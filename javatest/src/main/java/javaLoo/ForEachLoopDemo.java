package javaLoo;

public class ForEachLoopDemo {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        int leng=array.length;
        System.out.println("Array lenth "+leng);
        for(int i=0;i<array.length;i++)
        {
            System.out.print(" "+array[i]);
        }

        for (int a:array) {
            System.out.println(a);

        }

    }
}
