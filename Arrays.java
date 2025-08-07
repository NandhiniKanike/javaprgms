import java .util.Scanner;
public class Arrays 
{
    public static void main(String[] args) 
    {
        int[]  arr;
        arr=new int[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Elements of the arrays:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        s.close();
    }
}
