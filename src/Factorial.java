class Factorial
{
	static int[] fact(int n)
	{
		int a[]=new int [n];
		int fact=1;
		
		for(int i=1,j=0;i<=n;i++)
		{
			fact=fact*i;
			a[j++]=fact;
		}
		return a;
	
	}
	static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) 
	{
		int arr[]=fact(5);
			display(fact(5));
		
	}
}
