import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream_practice {
    public static void main(String[] args) {
        List<Integer>l1 = Arrays.asList(1,2,3,4,5,6);
        
        int ans = l1.stream().filter(n-> n%2==0).map(n->n*n).reduce(0,(c,e)-> c+e);
        System.out.println(ans);
    }
}
