package intern;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = {2,56,74,34,1,8};
		int num = arr[0], temp;
		for(int n=1;n<arr.length;n++)
		{
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i]<arr[i-1])
				{
					temp = arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
				}
				else continue;
			}
		}
       for(int k:arr)
       {
    	   System.out.println(k+" ");
       }
	}

}
