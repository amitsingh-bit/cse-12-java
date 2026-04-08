import java.util.HashMap;

void main(){
    Map<String,Integer> map = new HashMap<>();
    map.put("ravi",88);
    map.put("kavi",45);
    map.put("bavi",52);
    System.out.println(map);
    map.put("bavi",22);
    System.out.println(map);
    map.put("bavi",null);
    System.out.println(map);
}