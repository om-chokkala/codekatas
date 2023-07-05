package org.example;

import java.util.*;

//Task
//You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
//
//Examples
//[7, 1]  =>  [1, 7]
//[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
//[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
public class SortOddNumbers {
//My solution
public int[] sortArray(int[] array) {
    List<Integer> oddNumbersInArray = new ArrayList<Integer>();
    for(int i : array){
        if(isOdd(i)){
            oddNumbersInArray.add(i);
        }
    }
    Collections.sort(oddNumbersInArray);
    for(int j= 0 ; j < array.length ; j++){
        if(isOdd(array[j])){
            for( int k=0 ;k < oddNumbersInArray.size(); k++){
                array[j]= oddNumbersInArray.get(k);
                oddNumbersInArray.remove(k);
                break;
            }
        }
    }
    return array;
}
    public boolean isOdd(int element){
        return ( element % 2 != 0) ? true : false;
    }























    // Cleaver and best practice solutions
/*(1)    public class Kata {

        public static int[] sortArray(final int[] array) {

            // Sort the odd numbers only
            final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

            // Then merge them back into original array
            for (int j = 0, s = 0; j < array.length; j++) {
                if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
            }

            return array;
        }

    }

    2)
    chalup, ascw, 八月金龙鱼, prasant2, Twumasi, SashkaLove
import java.util.PrimitiveIterator.OfInt;
import java.util.stream.IntStream;

public class Kata {
  public static int[] sortArray(int[] array) {
    OfInt sortedOdds = IntStream
        .of(array)
        .filter(i -> i % 2 == 1)
        .sorted()
        .iterator();

    return IntStream
        .of(array)
        .map(i -> i % 2 == 0 ? i : sortedOdds.nextInt())
        .toArray();
      }
}
3)
public class Kata {
  public static int[] sortArray(int[] array) {
     for(int i=0 ; i<array.length-1 ; i++){
            for(int j=i+1; j<array.length ; j++){
                if(array[i]>array[j] && array[i]%2 == 1 && array[j]%2 == 1){
                    int aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }
        }
     return array;
  }
}*/
}
