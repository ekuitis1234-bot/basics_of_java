public class multidime {
    public static void main(String[] args) {
        int arr[][]=new int[3][];
        arr[0] = new int[]{1, 2, 34, 4};
        arr[1] = new int[]{3, 4, 5};
        arr[2] = new int[]{3, 4, 5,6};
        arr[3] = new int[4];
        


        for(int n[] : arr){
            for(int m:n){
              System.out.print(m+" ");
            }
            System.out.println();
        }

    }
}
