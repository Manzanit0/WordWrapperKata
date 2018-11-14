public class WordWrapper {
    public String wrap(String text, int columnSize) {
        String wrappedText = new String();

        for(int i = 0; i < text.length(); i += columnSize) {
            wrappedText += text.substring(i, i+columnSize > text.length() ? text.length() : i+columnSize) + "\n";
        }

        return wrappedText.substring(0, wrappedText.length() - 1);
    }
}
