package org.example;

//"test" should return "es"
//
//"testing" should return "t"
//
//
//Kata.getMiddle("A") should return "A"
//

public class FindingMiddleLettersInString {
    public String getMiddle(String word) {
        //Code goes here!
        String output;
        int sizeOfTheWord = word.length();
        boolean checkingWordSizeIsEvenOrOdd = sizeOfTheWord % 2 == 0 ? true : false;
        if(!checkingWordSizeIsEvenOrOdd){
            output = word.substring(sizeOfTheWord/2,sizeOfTheWord/2+1);
        }else{
            output = word.substring(sizeOfTheWord/2-1,sizeOfTheWord/2+1);
        }
        return output;
    }
}
