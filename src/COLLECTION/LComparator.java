package COLLECTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LComparator {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);
        System.out.println(nums);
        Comparator<Integer>com=new Comparator<Integer>(){
             public int  compare(Integer i,Integer j){
                if(i%10>j%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        Collections.sort(nums,com);
        System.out.println(nums);
    }
}  

