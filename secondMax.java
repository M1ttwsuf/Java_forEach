import java.util.*;
public class secondMax {
    public static void main(String [] args){
        // Array or Collections method Ex
        int [] arr = {1,6,33,2,12,0,44};
       List<Integer> list = Arrays.asList(1,6,33,2,12,0,44);
       

        Arrays.sort(arr);
        Collections.sort(list);

        System.out.println(Arrays.toString(arr));
        System.out.println(list);
    }
}
