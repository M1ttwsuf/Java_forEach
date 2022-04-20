class forEx{
    public static void main(String [] args){
       int [] arr = {11 , 22, 6, 32};

       for(int i =0 ; i < arr.length-1; i++){
        int tmp =0;
         if(arr[i] < arr[i+1]){
             tmp =arr[i] ;
             arr[i] = arr[i+1];
             arr[i+1] = tmp;
         }
        }
         for(int i =0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
         }
       }
    
}
