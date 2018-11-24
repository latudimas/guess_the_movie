import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Movies {
    // Declare instance
    private char[] originalMovieTitle;
    private char[] maskedMovieTitle;
    private String fileName = "movies_title_file.txt";
//    private ArrayList<String> titleList = new ArrayList<String>();

    // Default Constructor
    Movies() {
//        this.originalMovieTitle = null;
//        this.maskedMovieTitle = null;
    }

    /**
     * This is helper method used to load data in txt format and transform it into array list
     * Then array list passed into pickRandomTitle method as argument.
     *
     * @throws Exception
     */
    private ArrayList<String> loadData(String fileNameInput) throws Exception{
        File file = new File(fileNameInput);
        Scanner scanner = new Scanner(file);

        // Creating array list
        ArrayList<String> titleList = new ArrayList<String>();

        // Add to array list
        while(scanner.hasNextLine()) {
            String titleInLine = scanner.nextLine();
            titleList.add(titleInLine);
        }
        return titleList;
    }

    /**
     * Pick one movie title from list randomly
     * after that, title which is in String data type transformed into array of char.
     *
     * @param titleListInput Array list contain movies title
     * @return orignialMovieTitle array of char from one movie title that pick randomly
     */
    public char[] pickRandomTitle(ArrayList<String> titleListInput){
        int randomNumber = (int) (Math.random()*(24+1));
        String temp = titleListInput.get(randomNumber);
        // originalMovieTitle = temp.toCharArray();
        // return originalMovieTitle;
        char[] tempChar = temp.toCharArray();
        return tempChar;
    }

    /**
     * Masked original title char with underscore '_' symbol.
     * Saved it to objek parameter
     *
     * @param titleChar char of original movie title
     * @return maskedMovieTitle saved it into movie title
     */
    public char[] maskingTitle (char[] titleChar) {
        // Get char length for iteration bound
        int inputLength = titleChar.length;

        // Loop through title char
        for (int i=0; i<inputLength; i++){
            // Check if this char is letter or not
            if (Character.isLetter(titleChar[i])){
                titleChar[i] = '_';
            }
        }
        return titleChar;
    }

    public static void main(String [] args){
        Movies myMovies = new Movies();


        ArrayList<String> titleList = new ArrayList<>();
        String fileName = "movies_title_file.txt";
        try{
            titleList = myMovies.loadData(fileName);
        } catch (Exception e) {
            System.out.print("Data Not Found");
            e.printStackTrace();
        }

        char[] origin = myMovies.pickRandomTitle(titleList);
        char[] masked = myMovies.maskingTitle(origin);

        myMovies.originalMovieTitle = origin;
        myMovies.maskedMovieTitle = masked;

//        System.out.print(myMovies.originalMovieTitle);
//        System.out.print("\n" + myMovies.maskedMovieTitle);
        System.out.println(myMovies.pickRandomTitle(titleList) + "\n");
        System.out.print(titleList + "\n");
        System.out.print(origin);
        System.out.print("\n" + masked);

        String hele;
    }
}
