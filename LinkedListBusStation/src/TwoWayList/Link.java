package TwoWayList;

/**
 * Created by sun on 09.03.17.
 */
class Link {
    public long dData;
    public Link next;

    public Link(long d) {
        dData = d;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}