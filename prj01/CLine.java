package prj01;

public class CLine  {

	private CPoint start;
	private CPoint end;
	
	//полиморфизм, перегрузка конструктора средством изменения сигнатурі метода
	
	public CLine(int x1, int y1, int x2, int y2) { //композиция. данные по значению , существуют только внутри линии
		this.start = new CPoint(x1, y1); //агрегация : создание нового обьекта, который получает на ввод ссылки
		this.end = new CPoint(x2, y2);
	}

	public CLine(CPoint start, CPoint end) { //передача данных по ссылке
		this.start = start;
		this.end = end;
	}

	public CPoint getStart() {
		return start;
	}

	public void setStart(CPoint start) {
		this.start = start;
	}

	public CPoint getEnd() {
		return end;
	}

	public void setEnd(CPoint end) {
		this.end = end;
	}

}
 