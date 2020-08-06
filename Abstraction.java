abstract class Plane
{
	abstract void takeOff();
	abstract void fly();
	abstract void land();
}

class CargoPlane extends Plane
{
	void takeOff()
	{
		System.out.println("Cargo plane requires long runway");
	}
	void fly()
	{
		System.out.println("Cargo plane flies at low altitude");
	}
	void land()
	{
		System.out.println("Cargo plane requiers long runway");
	}
}

class PassengerPlane extends Plane
{
	void takeOff()
	{
		System.out.println("Pasenger Plane requires medium runway");
	}
	void fly()
	{
		System.out.println("Pasenger Plane flies at medium altitude");
	}
	void land()
	{
		System.out.println("Pasenger Plane requiers medium runway");
	}
}

class FighterPlane extends Plane
{
	void takeOff()
	{
		System.out.println("FighterPlane requires short runway");
	}
	void fly()
	{
		System.out.println("FighterPlane flies at short altitude");
	}
	void land()
	{
		System.out.println("FighterPlane requiers short runway");
	}
}

class Sky
{
	void permit(Plane ref)
	{
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

class  Abstraction
{
	public static void main(String[] args) 
	{
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		
		Sky s=new Sky();
		
		s.permit(cp);
		s.permit(pp);
		s.permit(fp);
	}
}
