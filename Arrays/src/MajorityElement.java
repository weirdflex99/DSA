
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {1,2,2,3,3,4,2};
        int majority=arr[0];
        int count=0;
        int k=0;
        int n=arr.length;
        
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]==majority)
        	{
        		count++;
        	}
        	else
        		count--;
            if(count==0)
            {
            	majority=arr[i];
            	count=1;
            }
        }
        for(int i=0;i<n;i++)
        {
        	if(arr[i]==majority)
        	{
        		k++;
        	}
        }
        if(k>n/2)
        {
        	System.out.println("Majority Element:" +" "+majority);
        }
        else
        {
        	System.out.println("Not Present");
        }
	}

}
