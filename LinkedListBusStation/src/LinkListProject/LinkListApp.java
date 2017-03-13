package LinkListProject;

import java.util.LinkedList;

/**
 * Created by sun on 09.03.17.
 */
public class LinkListApp {
    public static void main(String [] args) {
        LinkList theList = new LinkList();
        theList.insertFirst(22, 77.4);
        theList.insertFirst(33, 88.4);
        theList.insertFirst(44, 99.4);
        theList.insertFirst(55, 11.4);
        theList.insertFirst(66, 22.4);

        theList.displayList();

        while (!theList.isEmpty()) {
            Link aLink = theList.deleteFirst();
            System.out.println("Deleted: ");
            aLink.displayLink();
            System.out.println("");
        }
        theList.displayList();

        theList.insertFirst(1, 91.4);
        theList.insertFirst(2, 82.4);
        theList.insertFirst(3, 73.4);
        theList.insertFirst(4, 64.4);
        theList.insertFirst(5, 55.4);

        theList.displayList();;

        Link f = theList.find(3);
        if(f !=null) {
            System.out.println("Found link with key " + f.iData);
        } else {
            System.out.println("Link with key " + f.iData + " not found");
        }

        Link d = theList.deleteWithKey(5);
        if(d!=null){
            System.out.println("Deleted link with key " + d.iData);
        } else {
            System.out.println("Can't delete link with key " + f.iData);
        }

        theList.displayList();
    }
}
