class Launch 
{
	static int count;
	
	Launch()
	{
		System.out.println("No of objects created = "+count);
	}

	{
		count++;
	}

	public static void main(String[] args) 
	{
		Launch l=new Launch();
		Launch l1=new Launch();
	}
}
