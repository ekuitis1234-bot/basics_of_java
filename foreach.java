import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.*;
public class foreach {
    public static void main(String[] args) {

         Consumer<Integer> con =  (n)-> System.out.println(n % 2 == 0 ? 1 : -1);

            
         

        List<Integer>li = Arrays.asList(1,2,3,4);
        li.forEach(n -> System.out.println(n*2));
        li.forEach(con);

    }
}
