package Problem5;

/**
 * Created by elliot on 16/02/2018.
 */
public class Answer {

    public static boolean fromTo(int start, int end, int value){
        int counter = 0;
        for(int x = start ; x < end; x++)
            if(value % x == 0)counter++;
        return counter == (end-start);
    }

    public static void main(String[] args) {

        int counter = 1;
        boolean found = false;

        while(true){
            if(fromTo(1,20,counter)) {
                if(!found) {
                    System.out.println(counter);
                    found = true;
                }
                else break;
            }
            counter++;
        }

    }
}
