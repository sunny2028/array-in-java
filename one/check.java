package one;
import java.lang.Math;
/*import java.util.Scanner;*/
public class check {
	protected static void check1(int n)
	{for(int i=1;i<=n;i++)
	{if(i%2==0)
		System.out.println(i);
	}
		
	}
public static void check2()
{
for(int i=0;i<5;i++)
{
	for(int j=0;j<5-i;j++)
	{System.out.print("*");
	}
System.out.println();
}	
}
public static void check3(int n)
{
	for(int i=2;i<=n;i++)
	{int count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
				count++;
		}
		if (count==2)
			System.out.println(i);
	}
}
 protected static boolean check4(int n)
 {int temp=n,temp1=n;
 int count=0,sum=0;
 while(temp!=0)
 {
	 count++;
	 temp/=10;
 }
 

 while(n!=0)
 {
	 sum=sum+(int)Math.pow(n%10,count);
	 n/=10;
 }

 if(sum==temp1)
	 return true;
 else return false;
 }
 public static int check5(int n)
 {
	 int temp=n,rev=0;
	 while(temp!=0)
	 {
		 rev=10*rev+(temp%10);
		 temp=temp/10;
		 
	 }
	 return rev;
		 
 }
 public static void check7(int []arr,int n)
 {
	 int low=0,high=arr.length-1,mid;
	 while(low<=high)
	 {
		 mid=(low+high)/2;
		 if(arr[mid]==n)
		 {
			 System.out.println("element is present");
			 return;
		 }
		 else if(arr[mid]>n)
			 high=mid-1;
		 else
			 low=mid+1;
	 }
	 System.out.println("element is not present");
	 
 }

};
