class animal{
   private int age=11;
    String name="bhus";

    void getter(){
        System.out.println(age);
    }
    String setter(String s){
        return name+s;
    }
}
public class encapsulation{
    public static void main(String[] args) {
        animal a1 = new animal();
        a1.getter();
       String result = a1.setter("tiger");
       System.out.println(result);
        System.out.println(a1.name);
    }
}