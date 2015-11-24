package fr.iutvalence.info.dut.m3105.preamble;

public class Shadow implements Shape
{
	public Shape Shape;
	public int Shadow;
	
	
	public Shadow(Shape Shape, int Shadow)
	{
		this.Shape = Shape;
		this.Shadow = Shadow;
	}
	
	public void draw(Position position) {
		System.out.printf("Shadow(%d)@%s%n",Shadow, position);
	}
}
