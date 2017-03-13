package BusStationProgramm;

/**
 * Created by sun on 07.03.17.
 */
public class MainBusStation {
    public static void main(String[] args) {
        LinkedListBus busPark = new LinkedListBus();
        busPark.add(new Bus("Vasya", 1, 10));
        busPark.add(new Bus("Kolya", 1, 11));
        busPark.add(new Bus("Anya", 1, 12));



        busPark.print();

        LinkedListBus busRoute = new LinkedListBus();
//      LinkedListBus.Node tempNode = null;
//        do {
//            tempNode = busPark.findAndDelNode(11);
//            if(tempNode !=null)
//                busRoute.addNode(tempNode);
//            else System.out.println("not bus with tis number");
//        } while (tempNode !=null);

        busRoute.add(busPark.findAndDelAllNode(10));
        //busRoute.add(busPark.findAndDelAllNodes(13));

        System.out.println("***********Park *****************");
        busPark.print();
        System.out.println("***********Road *****************");
        busRoute.print();
    }
}
