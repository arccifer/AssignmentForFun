package Collections;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        Object[] temp = new Object[map.size()];
        int n = 0;
        for(Object key: map.keySet()){
            if (map.get(key)==value){
                temp[n] = key;
                n++;
            }
        }
        return Arrays.copyOfRange(temp, 0, n);
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer, Integer> res = new TreeMap<>();
        if(size>=1){
            res.put(1, 1);
        }
        if(size>=2){
            res.put(2, 1);
        }
        for(int i=3; i<=size; i++){
            res.put(i, res.get(i-2)+res.get(i-1));
        }
        return res;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer, Integer> res = new TreeMap<>();
        if(size>=1){
            res.put(1, first);
        }
        if(size>=2){
            res.put(2, second);
        }
        for(int i=3; i<=size; i++){
            res.put(i, res.get(i-2)+res.get(i-1));
        }
        return res;
    }
}
