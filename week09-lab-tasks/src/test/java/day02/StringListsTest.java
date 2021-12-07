package day02;

import day02.StringLists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void shortestWords() {
        StringLists stringLists = new StringLists();
        List<String> input = List.of("aaa", "aa", "bb", "cccc", "dd");
        List<String> expected = List.of("aa", "bb", "dd");
        assertEquals(expected, stringLists.shortestWords(input));
    }
}