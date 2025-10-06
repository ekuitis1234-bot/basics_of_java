import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class comparator_vs_comparable {
    public static void main(String[] args) {

        Comparator<Integer> com = ( a ,  b) ->  a%10>b%10 ?1:-1;
            
        
        Comparator<String> com2 = new Comparator<String>() {
            public int compare(String a , String b){
                if(a.length() > b.length()) return 1;
                else return -1;
            }
        }; 
        
        List<Integer> li = new ArrayList<>();
        List<String > li2 = new ArrayList<>();
        li.add(5);
        li.add(22);
        li.add(3);

        li2.add("abc");
        li2.add("abcd");
        li2.add("abcde");

        Collections.sort(li , com);
        Collections.sort(li2 , com2);

        System.out.println(li);
        System.out.println(li2);
    }
}
