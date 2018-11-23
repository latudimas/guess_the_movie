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
    public String titleToUnderscore (String titleInput) {

        return null;
    }

    public static void main(String [] args){
        Movies myMovies = new Movies();

        try{
            myMovies.loadData();
            myMovies.pickRandomTitle(myMovies.titleList);
            System.out.print(myMovies.titleList);
            System.out.print("\n" + myMovies.mMovieTitle);
        } catch (Exception e) {
            System.out.print("Data Not Found");
            e.printStackTrace();
        }

    }
}
