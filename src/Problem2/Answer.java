package Problem2;

/**
 * Created by elliot on 15/02/2018.
 */
public class Answer {

    public static void main(String[] args) {

        long n1=0;
        long n2=1;
        long n3;
        long agg=0;

        while(true)
        {
            n3=n1+n2;

            if(n3 > 4000000) break;

            if(n3 % 2 == 0) agg += n3;

            n1=n2;
            n2=n3;
        }
        System.out.println(agg);
    }
}
