public class WordWrapper {
    public String wrap(String text) {
        String wrappedText = new String();
        for(int i = 0; i < text.length(); i++) {
            wrappedText += text.substring(i, i+1) + "\n";
        }

        return wrappedText.substring(0, wrappedText.length() - 1);
    }
}
