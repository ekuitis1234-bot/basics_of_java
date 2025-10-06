import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Colle{
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<Integer>();
        Set<Integer>set = new HashSet<Integer>();
        Map<String , Integer>mp = new HashMap<>();
        nums.add(2);
        nums.add(54);
        nums.add(27);

        set.add(5);
        set.add(15);
        set.add(25);

        mp.put("a",1);
        mp.put("b",2);
        mp.put("c",3);

         for(Object o :nums){
            System.out.println(o);
         }
        
         for(String key : mp.keySet()){
            System.out.println(mp.get(key));
         }
         
        System.out.println(nums);
        System.out.println(nums.get(2));
        System.out.println(mp.get("a"));
    }
}