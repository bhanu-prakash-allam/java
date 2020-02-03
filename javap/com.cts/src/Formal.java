 class Shape
{
	String color;
	Boolean isFilled;
	Shape(String color,Boolean isFilled)
	{
		
	}
	public  void setColor(String color)
	{
		
	}
	public String getColor()
	{
		return color;
	}
	public boolean isFilled()
	{
		return isFilled;
	}
	public void setFilled(boolean Filled)
	{
		
	}
	
}
 class Circle extends Shape
 {
	 double radius;
	 Circle(double radius)
	 {
      super("color", true);
	 }
	public double getRadius()
	 {
		return radius; 
	 }
	public void setRadius(double radius)
	{
		
	}
 }
 class Traingle extends Shape
 {
	 int base;
	 int height;
	 Traingle(int base,int height)
	 {
		 super("color",true);
	 }
	 
	public void setBase(int base)
	{
		
	}
	public void setHeight(int height)
	{
		
	}
 }

