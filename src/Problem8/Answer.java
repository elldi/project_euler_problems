package Problem8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by elliot on 21/02/2018.
 */
public class Answer {

    private static long adjacentProducts(int howmany, int startIndex, Object [] number){

        long total = 1;
        if((startIndex+howmany)/50 > number.length-1) return 0;
        for(int x = startIndex; x < startIndex+(howmany); x++){
            int ind = number[x/50].toString().charAt(x%50)-'0';
            total *= ind;
        }
        return total;
    }

    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\elliot\\IdeaProjects\\Project Euler Problems\\src\\Problem8\\1000-digit.txt");
        Object [] integers = new Object[0];

        try (Stream<String> lines = Files.lines(path)) {
            integers = lines.toArray();
        } catch (IOException ex) {
            System.out.println("File not found!");
        }

        long largest = 0;
        for(int x = 0; x < 1000; x++){
            long starting = adjacentProducts(13,x,integers);
            if(starting > largest) largest = starting;

        }
        System.out.println(largest);

    }
}
