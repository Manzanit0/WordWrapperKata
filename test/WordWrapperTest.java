import org.junit.Assert;
import org.junit.Test;

public class WordWrapperTest {

    @Test
    public void givenTwoLetters_whenColumnSizeIsOne_BreakOnce() {
        WordWrapper wrapper = new WordWrapper();
        String text = wrapper.wrap("Hi");
        Assert.assertEquals(text, "H\ni");
    }
}
