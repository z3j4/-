import java.util.ArrayList;
import java.util.LinkedList;
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");
        for (String element : arrayList) {
            System.out.println(element);
        }
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Linked Element 1");
        linkedList.add("Linked Element 2");
        linkedList.add("Linked Element 3");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }


