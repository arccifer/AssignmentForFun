package DansDilemma;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.xml.sax.InputSource;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        if (input1.equals(input2)){
            if(input1.equals(0d)){
                return 1;
            }
            if(input1.equals(1d)){
                return 3;
            }
            return 4;
        }
        if(input1.equals(0d) ||input2.equals(0d)){
            return 4;
        }
        return 6;
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        Set<Double> set = new TreeSet<>();
        Double[] inputs = new Double[]{input1, input2, input3};
        for (int i=0;i<2;i++){
            for (int j=i+1; j<3; j++){
                set.add(inputs[i]+inputs[j]);
                set.add(inputs[i]*inputs[j]);
                set.add(inputs[i]-inputs[j]);
                set.add(inputs[j]-inputs[i]);
                if(inputs[i]!=0){
                    set.add(inputs[j]/inputs[i]);
                }
                if(inputs[j]!=0){
                    set.add(inputs[i]/inputs[j]);
                }
            }
        }
        return set.size();
    }

    public Integer dilemmaOfN(Double... args){
        Set<Double> set = new HashSet<>();
        for (int i=0;i<args.length-1;i++){
            for (int j=i+1; j<args.length; j++){
                set.add(args[i]+args[j]);
                set.add(args[i]*args[j]);
                set.add(args[i]-args[j]);
                set.add(args[j]-args[i]);
                if(args[i]!=0){
                    set.add(args[j]/args[i]);
                }
                if(args[j]!=0){
                    set.add(args[i]/args[j]);
                }
            }
        }
        return set.size();
    }
}
