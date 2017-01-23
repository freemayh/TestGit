import java.util.*;
 
public class WordFreq {
       public static void main(String[] args) {
             Map<String, Integer> m = new HashMap<String, Integer>();
 
             String[] sample = { "to", "be", "or", "not", "to", "be", "is", "a",
                           "problem" };
             // 문자열에 포함된 단어의 빈도를 계산한다.
             for (String k : sample) {
                    Integer freq = m.get(k); //null if this map contains no mapping for the key. 
                    m.put(k, (freq == null) ? 1 : freq + 1);
             }

 
             System.out.println(m.size() + " 단어가 있습니다.");
             System.out.println(m.containsKey("to"));
             System.out.println(m.isEmpty());
             System.out.println(m);
       }
}