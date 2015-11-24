package fr.iutvalence.info.dut.m3105.preamble;

public class CircleBuilder 
{
	public Shape shape;
	public int color;
	public int border;
	public int shadow;
	
	public CircleBuilder(int radius)
	{
		this.shape = new Circle(radius);
	}
	
	public Shape Color(int color)
	{
		return this.shape = new ColorDecorator(shape, color);
	}
	
	public Shape border(int border)
	{
		return this.shape = new borderDecorator(shape, border);
	}
	
	public Shape Shadow(int shadow)
	{
		return this.shape = new Shadow(shape, shadow);
	}
	
}
