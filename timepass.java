public class timepass {
    public static void main(String[] args) {
        int arr[][]=new int [3][];
        arr[0] = new int[2];
        arr[1] = new int[2];
        arr[2] = new int[2];

        for(int a[] : arr){
            for(int b : a){
                System.out.println(a);
            }
        }
    }
}