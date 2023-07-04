package org.example;

public class RowSumOddNumbers {

    public int rowSumOddNumbers(int n) {

        int startNumber = n + (int)Math.pow((n-1),2);
        int endNumber = (n-1) + (int)Math.pow(n,2);
        int sum = 0;

        for(int i = startNumber ; i <= endNumber ; i++){
            if(i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
