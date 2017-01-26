
public class ColorTriangle extends TriangleClass{

	private int color;
	
	public ColorTriangle(CLine ab, CLine bc, CLine ca, int color) {
		super(ab, bc, ca);
		this.color = color;	
	}

	public ColorTriangle(CPoint apexA, CPoint apexB, CPoint apexC, int color) {
		super(apexA, apexB, apexC);
		this.color = color;

	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
	
	

}
