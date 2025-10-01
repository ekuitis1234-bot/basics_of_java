public class exception_1{
    public static void main(String[] args) {
        int i=10;
        int j=0;

        try{
            j=j/i;
        }
        catch(ArithmeticException e){
          System.out.println("arithmatic");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array error");
        }
        catch(NullPointerException e){
            System.out.println("number format");
        }
    }
}