public class WordWrapper {
    public String wrap(String text, int columnSize) {
        String wrappedText = new String();

        for(int i = 0; i < text.length(); i += columnSize) {
            wrappedText += text.substring(i, i+columnSize > text.length() ? text.length() : i+columnSize) + "\n";
        }

        return trimLastCharacter(wrappedText);
    }

    private String trimLastCharacter(String text) {
        return text.substring(0, text.length() - 1);
    }
}
