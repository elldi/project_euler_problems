package Problem10;

/**
 * Created by elliot on 22/02/2018.
 */
public class Answer2 {


    public static void main(String[] args) {
        boolean [] marker = new boolean[2000000];

        for(int x = 2; x < 2000000; x++){

            int p = x;

            for(int y = x+1; y < 2000000; y++ ){
                int n = y;
                if(n % p == 0) marker[p-1] = true;
            }
            System.out.println(x);
        }
    }
}
