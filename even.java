import one.check;

import java.util.Arrays;
import java.util.Scanner;


public class even extends check {
	public static void main(String[] args)
	{   check2();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number for question 2");
		int n=sc.nextInt();
		check1(n);
		System.out.println("enter the number for question 3");
		int n1=sc.nextInt();
		check3(n1);
		System.out.println("enter the number for question 4");
		int n2=sc.nextInt();
		if(check4(n2))
			System.out.println("yes it is a Armstrong number");
		else
			System.out.println("no it is not a Armstrong number");
		System.out.println("enter the number for question 5");
		int n3=sc.nextInt();
		System.out.println(check5(n3));
		System.out.println("enter the size of array for question 6");
		int n4=sc.nextInt();
		int []arr=new int[n4];
		System.out.println("enter array elements");
		for(int i=0;i<n4;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
		System.out.println("enter the element to be searched for question 7");
		int n5=sc.nextInt();
		check7(arr,n5);
	}

}
