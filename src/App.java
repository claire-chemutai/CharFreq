import java.util.Scanner;

/**
 * Program in java to count the frequency of each letter in a string
 */
public class App {
    public static void freqCount(String str) {
        // convert the string into a charArray
        char[] charArray = str.toCharArray();

        // same length array to save the count
        int[] freq = new int[charArray.length];

        // This outer loop is used to get a single character in the string
        for (int i = 0; i <= charArray.length - 1; i++) {
            // initialize the count of the first character to 1
            freq[i] = 1;

            // inner loop to compare the character to the rest of the characters in the
            // string
            for (int j = i + 1; j <= charArray.length - 1; j++) {
                if (charArray[i] == charArray[j]) {

                    freq[i]++;

                    // set to 0 to avoid printing visited character
                    charArray[j] = '0';
                }
            }
        }
        for (int k = 0; k <= freq.length - 1; k++) {
            if (charArray[k] != '0' && charArray[k] != ' ') {
                System.out.println(charArray[k] + " = " + freq[k] + " times");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence");

        String str = scan.nextLine();

        App.freqCount(str);

    }
}
