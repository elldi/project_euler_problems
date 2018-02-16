package Problem6;

/**
 * Created by elliot on 16/02/2018.
 */
public class Answer {

    public static long sumOfSquares(int whereTo){

        long number = 0;
        int counter = 0;
        while(counter++ != whereTo){
            number += counter * counter;
        }


        return number;
    }

    public static long squareOfSum(int whereTo){
        long number = 0;
        int counter = 0;
        while(counter++ != whereTo){
            number += counter;
        }


        return number * number;
    }

    public static void main(String[] args) {
        System.out.println(sumOfSquares(10));
        System.out.println(squareOfSum(10));

        System.out.println(squareOfSum(100) - sumOfSquares(100));
    }
}
