package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        char vowels[] = new char[5];
//
//        vowels[0] = 'a';
//        vowels[1] = 'e';
//        vowels[2] = 'i';
//        vowels[3] = 'o';
//        vowels[4] = 'u';
////        vowels[5] = 'z'; this will throw error

//        char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        char vowels[] = {'e', 'u', 'a', 'o', 'i'};

        int startIndex = 1;
        int endingIndex = 4;

//        Arrays.sort(vowels, startIndex, endingIndex);
        Arrays.sort(vowels);

        char key = '0';
//        char key = 's'; // if the key is not present will return -ve value.

        int foundItemIndex = Arrays.binarySearch(vowels, key);

        System.out.printf("foundItemIndex is %d \n", foundItemIndex);

//        char copyOfVowels[] = vowels; // Here both "vowels" and "copyOfVowels" will reference to same location in storage.
        char copyOfVowels[] = Arrays.copyOf(vowels, vowels.length); // Here "copyOfVowels" will be copied and will be stored in a new storage location.

        Arrays.fill(copyOfVowels, 'x'); // Fill the whole array with same value.

        System.out.println(vowels[2]);
        System.out.println(Arrays.toString(vowels));
        System.out.println(vowels.length);
        System.out.println(Arrays.toString(copyOfVowels));


    }
}