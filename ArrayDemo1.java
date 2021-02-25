package vishal;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		int[] arr=new int[n];
		System.out.println("Enter Array Element"+n);
			for(int i=0;i<n;i++)
			{
			
			
					int p=sc.nextInt();
					if(p<0)
					{
						System.out.println("Invalid Input");
					}
					else
					{
						arr[i]=p;
					}
		}
		
		/*System.out.println("Array are");
		for(int p:arr)
		{
			System.out.println(p);
		}*/
		System.out.println("Element to search");
		int c=sc.nextInt();
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]==c)
			{
				System.out.println(arr[i]);
				flag=1;
			}
		}
		
		if(flag==1)
		{
			System.out.println("Element found");
		}
			if(flag==0)
			{
				System.out.println("not found");
			}
		
		
		
		
		//findElementCount();

	}

	
}
