package Collections;

import java.util.ArrayList;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int sum = 0;
        for(int d : list1)
            sum += d;
        for(int d : list2)
            sum += d;
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i: original){
            if (toRemove==null || i != toRemove){
                res.add(i);
            }
        }
        return original;
    }

    public boolean happyList(ArrayList<String> original) {
        for (int i=0;i<original.size()-1;i++){
            int happy = 0;
            for (char c: original.get(i).toCharArray()){
                for (char c2: original.get(i+1).toCharArray()){
                    if (c==c2){
                        happy = 1;
                        break;
                    }
                }
                if (happy==1){
                    break;
                }
            }
            if (happy==0){
                return false;
            }
        }
        return true;
    }
}
