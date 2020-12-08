import java.util.*;
public class PairCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=6;
		int count=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]+arr[i]==sum)
				{
					count++;
				}
			}
		}
		if(count!=0)
		System.out.println(count);
		else
		System.out.println("no such pair found.");
		sc.close();
	}

}
