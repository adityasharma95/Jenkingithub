import java.util.*;
class Arra
{
public static void main(String args [] )
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Array Size");
int arrSize = sc.nextInt(); 

int[] arr = new int[arrSize];
System.out.println("Array length :"+arr.length);
System.out.println(Arrays.toString(arr));

for(int i=0;i<arr.length;i++)
{ 
System.out.println("enter the first number:");
int c=sc.nextInt();

	if(c%2==0)
	{
        arr[i]=c;
	System.out.println(arr[i]+"even");
       
	}
	else
	{
	System.out.println(arr[i]+"odd");
	}





}
System.out.println(Arrays.toString(arr));
}

}