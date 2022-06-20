

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class QuizMakerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class QuizMakerTest
{
    /**
     * Default constructor for test class QuizMakerTest
     */
    public QuizMakerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testClass()
    {
        QuizMaker quizMake1 = new QuizMaker("Daniele Del Piano");
        assertEquals("Daniele Del Piano", quizMake1.getOwner());
    }
}

