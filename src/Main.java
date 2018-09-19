public class Main {
    public static void main(String[] args) {
        System.out.println(WebScraper.urlToString("http://erdani.com/tdpl/hamlet.txt"));
        System.out.println(WebScraper.countWords("http://erdani.com/tdpl/hamlet.txt"));
        System.out.println(WebScraper.searchCount("http://erdani.com/tdpl/hamlet.txt", "prince"));
    }
}
