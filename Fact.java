package vishal;

import java.util.Scanner;
class Fact
{
public static void main(String args[])
{
int n,i,fact=1;
System.out.println("Enter an integer to calculate its factorial");
Scanner sc =new Scanner(System.in);
n= sc.nextInt();
if(n<0)
{
System.out.println("Number too small");
}
else if(n>32767)
{
System.out.println("Number is too large");
}
else
{
for(i=1;i<=n;i++)
fact=fact*i;
System.out.println("Factorial of "+n+" is ="+fact);
}
}
}