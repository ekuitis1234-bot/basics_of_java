enum days{
    mon("running") , tue("jogging") , wed , thurs("weight lift") , fri("cardio") , sat;

    private String activity = "rest";
    days(){
       System.out.println("today's activity is " + activity);
    }
    days(String s){
        System.out.println("todays activitiy is "+ s);
    }
}
public class Enum {
    
    public static void main(String[] args) {
       

        days arr[] = days.values();
        for(days e : arr){
            System.out.println(e + " " + e.ordinal());
        }
    }
}
