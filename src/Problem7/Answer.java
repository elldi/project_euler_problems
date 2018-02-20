package Problem7;

/**
 * Created by elliot on 16/02/2018.
 */
public class Answer {

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

        int counter = 0;
        long value = 0;

        while(counter < 10001) {
            value++;
            if (isPrime(value)){
                counter++;
            }
        }

        System.out.println(value);

    }
}
