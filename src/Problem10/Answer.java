package Problem10;

/**
 * Created by elliot on 21/02/2018.
 */
public class Answer {

    /*
    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

    Find the sum of all the primes below two million.

    Brute force solution, took an awful long time.
    */

    private static boolean isPrime(long n) {
        if(n == 0 || n == 1) return false;
        if(n == 2) return true;
        for(int i = 2; i < n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        long total = 2;
        int counter = 0;
        for(int x = 3; x < 2000000; x+=2){

            if(isPrime(x)) total += x;
            if(counter++%100000 == 0) System.out.println(x);
        }
        System.out.println(total);

    }
}
