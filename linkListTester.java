import java.util.LinkedList;

public class linkListTester{
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Watermelon");
        fruits.add("Pineapple");
        fruits.add("Orange");
        // Add at the beginning and end
        fruits.addFirst("Orange");
        fruits.addLast("Grapes");
        // Remove elements
        fruits.remove("Banana");
        fruits.removeFirst(); // Orange
        fruits.removeLast(); // Grapes
        // Access elements
        System.out.println("First: " + fruits.getFirst());
        System.out.println("Last: " + fruits.getLast());
        System.out.println(fruits);
        var node = fruits.iterator();
        System.out.println("Forward movement");
        while (node.hasNext())
            System.out.print(node.next() + " ");
        System.out.println();
        // move itertor to the last
        var node2 = fruits.listIterator(fruits.size());
        System.out.println("Backward direction");
        while (node2.hasPrevious()) {
            System.out.print(node2.previous() + " ");
        }
        System.out.println();
        System.out.println("using foreach");
        fruits.forEach(item -> System.out.print(item + " "));
        System.out.println();
    }
}