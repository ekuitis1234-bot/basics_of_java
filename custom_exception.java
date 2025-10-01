class dbexceptoin extends Exception {
   dbexceptoin(String s){
    super(s);
   }
   void connect(){
    System.out.println("connect to new db");
   }
}
public class custom_exception {
    public static void main(String[] args) {
        try{
            throw new dbexceptoin("this is wrong");
        }
        catch(dbexceptoin e){
            System.out.println("this is db exception nameed as : " + e);
            e.connect();
        }
    }
}
