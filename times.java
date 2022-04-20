public class times{
    public static void main(String[] args){
     int [][] arr;
     arr = new int[8][9];
     
        for(int i = 0; i<arr.length;i++){
            System.out.println("times table:" + (i+1));
            for(int j =1 ; j <= arr[0].length; j++){
                System.out.print((i+1) + "X" + j + "="+(i+1)*j+ " ");
            }
            System.out.println();
        }
     
    }
 }