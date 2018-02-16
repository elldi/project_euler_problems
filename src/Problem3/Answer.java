package Problem3;

/**
 * Created by elliot on 15/02/2018.
 */
public class Answer {

    static boolean isFactor(long number, long potenFactor){
        return number % potenFactor == 0;

    }

    static boolean isPrime(long n) {
        for(int i=2; i<n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        long value = 600851475143L;
        long largest = 0;

        for(long x = 1; x < value; x++ ){
            if(isFactor(value,x))
                if(isPrime(x))
                    if(x > largest) largest = x;
        }

        System.out.println(largest);

    }
}
