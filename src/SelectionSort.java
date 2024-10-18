class SelectionSort
{
	public static void main(String[] args) 
	{
		int a[]={20,10,40,30};
		for(int i=0;i<a.length-1;i++)
			{
				int min_pos=i;
				for (int j=i+1;j<a.length ;j++ )
				{
				if(a[min_pos]>a[j])
				{
					min_pos=j;
				}
				}
				if(i!=min_pos)
				{
					int temp=a[i];
					a[i]=a[min_pos];
					a[min_pos]=temp;
				}
			}
		System.out.println("Sorted array is:");
		for (int i=0;i<a.length ;i++ )
		{
		  System.out.println(a[i]);

			
		}
	}
}
