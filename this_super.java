class cars{
    public cars(){
       System.out.println("hi");
    }
    public cars(int a){
        this();

    }
   
}
class honda extends cars{
    public honda(){
        System.out.println("this is honda");
    }
    public honda(int a){
        this();
    }
}
public class this_super {
    public static void main(String[] args) {
        honda c1 = new honda(2);
    }
}
