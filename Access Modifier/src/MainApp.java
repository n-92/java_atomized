import packageOne.classOne;
import packageOne.classTwo;
import packageOne.classThree;
import packageTwo.classFour;
import packageTwo.classFive;

/**
 * Created by Aung Naing Oo on 9/26/2015.
 */
public class MainApp {
        public static void main(String[] args) {
            System.out.println("Hello World!"); // Display the string.
            classOne one = new classOne();
            classTwo two = new classTwo();
            classThree three = new classThree();
            classFour four = new classFour();
            classFive five = new classFive();

            System.out.println(one.getiV1()); // Display the string.
            System.out.println(one.getiV2()); // Display the string.
            System.out.println(one.getiV3()); // Display the string.
            System.out.println(one.getiV4()); // Display the string.
/*
            System.out.println(two.getiV1()); // Display the string.
            System.out.println(two.getiV2()); // Display the string.
            System.out.println(two.getiV3()); // Display the string.
            System.out.println(two.getiV4()); // Display the string.*/

            System.out.println(three.getiV1()); // Display the string.
            System.out.println(three.getiV2()); // Display the string.
            System.out.println(three.getiV3()); // Display the string.
            System.out.println(three.getiV4()); // Display the string.

            System.out.println(four.getiV1()); // Display the string.
            System.out.println(four.getiV2()); // Display the string.
            System.out.println(four.getiV3()); // Display the string.
            System.out.println(four.getiV4()); // Display the string.
/*

            System.out.println(five.getiV1()); // Display the string.
            System.out.println(five.getiV2()); // Display the string.
            System.out.println(five.getiV3()); // Display the string.
            System.out.println(five.getiV4()); // Display the string.
*/


        }


}
