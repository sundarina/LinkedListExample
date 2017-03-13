package BusStationProgramm;

/**
 * Created by sun on 07.03.17.
 */

public class LinkedListBus {
    class Node {
        public Bus data;
        public Node next;

        public Node(Bus data) {
            this.data = data;
            next = null;
        }
    }

    private Node head;
    private Node tail;

    public LinkedListBus() {
        head = null;
        tail = head;
    }

    public void add(Bus data) { //добавление узлов в конец маршрута
        Node node = new Node(data);
        addNode(node);
    }

    public void add(LinkedListBus listBus) { //добавление узлов в конец маршрута
        if (listBus != null) {
            if (head == null) {
                head = listBus.head;
            } else {
                tail.next = listBus.head; //голова добавл списка
                tail = listBus.tail; //хвост добавл списка
            }
        }
    }

    public void addNode(Node node) {
        if (node != null) {
            node.next = null;
            if (head == null) {
                head = node;
                tail = head;
            } else {
                tail.next = node; //у того кто был хвостом - в качестве следующего сохр адрес на новосозданный узел
                tail = node; //последним будет тот, кого мы создали
            }
        }
    }

    public Bus findAndDel(int number) {
        Node iter = findAndDelNode(number);
        return iter == null ? null : iter.data;
    }

    public Node findAndDelNode(int number) {
        Node iter = head;
        Node prev = iter; //сохранение ссылки на пред эл
        while (iter != null) {
            if (iter.data.getNumber() == number) {
                prev.next = iter.next; //
                iter.next = null; //отсечение всех, кто был связан
                return iter;
            }
            prev = iter; //фиксировать тот элемент, с которого пререходим на следующий
            iter = iter.next;
        }
        return null;
    }


    //переделать
    public LinkedListBus findAndDelAllNode(int number) {
        Node iter = head;
        Node prev = iter; //сохранение ссылки на пред эл
        LinkedListBus busList = null;
        while (iter != null) {
            if (iter.data.getNumber() == number) {
                if (iter == head) head = head.next;
                else prev.next = iter.next; //
                Node temp = iter;
                iter = iter.next;
                if (busList == null) {
                    busList = new LinkedListBus(); //если пустой - создаем
                }
                busList.addNode(temp);
            }
            prev = iter; //фиксировать тот элемент, с которого пререходим на следующий
            iter = iter.next;
        }
        return busList;
    }

    public void print() {
        Node iter = head;
        while (iter != null) {
            System.out.println(iter.data);
            iter = iter.next;
        }
    }

}



