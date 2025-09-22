class animal{
    public animal(String action){
        System.out.println("animal shouts");
        System.out.println("specifically it "+ action);
    }
}
public class constructor {
   public static void main(String[] args) {
      animal a1 = new animal("barks");
      animal a2 = new animal("growls");
   }   
}
