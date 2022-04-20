public class maxEx {
    public static void main(String [] args){
        int [] arr = {1,6,33,2,12,0,44};
        int max = 0;
        int min =0;
        for(int i = 0 ; i< arr.length ; i++){
                if(max < arr[i]){
                    max = arr[i];
                }
                if(min > arr[i]){
                    min = arr[i];
                }

             

            }
            System.out.println(max);
            System.out.println(min);
        }
    }

