
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndexMain {

    public static void main(String[] args) throws IOException {

        String fileName = "textFile.txt";  //insert name of your txt file
        String words = "words.txt";

        Index index = new Index();

        index.buildIndex(fileName);

        //Calling the method which does all the work
        binarySearchTreeMapMethod(index);

    }
    //TO DO: Profile the search method

    public static void binarySearchTreeMapMethod(Index index) {

        index.print();

        try {
            int reps = 1000;
            List<String> textFileList;
            List<String> listOfWords;

            //Adding the data from textFile.txt to an ArrayList 
            try (Scanner input = new Scanner(new File("textFile.txt"))) {
                textFileList = new ArrayList();
                while (input.hasNext()) {
                    textFileList.add(input.next());
                }

            }

            //Adding the data from words.txt to an ArrayList 
            try (Scanner input = new Scanner(new File("words.txt"))) {
                listOfWords = new ArrayList();
                while (input.hasNext()) {
                    listOfWords.add(input.next());

                }

            }

            List value;

            //Start to time the execution
            long start = System.currentTimeMillis();
            for (int i = 0; i < reps; i++) {

                for (int j = 0; j < listOfWords.size(); j++) {

                    value = index.search(listOfWords.get(j));

                }
            }

            long end = System.currentTimeMillis();
            System.out.println("\n\nTime Taken: " + (end - start) + "ms");
            //End timing of execution

            System.out.println("\nAmount of words in the textFile.txt: " + textFileList.size());
            System.out.println("Amount of words in the words.txt: " + listOfWords.size());

        } catch (IOException exc) {
            System.out.println("File does not exist");
            exc.printStackTrace();
            System.exit(1);
        }
    }

}
