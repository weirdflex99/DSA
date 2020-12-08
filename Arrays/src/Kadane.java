import java.util.*;
public class Kadane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int max_ending_here=0;
			int max_so_far=Integer.MIN_VALUE;
			for(int i=0;i<n;i++)
			{
				max_ending_here=max_ending_here+arr[i];
				if(max_ending_here<arr[i])
				{
					max_ending_here=arr[i];
				}
				if(max_so_far<max_ending_here)
				{
					max_so_far=max_ending_here;
				}
			}
			System.out.println(max_so_far);
			sc.close();
			
 
	}

}
