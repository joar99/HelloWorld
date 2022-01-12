


import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
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



        //PASSING USER INPUT TO A NEW METHOD THAT PRINTS IT


        //Scanner myScan = new Scanner(System.in);
        //System.out.println("Enter Something");
        //String myString = myScan.nextLine();

        //tim();




        //FUNCTIONS FROM OTHER CLASSES



        Game GearsOfWar = new Game("Gears of War", 2006);
        GearsOfWar.speak();


        //INHERITANCE, MOVIE BORROWS FROM GAME, GAME IS SUPERCLASS

        Movie Inglorious = new Movie("Inglorious Bastards", 2001);
        Inglorious.speak();









    }

    //public static void tim() {
      //  System.out.println(myString);
    //}

}
