import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        Map myMap = new HashMap();


        String str = "hello my name is jared";

        for (char x:str.toCharArray()) {
            if (myMap.containsKey(x)) {
                int old = (int) myMap.get(x);
                myMap.put(x, old+1);

            }
            else {
                myMap.put(x, 1);
            }
        }

        System.out.println(myMap);


    }
}
