interface timepass{
    void show();
}
interface timepass2{
    void show(String s);
}
public class lambda {
    public static void main(String[] args) {
        timepass t1 = () -> System.out.println("hi");
        timepass2 t2 = (s) -> {
                System.out.println("hey "+ s);
            };
        
                
            
        
        t1.show();
        t2.show("bhus");
    }
}

