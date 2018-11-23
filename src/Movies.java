import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Movies {
    // Declare instance
    private String mMovieTitle;
    private String mTitleHidden;
    private String fileName = "movies_title_file.txt";
    private ArrayList<String> titleList = new ArrayList<String>();

    // Default Constructor
    Movies() {
//        this.loadData();
    }

    // Helper method, transform data from file to array
    private ArrayList<String> loadData() throws Exception{
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        // Add to array list
        while(scanner.hasNextLine()){
            String title = scanner.nextLine();
            titleList.add(title);
        }
        return titleList;
    }

    // Method to pick random title from array list
    // Generate random number, and pick one title from list based on index showed on random number
    public String pickRandomTitle(ArrayList<String> titleListInput){
        int randomNumber = (int) (Math.random()*(24+1));
        mMovieTitle = titleListInput.get(randomNumber);

        return mMovieTitle;
    }

    // Transform title into list of underscore
    public char[] titleHide (String titleInput) {
//        String[] tempArray =new String[inputLength];

        // convert string to array of characters
        char[] titleChars = titleInput.toCharArray();
        int inputLength = titleChars.length;

        // checking trough characters array, check if it's letter or not
        for (int i=0; i<inputLength; i++){
            if(Character.isLetter(titleChars[i])){
                titleChars[i] = '_';
            }
        }

//        for (int i=0; i<inputLength; i++) {
//
//
//            // char c = titleInput.charAt(i); //ambil karakter
//            // if(Character.isLetter(c)) {} // check tiap karakter
//            // jika ini huruf, ubah ke underscore symbol
//            // jika bukan huruf, tetap, jangan diubah
//
//        }
        return titleChars;
    }

    public static void main(String [] args){
        Movies myMovies = new Movies();

        try{
            myMovies.loadData();
            myMovies.pickRandomTitle(myMovies.titleList);
            System.out.print(myMovies.titleList);
            System.out.print("\n" + myMovies.mMovieTitle + "\n" + myMovies.mMovieTitle.length());
        } catch (Exception e) {
            System.out.print("Data Not Found");
            e.printStackTrace();
        }

        String str = "journal Dev";
        char[] chars = str.toCharArray();
        System.out.print("\nstring length: " + str.length());
        System.out.print("char length: " + chars.length);

        for(int i=0; i<chars.length; i++){
            if(Character.isLetter(chars[i])){
                chars[i] = '_';
            }
        }
        System.out.print(chars);
//        for (char c: chars) {
//            System.out.print(c + "\n");
//        }

    }
}
