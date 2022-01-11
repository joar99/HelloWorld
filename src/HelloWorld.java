import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");





        //ITERATING AND COUNTING THROUGH STRING USING MAP


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





        //SORTING THROUGH AN ARRAY


        int[] numArray = {99,15,17,22,35,8,4,2,1,6,7,213,124};

        Arrays.sort(numArray);

        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }


    }
}
