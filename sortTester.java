void show(int[] ans) {
    for(var a : ans) {
        System.out.print(a+" ");
    System.out.println();
    }
}

void main() {
    int[] nums = {2,3,-1,0,90,45};
    show(nums);
    Arrays.sort(nums);
    show(nums);
}