 interface  vehicle{
   abstract void run();

   
}
class car implements vehicle{
   public void run(){
    System.out.println("car weilll rn");
   }
}
class bike implements vehicle{
    public void run(){
    System.out.println("bike weilll rn");
   }
}

public class interfaces {
    public static void main(String[] args) {
        vehicle v1 = new car();
        vehicle v2 = new bike();

        v1.run();
        v2.run();
    }
}
