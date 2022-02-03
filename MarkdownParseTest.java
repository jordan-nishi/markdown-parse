import static org.junit.Assert.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.*;
import java.io.FilenameFilter;
import java.io.IOException;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() {
        String fileName = "test-file.md";
        List<String> expected = List.of("https://something.com", "some-page.html");
        
        try {
        assertEquals(expected, MarkdownParse.getLinks(Files.readString(Path.of(fileName))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLinks2() {
        String fileName = "test-lab.md";
        List<String> expected = List.of("https://newlink.com");
        
        try {
        assertEquals(expected, MarkdownParse.getLinks(Files.readString(Path.of(fileName))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLinks3() {
        String fileName = "test-lab-2.md";
        List<String> expected = List.of();
        
        try {
        assertEquals(expected, MarkdownParse.getLinks(Files.readString(Path.of(fileName))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLinks4() {
        String fileName = "test-lab-3.md";
        List<String> expected = List.of("test.png");
        
        try {
        assertEquals(expected, MarkdownParse.getLinks(Files.readString(Path.of(fileName))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
