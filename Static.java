class car{
    int no;
   static String type;
   

   static{
    type="car";
    System.out.println("first time only");
   }

   public static void hi(car s){
    System.out.println("hey this is "+ s.no);
   }
}
public class Static {
    public static void main(String[] args) {
        car c1 = new car();
        c1.no=1;
        c1.type="seden";

        car c2 = new car();
        c2.no=2;
        c2.type="hatchback";

        System.out.println(c1.no +" "+car.type);
        System.out.println(c2.no +" "+car.type);

        car.hi(c1);
        car.hi(c2);

        
    }
}
