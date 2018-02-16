package Problem3;

/**
 * Created by elliot on 16/02/2018.
 */
public class Answer2{
    /*
    Any integer greater than 1 is either a prime number, or can be written
    as a unique product of prime numbers (ignoring the order).
    */

    public static void main(String[] args) {
        long value = 600851475143L;
        long number = value;
        long largestFactor = 0;

        int counter = 2;

        while(counter * counter <= number){
            if( number % counter == 0){

                number = number / counter;
                largestFactor = counter;
            } else
                counter++;
        }

        if (number > largestFactor) { // the remainder is a prime number
            largestFactor = number;
        }

        System.out.println(largestFactor);

    }
}
