package fr.iutvalence.info.dut.m3105.preamble;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		Shape c1 = new Circle(1);
		c1.draw(new Position(1,0));
		
		Shape r1 = new Rectangle(1,2);
		r1.draw(new Position(1,0));
		
		Shape c2 = new ColorDecorator(c1, 1);
		c2.draw(new Position(1,2));
		
		Shape c3 = new borderDecorator(c1, 1);
		c3.draw(new Position(1,2));
		
		Shape c4 = new Shadow(c1, 1);
		c4.draw(new Position(1,2));
		
	}

}
