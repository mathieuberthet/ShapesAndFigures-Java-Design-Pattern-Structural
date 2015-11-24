package fr.iutvalence.info.dut.m3105.preamble;

public class Rectangle implements Shape
{
	public int width;
	public int height;
	
	@Override
	public void draw(Position position) {
		System.out.printf("Rectangle(%d,%d)@%s%n",width, height, position);
		
	}

	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
}
