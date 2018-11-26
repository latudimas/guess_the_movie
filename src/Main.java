import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        String fileName = "movies_title_file.txt";
//        MoviesList moviesList = new MoviesList(fileName);

//        char[] originTitle = moviesList.getMovieTitle();
//        char[] maskedTitle = moviesList.maskingMovietitle(originTitle);
//        System.out.println(originTitle);
//        System.out.println(maskedTitle);

        Game testGame = new Game(fileName);

        char[] original = testGame.getOriginalTitle();
        System.out.println(original);
        char[] masked = testGame.getMaskedTitle();
        System.out.println(masked );

        char inputChar;
        char[] testChar = new char[original.length];
//        char[] testChar = testGame.compare(inputChar);
//        System.out.println(testChar);
//
//        boolean result =  testGame.isCompleted();
//        System.out.print(result);
        int i = 0;
        while (!testGame.gameEnded()){
//            inputChar = testGame.scanInput();
//            testGame.getPointLost();
            testChar = testGame.compare();
            System.out.println(testChar);
            System.out.println("loop-"+i);
            i++;
        }

//        String str = "the good the bad and the ugly";
//        boolean isContains = str.contains('t');
//        System.out.println(isContains);


    }
}