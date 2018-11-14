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

    @Test
    public void wrapsSevenLettersWithAColumnSizeOfThree() {
        Assert.assertEquals("123\n456\n7", wrapText("1234567", 3));
    }

    @Test
    public void wrapsEightLettersWithAColumnSizeOfThree() {
        Assert.assertEquals("123\n456\n78", wrapText("12345678", 3));
    }

    private String wrapText(String text, int columnSize) {
        WordWrapper wrapper = new WordWrapper();
        return wrapper.wrap(text, columnSize);
    }
}
