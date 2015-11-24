package fr.iutvalence.info.dut.m3105.preamble;

public class borderDecorator implements Shape
{
	public Shape Shape;
	public int border;
	
	
	public borderDecorator(Shape Shape, int border)
	{
		this.Shape = Shape;
		this.border = border;
	}
	
	public void draw(Position position) {
		System.out.printf("border(%d)@%s%n",border, position);
	}
}
