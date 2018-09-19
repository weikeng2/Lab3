import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebScraper {
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    /**
     * Finds the number of words in a txt file
     * @param url some url of a text file or something
     */
    public static int countWords(final String url) {
        String file = urlToString(url);
        String[] words= file.trim().split("\\s");
        return words.length;
    }

    /**
     *
     */
    public static int searchCount(final String url, final String compare) {
        String file = urlToString(url);
        int count = 0;
        String[] words = file.split("\\s");
        for (String word: words) {
            if (word.replaceAll(",", "").toLowerCase().equals(compare.toLowerCase())) {
                count++;
            }
        }
        return count;
    }
}