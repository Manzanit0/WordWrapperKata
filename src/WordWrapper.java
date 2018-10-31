public class WordWrapper {
    public String wrap(String text) {
        return text.substring(0, 1) + "\n" + text.substring(1);
    }
}
