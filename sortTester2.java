import java.util.ArrayList;
import java.util.Collections;

void show(List<?> data) {
    for (var d : data)
        System.out.print(d + " ");
    System.out.println();
}

void main() {
    ArrayList<Integer> nums = new ArrayList<>();
    nums.addAll(Arrays.asList(2, 5, 1, 0, -5, 22, 56, 54));
    show(nums);
    Collections.sort(nums);
    show(nums);
}