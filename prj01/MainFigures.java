package prj01;

public class MainFigures {

	public static void main(String[] args) {
		CPoint cp1 = new CPoint(0, 0);
		CPoint cp2 = new CPoint(1, 1);
		//cсылка храниться в стеке Stack, экземпляр храниться в HEAP (куче)
		System.out.println(cp1); //автовызов метода toString()
		CcoloredPoint ccp1 = new CcoloredPoint(1, 1, 333333);
		System.out.println(ccp1);
		CcoloredPoint ccp2 = new CcoloredPoint(cp1, 222222);
		CcoloredPoint ccp3 = new CcoloredPoint(new CPoint(1,2), 444444);
		CLine cl = new CLine(1, 1, 2, 2); //композиция
		CLine cl2 = new CLine(cp1, cp2);
	}

}
