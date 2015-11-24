package fr.iutvalence.info.dut.m3105.preamble;

public class ColorDecorator implements Shape
{
	public Shape Shape;
	public int color;
	
	
	public ColorDecorator(Shape Shape, int color)
	{
		this.Shape = Shape;
		this.color = color;
	}
	
	public void draw(Position position) {
		System.out.printf("Circle with Color(%d)@%s%n",color, position);
	}
}
