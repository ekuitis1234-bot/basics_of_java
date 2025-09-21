class student{
    int rno;
    String name;

}
public class arrayofobjects {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
    
         s1.name="bhus";
         s1.rno=1;

         s2.name="ram";
         s2.rno=2;

         student s[] = new student[2];
         s[0]=s1;
         s[1]=s2;

         for(student si : s){
            System.out.println(si.name +" " + si.rno);
         }
         
    }
}
