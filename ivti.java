import java.util.List;

public class ivti {
    public static void main(String[] args) {

        var x = 10;
        var y = 20.5f;
        var z = x + y;

        System.out.println(x + " " + y + " " + z);

        int[] arr = {1, 4, 3, 2, 5, 6, 7};

        for (var j : arr) {
            System.out.print(j + " ");
        }

        System.out.println();

        var names = List.of("aa", "bb", "cc", "dd");

        for (var name : names) {
            System.out.print(name + " ");
        }
    }
}