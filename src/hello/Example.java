package hello;
class Box
{
	double width,height,depth;
	Box()
	{
		width = 10;
		height = 10;
		depth = 5;
	}
	double volume()
	{
		return width*height*depth;
		}
	}

public class Example 
{
	public static void main(String args[])
	{
		Box box= new Box();
		double v;
		v = box.volume();
		System.out.println("长方体的体积为:" + v);
		
	}

}
