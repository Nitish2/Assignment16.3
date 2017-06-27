package WordCount;
/** to find number of characters,number of words and number of lines in a text file?
 * Create BufferedReader object to read the text file.
 * Read all the lines of the text file one by one.
 *  Get the number of words in a line by splitting 
 * Update charCount  through words of array.
 * 
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Count {
	public static void main(String[] args) {
		BufferedReader reader = null;

		int charCount = 0;

		int wordCount = 0;

		int lineCount = 0;

		try {

			reader = new BufferedReader(new FileReader("E:/count.txt")); // Buffer Reader object


			String currentLine = reader.readLine(); // Read line

			while (currentLine != null) {

				lineCount++;

				String[] words = currentLine.split(" "); //Splitting the line

				wordCount = wordCount + words.length;  //Updated Word Count

				for (String word : words) { //Words Array

					charCount = charCount + word.length();
				}

				currentLine = reader.readLine();
			}

			System.out.println("Number Of characters: " +charCount); //Prints number of chars

			System.out.println("Number Of words: " +wordCount); //Prints number of words

			System.out.println("Number Of lines : " +lineCount); //Prints number of lines
		} catch (IOException e) {
			System.err.println("ERROR !! ");
		} finally {
			try {
				reader.close();   //Closing buffer reader object
			} catch (IOException e) {
				System.err.println("ERROR !! ");
			}
		}
	}
}