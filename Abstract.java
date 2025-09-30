abstract class car{
   void run(){
    System.out.println("car runs");
   }
   abstract void fly();
}
class wagor extends car{
    void run(){
        System.out.println("wagorn runs");
    }
    void fly(){
        System.out.println("wagnor flys");
    }
}
public class Abstract{
    public static void main(String[] args) {
        car c1 = new wagor();
       
       
        c1.run();
        c1.fly();
    }
}