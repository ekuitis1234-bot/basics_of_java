import java.util.Scanner;
public class finally_exc {
    public static void main(String[] args) {
        int num;
        try(Scanner sc = new Scanner(System.in)){
           num = sc.nextInt();
        }
        finally{
            System.out.println("all resources freed");
        }
    }
}
