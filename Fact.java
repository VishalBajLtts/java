package vishal;


import java.util.*;
class Fact{
public static int fact(int n){
int f=1;
for(int i=1;i<=n;i++){
f = f*i;
}
return f;
}
public static int count(int n){
int l=0;
while(n!=0){
l++;
n/=10;
}
return l;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
if(num>32767){
System.out.println("Number too large");
}
else if(num<=0){
System.out.println("Number too short");
}
else{
int size = count(num);
int[] arr = new int[size];
for(int j=size-1;j>=0;j--){
int rem=num%10;
int quo=num/10;
arr[j] = fact(rem);
num=quo;
}
for(int k=0;k<size;k++){
System.out.println(arr[k]);
}
}
}
}
