import java.util.*;
public class ListTester {
public static void main(String[] args) {
List<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");
list.add("Ruby");
list.add("DSA");
list.add("C++");
list.add("Java Script");
list.add("Objective C");
list.add("Scala");
System.out.println("Elements of List are:");
System.out.println(list);
System.out.println("Element at Index 1: " + list.get(1));
list.set(1,
"JavaScript");
System.out.println("Updated List: " + list);
System.out.println("Contains Java in the list:" + list.contains("Java"));
System.out.println("Index of C++ in the list:" + list.indexOf("C++"));
System.out.println("Last index of C++ in the list:" +
list.lastIndexOf("C++"));
list.remove("C++");
System.out.println("List After Removing Element: " + list);
list.remove(2);
System.out.println("List after removing element from index 2:" + list);
System.out.println("Total elements are:" + list.size());
System.out.println("is List empty:" + list.isEmpty());
System.out.println("Languages are:");
for (var item : list)
System.out.println(item);
}
}