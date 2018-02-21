package Problem9;

/**
 * Created by elliot on 21/02/2018.
 */
public class Answer {

    public static void main(String[] args) {

        int sum = 1000;
        boolean found = false;
        int a, b, c;
        a = b = c = 0;

        for(a = 1; a < (sum/2); a++){
            for(b = 1; b < (sum/3); b++){
                c = sum - a - b;
                if((a*a) + (b*b) == (c*c)){
                    found = true;
                    break;
                }

            }
            if(found) break;
        }
        System.out.println(a*b*c);
    }
}
