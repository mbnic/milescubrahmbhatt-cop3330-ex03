package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_isCorrect() {
        App myApp = new App();

        String name = "Dog";
        String quote = "woof bark";

        String expectedOutput = "Dog says, \"woof bark\"";

        assertEquals(expectedOutput, name + " says, " + "\"" + quote + "\"");
    }
}