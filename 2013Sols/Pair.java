class Pair<T,U>
{	
	private T t;
	private U u; 
	
	Pair(T t0,U u0)
	{
		t=t0;u=u0;
	}
	public String toString()
	{
		return(t+ " , "+ u);
	}
}
interface Order<T>
{
	public boolean lte(T t);
}

class Triangle implements Order<Triangle>
{
	private double side1;
	private double side2;
	private double side3;

	Triangle(double s1, double s2, double s3)
	{
		side1=s1; side2= s2; side3= s3;
	}
	double area()
	{
		double s= (side1+side2+side3)/2;
		return(Math.sqrt((s*(s-side1)*(s-side2)*(s-side3))));
	}
	public boolean lte(Triangle t)
	{
		return(t.area()<=this.area());
	}
}