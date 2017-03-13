package LinkListProject;

/**
 * Created by sun on 09.03.17.
 */
public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd);
        newLink.next = first; //newLink ----> строе значение first
        first = newLink; //first ----> newLink
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("List (first---->last): ");
        Link current = first; //от начала списка
        while (current != null) {  //перемещение до конца
            current.displayLink(); //вывод данных
            current = current.next;//переход к след элементу
        }
        System.out.println("");
    }

    public Link find(int key) {
        Link current = first; //начиная с первого
        while (current.iData != key) { // пока совпаение не найдено
            if (current.next == null) { //если достигли конца списка и совпадений нет
                return null;
            } else {
                current = current.next; //переходим к следующему
            }
        }
        return current; //совпадение обнаружено
    }

    public Link deleteWithKey(int key) {
        Link current = first;
        Link previous = first;
        while (current.iData != key) {
            if (current.next == null) { //если достигли конца списка и совпадений нет
                return null;
            } else {
                previous = current; //переход к следующему элементу
                current = current.next;
            }
        }

        if (current == first) { //если первый элем - изменить first
            first = first.next;
        } else { //елсти нет  -
            previous.next = current.next; //обойти его в списке
        }
        return current;
    }
}
