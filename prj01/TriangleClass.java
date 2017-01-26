
public class TriangleClass {

	private CPoint apexA, apexB, apexC;
	private CLine sideAB, sideBC, sideCA;

	public TriangleClass(CPoint apexA, CPoint apexB, CPoint apexC) {
		this.apexA = apexA;
		this.apexB = apexB;
		this.apexC = apexC;
		// sideAB = new CLine(apexA, apexB);
	}
	
	public TriangleClass(CLine ab, CLine bc, CLine ca) {
		sideAB = ab;
		sideBC = bc;
		sideCA = ca;
	}

	// ленивая инициализация
	// синглтон
	// singleton

	public CLine getSideAB() {
		if (sideAB == null) { // если ссылка на сторону пустая - создаем, если
								// нет - возвращаем адрес существующей стороны
			sideAB = new CLine(apexA, apexB);
		}
		return sideAB;
	}

	public void setSideAB(CLine sideAB) {
		this.sideAB = sideAB;
	}

	public CLine getSideBC() {
		if (sideBC == null) {
			sideBC = new CLine(apexB, apexC);
		}
		return sideBC;
	}

	public void setSideBC(CLine sideBC) {
		this.sideBC = sideBC;
	}

	public CLine getSideCA() {
		if (sideCA == null) {
			sideCA = new CLine(apexC, apexA);
		}
		return sideCA;
	}

	public void setSideCA(CLine sideCA) {
		this.sideCA = sideCA;
	}

	@Override
	public String toString() {
		
		//return "Triangle A " + apexA + ", B " + apexB + ", C " + apexC;
		return "Triangle A " + sideAB + ", B " + sideBC + ", C " + sideCA;
	}
	
	
}
