class car{
     String name ="wago";
    class engine{
        void prin(){
           System.out.println(name +" has volvo"  );
        }
        
    }
}
public class innerclass{
    public static void main(String[] args) {
        car c1 = new car();
        car.engine e1 = c1.new engine();
        System.out.println(c1.name);
        e1.prin();
    }
}