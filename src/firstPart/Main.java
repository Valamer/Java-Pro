package firstPart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Main {
    static int countOccurance (List<String> list, String row){
        int count = 0;
        for(String word : list){
            if(word.equals(row)) count++;
        }
        return count;
    }

    static <T> List<T> toList (T[] array) {
        return Arrays.asList(array);
    }

    static List<Integer> findUnique(List<Integer> integers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : integers) {
            if(!result.contains(number)) result.add(number);
        }
        return result;
    }

    static HashMap<String, Integer> findOccurance (List<String> list) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : list) {
            map.put(word, countOccurance(list, word));
        }
        return map;
    }
}
