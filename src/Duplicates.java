import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicates {
    public static void main(String[] args) {
        int[] A = {1,1,2,2,2,3,3,3,3,3,4,4,5,5};
        Map<Integer,Integer> CE = new HashMap<>();

        for(int i : A){
            CE.put(i, CE.getOrDefault(i,0)+1);
        }

        List<Integer> dup = new ArrayList<>();
        List<Integer> Ele = new ArrayList<>();
        for (Map.Entry<Integer, Integer> i : CE.entrySet()) {
            if (i.getValue() > 1) {
                dup.add(i.getKey());
                Ele.add(i.getValue());
            }
        }

        System.out.println("Elements: " + dup);
        System.out.println("Frequencr: " + Ele);
    }
}
