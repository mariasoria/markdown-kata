package mariasoria;

import com.mariasoria.Markdown;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarkdownTest {

    @Test
    @DisplayName("Transform links into foot notes")
    void transformShould() {

        String text = "[this book](https://codigosostenible.com) and some other text\n" +
                "and some other text line.";
        String result = "this book [^anchor1] and some other text\n" +
                "and some other text line.\n" +
                "\n" +
                "[^anchor1]: https://codigosostenible.com";

        assertEquals(result, Markdown.transform(text));
    }
}
