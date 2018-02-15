package Problem1;

/**
 * Created by elliot on 15/02/2018.
 */
public class Answer {


    public static void main(String[] args) {
        int agg = 0;
        for(int x = 1; x < 1000; x++) {
            if((x % 3) == 0  || (x % 5) == 0) {
                agg += x;
            }

        }
        System.out.println(agg);
    }
}
