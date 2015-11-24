package fr.iutvalence.info.dut.m3105.preamble;

public class Circle implements Shape 
{
	@Override
	public void draw(Position position) {
		System.out.printf("Circle(%d)@%s%n",radius, position);
	}

	public int radius;
	
	public Circle(int radius)
	{
		this.radius = radius;
	}
}
