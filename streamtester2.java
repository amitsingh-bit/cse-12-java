import java.util.Arrays;
import java.util.stream.Stream;

void main(){
    int []arr={1,4,3,2,6,7,8,10,2};
    Stream <Integer> st1= Arrays.stream(arr).boxed();
    Integer[]arr2 ={1,4,3,2,6,7,8,10,2};
    Stream <Integer> st2= Arrays.stream(arr2); 
    st1.forEach(s->System.out.print(s+","));
    
    Stream<String> st3 =Stream.of("raj","daksh","vansh","chetan");
    st3.forEach(s->System.out.print(s+","));

}