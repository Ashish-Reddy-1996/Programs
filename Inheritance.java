class Demo
{
	int a;
	int b;
	Demo()
	{
		a=10;
		b=20;
	}
	Demo(int m,int n)
	{
		a=m;
		b=n;
	}
}

class Demo1 extends Demo
{
	int c;
	int d;
	Demo1()
	{
		c=30;
		d=40;
	}
	Demo1(int p,int q)
	{
		c=p;
		d=q;
	}
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}


class Inheritance 
{
	public static void main(String[] args) 
	{
		Demo1 d=new Demo1(11,22);
		Demo1 d1=new Demo1();
		d.disp();
		d1.disp();
	}
}
