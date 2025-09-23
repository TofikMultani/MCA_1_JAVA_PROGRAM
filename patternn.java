class patternn
{

	public static void main(String []args)
	{
	
		int num=5;
			for(int i=num; i>=1; i--)
			{
				for(int j=num-i; j>=1; j--)
				{
					System.out.print(" ");
				}

				for(int k=1; k<=i; k++)
				{
					System.out.print(k + " ");
				}
			System.out.println();
		}
	}

}