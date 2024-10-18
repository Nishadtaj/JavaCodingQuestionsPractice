//BUBBLE SORT FOR ASCENDING ORDER

class BubbleSort
{
	public static void main(String[] args)
	{
		int a[]={10,30,40,20};
		int temp;
		for(int i=0;i<a.length-1;i++)
		{
			for (int j=0;j<a.length-i-1 ;j++ )
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array is:");
		for(int i=0;i<a.length ;i++ )
		{
			System.out.println(a[i]);
		}
	}

}
