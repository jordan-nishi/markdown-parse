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



    @Test
    public void testSnippetOne() {
        String fileName = "snippet1.md";
        List<String> expected = List.of("`google.com");
        
        try {
            assertEquals(expected, MarkdownParse.getLinks(Files.readString(Path.of(fileName))));
            } catch (IOException e) {
                e.printStackTrace();
        }
    }
    @Test
    public void testSnippetOneJose() {
        String fileName = "snippet1.md";
        List<String> expected = List.of("`google.com");
        
        try {
            assertEquals(expected, MarkdownParseLab.getLinks(Files.readString(Path.of(fileName))));
            } catch (IOException e) {
                e.printStackTrace();

        }
    }

    @Test
    public void testSnippetTwo() {
        String fileName = "snippet2.md";
        List<String> expected = List.of("a.com, a.com(()), example.com");
        
        try {
            assertEquals(expected, MarkdownParse.getLinks(Files.readString(Path.of(fileName))));
            } catch (IOException e) {
                e.printStackTrace();
        }
    }
    @Test
    public void testSnippetTwoJose() {
        String fileName = "snippet2.md";
        List<String> expected = List.of("a.com, a.com(()), example.com");
        
        try {
            assertEquals(expected, MarkdownParseLab.getLinks(Files.readString(Path.of(fileName))));
            } catch (IOException e) {
                e.printStackTrace();
        }
    }

    @Test
    public void testSnippetThree() {
        String fileName = "snippet3.md";
        List<String> expected = 
        List.of("https://ucsd-cse15l-w22.github.io/");
        
        try {
            assertEquals(expected, MarkdownParse.getLinks(Files.readString(Path.of(fileName))));
            } catch (IOException e) {
                e.printStackTrace();
        }
    }
    @Test
    public void testSnippetThreeJose() {
        String fileName = "snippet3.md";
        List<String> expected = 
        List.of("https://ucsd-cse15l-w22.github.io/");
        
        try {
            assertEquals(expected, MarkdownParseLab.getLinks(Files.readString(Path.of(fileName))));
            } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
