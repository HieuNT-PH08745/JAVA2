package Lab3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author os_cntt_gpdn25
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();
        int i = 0; 
        while (i<3) {
            Student student = new Student();
            student.setName("SV" + (i + 1));
            map.put(student.getName(), student);
            i++;
        }
        
        Set<String> keys = map.keySet();
        
        for (String k : keys) {
            System.out.println(k);
        }
    }
}
