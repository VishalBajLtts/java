package vishal;

import java.util.Scanner;

public class Score {
	static int array[];
	static int size;
	static int score;
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			
					int p=sc.nextInt();
					if(p<0)
					{
						System.out.println("Invalid Input");
					}
					else
					{
						array[i]=p;
					}
		}
		/*System.out.println("Yor Array is ");
		for(int p:array)
		{
			System.out.println(p);
		}*/
		
		System.out.println("Enter min score");
		int score=sc.nextInt();
		int flag=0;
		for(int i=0;i<array.length;i++)
		{
			if(score!=array[i])
			{
				flag=0;
			}
			else
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Invalid Input");
		}
		
		findCricketerId(array,size,score);
	}
   public static void findCricketerId(int array[], int size, int score) {
	   
	  for(int i=0;i<array.length;i++)
	  {
		  if(array[i]>score)
		  {
			  System.out.println(array[i-1]);
		  }
	  }
		
	}

}
