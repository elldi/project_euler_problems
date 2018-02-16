package Problem4;

/**
 * Created by elliot on 16/02/2018.
 */
public class Answer {

    public static boolean forwardBack(int start){

        String res = Integer.toString(start);
        int counter = 0;

        int j = res.length() - 1;
        for(int i = 0; i < res.length(); i++)
            if(res.charAt(i) == res.charAt(j--)) counter++;



        return counter == res.length();
    }

    public static void main(String[] args) {

        int largest = 0;

        for(int x = 100; x < 999; x++){
            for(int y = 100; y < 999; y++){
                if(forwardBack(x*y)) {
                    if(largest < x*y) largest = x*y;
                    //largest = x * y;
                }
            }
        }
        System.out.println(largest);
    }
}
