import org.junit.Assert;
import org.junit.Test;

public class WordWrapperTest {
    @Test
    public void wrapsTwoLettersWithColumnSizeOne() {
        Assert.assertEquals("H\ni", wrapText("Hi", 1));
    }

    @Test
    public void wrapsThreeLettersWithColumnSizeOne() {
        Assert.assertEquals("T\nw\no", wrapText("Two", 1));
    }

    @Test
    public void wrapsFourLettersWithColumnSizeOfTwo() {
        Assert.assertEquals("Fo\nur", wrapText("Four", 2));
    }

    private String wrapText(String text, int columnSize) {
        WordWrapper wrapper = new WordWrapper();
        return wrapper.wrap(text, columnSize);
    }
}
