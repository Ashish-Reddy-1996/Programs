class Calculator
{
	int add(int x,int y)
	{
		return x+y;
	}
	
	float add(int x,float y)
	{
		return x+y;
	}

	double add(int x,double y)
	{
		return x+y;
	}

	float add(float x,float y)
	{
		return x+y;
	}

	int add(int x,int y,int z)
	{
		return x+y+z;
	}
	
	double add(int x,float y,double z)
	{
		return x+y+z;
	}
}


class OverLoading 
{
	public static void main(String[] args) 
	{
		int a=10,b=20,c=30;
		float x=10.5f,y=13.2f,z=40.7f;
		double m=25.0,n=20.0,o=84.0;
		Calculator cal = new Calculator();
		System.out.println(cal.add(a,m));
		System.out.println(cal.add(b,n));
		System.out.println(cal.add(a,x,m));
	}
}
