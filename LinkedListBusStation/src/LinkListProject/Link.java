package LinkListProject;

/**
 * Created by sun on 09.03.17.
 */
public class Link {
    public int iData;
    public double dData;
    public Link next;

    public Link(int id, double dd) {
        this.iData = id;  //next = null автоматически
        this.dData = dd ;
    }

    public void displayLink() {
        System.out.print("{" + iData + " : " + dData + "}");
    }
}
