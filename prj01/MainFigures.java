package prj01;

public class MainFigures {

	public static void main(String[] args) {
		CPoint cp1 = new CPoint(0, 0);
		CPoint cp2 = new CPoint(1, 1);
		CPoint cp3 = new CPoint(6,6);
		// cсылка храниться в стеке Stack, экземпляр храниться в HEAP (куче)
		System.out.println(cp1); // автовызов метода toString()
		CcoloredPoint ccp1 = new CcoloredPoint(1, 1, 333333);
		System.out.println(ccp1);
		CcoloredPoint ccp2 = new CcoloredPoint(cp1, 222222);
		CcoloredPoint ccp3 = new CcoloredPoint(new CPoint(1, 2), 444444);
		CLine cl1 = new CLine(1, 1, 2, 2); // композиция
		CLine cl2 = new CLine(cp1, cp2);
		CLine cl3 = new CLine(new CPoint(3, 3), new CPoint(4, 4)); 
		/*
		 * формально - по ссылке, по выделению памяти и жизни - то удалиться
		 * вместе с линией
		 */
		
		System.out.println(cl3);

		CcoloredLine ccl1 = new CcoloredLine(cl1, 555555);
		System.out.println(ccl1);
		CcoloredLine ccl2 = new CcoloredLine(cp1, cp2, 398948);
		System.out.println(ccl2);
		CcoloredLine ccl3 = new CcoloredLine(new CcoloredPoint(cp3, 77777), new CcoloredPoint(3, 3, 666666), 898891);
		System.out.println(ccl3);
		
	
		
		
	}

}
