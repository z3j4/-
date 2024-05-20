import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class lun {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");
        System.out.println(STR."ArrayList size: \{arrayList.size()}");
        List<String> otherList = new ArrayList<>();
        otherList.add("Element 4");
        otherList.add("Element 5");
        arrayList.addAll(otherList);
        System.out.println(STR."ArrayList size after addAll: \{arrayList.size()}");
        arrayList.remove("Element 2");
        System.out.println(STR."ArrayList size after remove: \{arrayList.size()}");
        arrayList.set(0, "Updated Element 1");
        System.out.println(STR."Updated ArrayList: \{arrayList}");
        List<String> subList = arrayList.subList(1, 3);
        System.out.println(STR."SubList: \{subList}");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Linked Element 1");
        linkedList.add("Linked Element 2");
        linkedList.add("Linked Element 3");
        System.out.println(STR."LinkedList size: \{linkedList.size()}");
        linkedList.addFirst("New head element");
        System.out.println(STR."LinkedList size after addFirst: \{linkedList.size()}");
        linkedList.addLast("New tail element");
        System.out.println(STR."LinkedList size after addLast: \{linkedList.size()}");
        System.out.println(STR."First element: \{linkedList.getFirst()}");
        System.out.println(STR."Last element: \{linkedList.getLast()}");
        linkedList.remove("Linked Element 2");
        System.out.println(STR."LinkedList size after remove: \{linkedList.size()}");
    }
}