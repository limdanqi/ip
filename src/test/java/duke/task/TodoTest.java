package duke.task;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TodoTest {
    @Test
    public void todoStringConversion() {
        Todo todo = new Todo("borrow book");
        String actualOutput = todo.toString();
        String expectedOutput = "[T][ ] borrow book";
        assertEquals(expectedOutput, actualOutput);
    }
}
