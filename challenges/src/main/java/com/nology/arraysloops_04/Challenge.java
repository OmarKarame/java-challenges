package com.nology.arraysloops_04;

/**
 *   All challenges in this repository are separated into three levels: Foundation, Intermediate, and Advanced.
 *   The expectation is to complete all Foundation level challenges, with Intermediate and upwards pushing your knowledge
 *   and may require you to google things in order to solve them. If you find an answer online somewhere, be kind and
 *   share it with the group!
 */
public class Challenge {

    public Challenge() {}

    // -------------- FOUNDATION --------------

    /***
     * Get the first and last items in an given string array.
     *
     * If a the given array's length is 0 return an empty string array.
     *
     * @param namesArr e.g. ["Ollie", "Sam", "Bex"]
     * @return a new array containing the first and last items in the given array e.g. ["Ollie", "Bex"]
     */
    public String[] getFirstAndLast(String[] namesArr) {
        if (namesArr.length == 0){
            String[] emptyArr = {""};
            return emptyArr;
        }
        String[] newArr = {namesArr[0], namesArr[namesArr.length]};
        return newArr;
    }

    /***
     * Find the SUM/Total of an array of peoples ages.
     *
     * @param agesArr e.g. [18, 25, 21, 40]
     * @return an amount e.g. 104
     */
    public int totalAges(int[] agesArr) {
        int total = 0;
        for (int age: agesArr) {
            total += age;
        }
        return total;
    }

    /***
     * Find the amount of odd numbers from a given array of numbers.
     *
     * @param numbersArr e.g. [5, 3, 8, 10, 1]
     * @return Amount of odd numbers e.g. 3
     */
    public int getAmountOfOddNumbers(int[] numbersArr) {
        int count = 0;
        for (int number: numbersArr) {
            if (number % 2 != 0){
                count++;
            }
        }
        return count;
    }

    // -------------- INTERMEDIATE --------------

    /***
     * Find all numbers between a min and a max value and return them in an array.
     * The min at the start and the max at the end of the returned array.
     *
     * If the min is greater than the max return a empty integer array.
     *
     * @param min - The starting range value e.g. 3
     * @param max - The ending/finishing range value e.g. 6
     * @return a new array of all numbers between and including the min and max number. e.g. [3, 4, 5, 6]
     */
    public int[] getRange(int min, int max) {
        int updateNum = min;
        int arrLength = max+1 - min;
        if (max > min){
            int[] numArr = new int[arrLength];
            numArr[0] = min;
            for (int i = 1; i < arrLength; i++) {
                    updateNum++;
                    numArr[i] = updateNum;
                }
            return numArr;
        }
        return new int[]{};
    }


    /**
     * Swap the first and last names in a string
     * @param fullName e.g. "Andy Evans"
     * @return a string with the last name, followed by the first name e.g. "Evans Andy"
     */
    public String swapNames(String fullName) {
        int index = 0;
        int count = 0;
        String[] fullNameArr = fullName.split("");
//        for (int i = 0; i < fullNameArr.length; i++) {
//
//        }
//        String[] firstName = new String[count];
//        for (String letter1: firstName) {
//            letter1 = fullNameArr[index];
//            index++;
//        }
//        String[] lastName = new String[fullNameArr.length - count - 1];
//        for (String letter2: lastName) {
//            letter2 = fullNameArr[index + 1];
//            index++;
//        }
//
        return "";
    }

    /***
     * Determine whether a given score is the highest score out of a array of scores.
     *
     * Can you use a for-each loop?
     * https://www.w3schools.com/java/java_for_loop.asp
     *
     * @param scoresArr e.g. [3, 10, 2, 8]
     * @param newScore e.g. 11
     * @return true or false depending on whether the newScore is the highest value in the array
     */
    public boolean isHighestScore(int[] scoresArr, int newScore) {
        boolean isHighestNum = true;
        for (int score: scoresArr) {
            if (newScore < score){
                isHighestNum = !isHighestNum;
            }
        }
        return isHighestNum;
    }

    // -------------- ADVANCED --------------

    /***
     * Given an array of numbers, sort these numbers numerically lowest to highest by comparing adjacent numbers.
     *
     * NOTE: Your code should work by repeatedly swapping the adjacent elements if they are in wrong order.
     * Example:
     * First Pass:
     * ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
     * ( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4
     * ( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2
     * ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them
     *
     * HINT: Can you use a nested for loop?
     * https://www.programiz.com/java-programming/nested-loop
     *
     * @param numbersArr - array of numbers e.g. [5, 1, 4, 2, 8]
     * @return The sorted array of numbers e.g. [1, 2, 4, 5, 8]
     */
    public int[] sort(int[] numbersArr) {
        return new int[] {};
    }
}
