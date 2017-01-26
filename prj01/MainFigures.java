abstract class AbstractFigureFabric {
	public abstract Figure rand();
	public abstract Figure getFigure(int n);
}


class ColorFigureFabric extends AbstractFigureFabric {

	public  Figure rand(){
		   return getFigure((int)(Math.random()*2));
	   } 
	
		/**фабричный метод
		 * можно сколько угодно добавлять фигур */
		
	public  Figure getFigure(int n) { //метод, что будет возвращать какуюто фигуру
		switch (n) {
		case 0 : return new  CcoloredPoint(3, 4, 222222);
		case 1 : return new CcoloredLine(4, 5, 6, 7, 555555);
		default: return null;
		}
	}
}

class FigureFabric extends AbstractFigureFabric {

	
	public  Figure rand(){
		   return getFigure((int)(Math.random()*2));
	   } 
	
		/**фабричный метод
		 * можно сколько угодно добавлять фигур */
	
		public  Figure getFigure(int n) { //метод, что будет возвращать какуюто фигуру
			switch (n) {
			case 0: return new CPoint(0,0);
			case 1 : return new CLine(1,2,3,4);
		
			default: return null;
			}
		}
	}


public class MainFigures {	

	public static void print(Figure fig) {
		// if (fig.getClass().getName().equals("CPoint")) // возвращает строку
		//if (fig instanceof CPoint) // ртти динамическое приведение

		//	System.out.println("This Point X = " + ((CPoint) fig).getX());
		//else
			fig.display();
	}

	public static void main(String[] args) {

		CPoint cp1 = new CPoint(0, 0);
		CPoint cp2 = new CPoint(1, 1);
		CPoint cp3 = new CPoint(6, 6);
		// cсылка храниться в стеке Stack, экземпляр храниться в HEAP (куче)
	//	System.out.println(cp1); // автовызов метода toString()
		CcoloredPoint ccp1 = new CcoloredPoint(1, 1, 333333);
	//	System.out.println(ccp1);
		CcoloredPoint ccp2 = new CcoloredPoint(cp1, 222222);
		CcoloredPoint ccp3 = new CcoloredPoint(new CPoint(1, 2), 444444);

		CLine cl1 = new CLine(1, 1, 2, 2); // композиция
		CLine cl2 = new CLine(cp1, cp2);
		CLine cl3 = new CLine(new CPoint(3, 3), new CPoint(4, 4));
		/*
		 * формально - по ссылке, по выделению памяти и жизни - то удалиться
		 * вместе с линией
		 */

		//System.out.println(cl3);

		CcoloredLine ccl1 = new CcoloredLine(cl1, 555555);
		//System.out.println(ccl1);
		CcoloredLine ccl2 = new CcoloredLine(cp1, cp2, 398948);
		//System.out.println(ccl2);
		CcoloredLine ccl3 = new CcoloredLine(new CcoloredPoint(cp3, 77777), new CcoloredPoint(3, 3, 666666), 898891);
		//System.out.println(ccl3);

		TriangleClass ctr1 = new TriangleClass(cp1, new CPoint(3, 4), new CPoint(cp3));
		TriangleClass ctr2 = new TriangleClass(cl1, cl2, ccl2);
		// System.out.println(ctr1);
		//System.out.println(ctr2);

		ColorTriangle colorT = new ColorTriangle(cl2, new CLine(cl1.getStart(), cl3.getEnd()), cl1, ccl1.getColor());
		//System.out.println(colorT);
		ColorTriangle colorT2 = new ColorTriangle(colorT.getSideAB(), colorT.getSideBC(), colorT.getSideCA(),
				ccp3.getColor());
		//System.out.println(colorT2);

		TriangleClass tri = new TriangleClass(cp1, cp2, new CPoint(3, 3));
		tri.lengthAB();

		Figure[] masFig = new Figure[100]; /*
											 * обьединение под общим
											 * интерфейсом, каждый из обьектов
											 * содержит метод, описаный в
											 * интерф. который обьеденяет всех.
											 * класс обязан выполнить контракт -
											 * реализов метод
											 */
		
		AbstractFigureFabric fabric = new ColorFigureFabric();
		
		for (int i = 0; i < masFig.length; i++) {
			masFig[i] = fabric.rand();
		}
//		masCPoint[0] = cp1;
//		masCPoint[1] = ccp1; // реализация полиморфизма. ссылка и родительского
//								// класса, засовывать можно и этот класс и
//								// потомки
//		masCPoint[2] = cl1;
//		masCPoint[3] = tri;

		int countColor = 0;

		CcoloredPoint colorpoint = new CcoloredPoint(cp1, 123456);
		System.out.println(colorpoint);

		ColorAble[] masColor = new ColorAble[10];
		
		for (Figure figure : masFig) {
			
			System.out.println(figure.toString() + " instatce " + figure.getClass().getName());
			print(figure);
			if (figure instanceof ColorAble)
				masColor[countColor++] = (ColorAble)figure;
		}
		masColor[0] = new CcoloredPoint(ccp2, 23456);

//		masColor[1] = new CcoloredLine(ccp1, ccp2, 485857);
//		masColor[2] = ccp3;

		int countPoint = 0;
		CPoint [] masPoint = new CPoint[10];
		for (Figure figure : masFig) {
			System.out.println(figure.toString() + " instatce " + figure.getClass().getName());
			if (figure instanceof CPoint)
				masPoint[countPoint++] = (CPoint)figure;
		}
		
	}

}
