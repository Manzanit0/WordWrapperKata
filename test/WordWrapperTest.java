import org.junit.Assert;
import org.junit.Test;

public class WordWrapperTest {
    @Test
    public void wrapsTwoLettersWithColumnSizeOne() {
        WordWrapper wrapper = new WordWrapper();
        String text = wrapper.wrap("Hi");
        Assert.assertEquals(text, "H\ni");
    }

    @Test
    public void wrapsThreeLettersWithColumnSizeOne() {
        WordWrapper wrapper = new WordWrapper();
        String text = wrapper.wrap("Two");
        Assert.assertEquals(text, "T\nw\no");
    }
}
