package ru.spb.herzen.ivt3;
// I'm Kirill Nikolaev

import org.kohsuke.randname.RandomNameGenerator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("I'm Kirill Nikolaev\n");
        RandomNameGenerator rnd = new RandomNameGenerator(0);
        System.out.println("Exercise 1");
        String[] mas = new String[15];
        for (int i=0; i<15; i++) {
            mas[i] = rnd.next();
            System.out.println("Hello, "+mas[i]);
        }

        System.out.println("\nExercise 2");
        Arrays.sort(mas);
        for (String orderedArrEl: mas) {
            System.out.println(orderedArrEl);
        }

        System.out.println("\nExercise 3");
        for (int i=2; i<5; i++) {
            System.out.println("Hello, "+mas[i] + " " + i);
        }

        System.out.println("\nExercise 4");
        for (int i=0; i<15; i++) {
            mas[i]=mas[i].toUpperCase();
            System.out.println(mas[i]);
        }

        System.out.println("\nExercise 5");
        int[] numArr = new int[30];
        int amount = 0;
        for (int i=0; i<30; i++) {
            numArr[i] = (int) (1 + Math.random()*100);
            System.out.println(numArr[i]);
            if (numArr[i]%2==0) {
                amount +=1;
            }
        }
        System.out.println("Amount of even numbers: " + amount);


        System.out.println("\nExercise 6");
        String my_name = "Kirill";
        char[] ch_name = my_name.toCharArray();
        Arrays.sort(ch_name);
        for (char Char: ch_name) {
            System.out.print(Char + " ");
        }

        
        System.out.println("\n\nExercise 7");
        String vowels = "aieuo";
        char[] vowels_arr = vowels.toCharArray();
        my_name = "Kirill";
        ch_name = my_name.toCharArray();
        amount = 0;
        for (char x: ch_name) {
            for (char y: vowels_arr) {
                if (x == y) {
                    amount ++;
                }
            }
        }
        System.out.print("Amount of vowels in the name: " + amount);
    }
}
