public class forEach {
    public static void main(String[] args){
        int [][] arr = {{2,3},{2,3,4,},{2,3,4,5},{2,3,4,5,6}};
        for(int[] arrs : arr){
            for(int arrss : arrs){
                System.out.print(arrss);
                System.out.print(",");
            }
            System.out.println();
        }
        
    System.out.println();
    System.out.println(sum(10,1));
    System.out.print(total(10));
    }
    public static int sum(int x,int y){
        return x+y;
    }

    public static int total(int z){
        int t =0;
        for(int i = 0; i<10;i++){
            t= t+i+1;
        }
        return t;
    }
}


    


