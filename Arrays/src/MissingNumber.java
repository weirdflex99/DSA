import java.util.*;
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=0;
		int arr[]=new int[n];
		for(int i=0;i<n-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		
        int res2=1;
        for(int i=0;i<n-1;i++)
        {
            res=res^arr[i];
        }
        for(int i=2;i<=n;i++)
        {
            res2=res2^i;
            
        }
        System.out.print( res^res2);
	}

}
