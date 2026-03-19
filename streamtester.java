import java.util.Arrays
;
import java.util.stream.Stream;
void main(){
    int[]arr1={1,2,3,4,5};
    Stream<Integer> st1 =Arrays.stream(arr1).boxed();
    Integer []arr2={1,2,3,4,5};
     Stream<Integer>st2 =Arrays.stream(arr2);
     st1.forEach(s->System.out.print(s+","));
     System.out.println();
     Stream<String>st3=Stream.of("ram","shyam","mohan","mishra");
     System.out.println();
     st3.forEach(s->System.out.print(s+" "));
     Stream<Integer>nums=
     Stream.iterate(10,x->x+1).limit(10);
     nums.forEach((s->System.out.println(s+",")));

Stream<Integer> s1 = Stream.generate(() -> (int)(Math.random() * 100)).limit(10);
Stream<Integer>s2=s1.map(x->x+5);
Stream<Integer>s3=s2.sorted();
Stream<Integer>s4=s3.filter(x->x%2==0);
        s1.forEach(s -> System.out.println(s));
        s2.forEach(s -> System.out.println(s));
        s3.forEach(s -> System.out.println(s));
        s4.forEach(s -> System.out.println(s));




}