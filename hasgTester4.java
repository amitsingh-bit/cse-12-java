import java.util.Hashtable;

void main(){
    Map<String,Integer> map = new Hashtable<>();
    map.put("ravi",88);
    map.put("kavi",45);
    map.put("bavi",52);
    System.out.println(map);
    map.put("bavi",22);
    System.out.println(map);
    map.put("bavi",null);
    System.out.println(map);
    
    Map<String,Integer> map2 = new Hashtable<>();
    map2.putAll(map);
    System.out.println(map2);
    System.out.println(map.get("ravi"));
    System.out.println(map.getOrDefault("Ramesh", null));
    map2.forEach((k, v) -> {
        System.out.println(k + ":" + v);
    });
}