void main (){
    Class<?> c= java.lang.String.class;
    System.out.println("All the methods ");
    for(var m:c.getDeclaredMethods()){
        System.out.println(m);
    }

    System.out.println("All the fields ");
    for (var f:c.getDeclaredFields())
        System.out.println(f);
}