

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class QuestionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class QuestionTest
{
    /**
     * Default constructor for test class QuestionTest
     */
    public QuestionTest()
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
        Question question1 = new Question();
        question1.setQuestion("What color are the bananas?");
        assertEquals("What color are the bananas?", question1.getQuestion());
        question1.setNumAnswers(3);
        assertEquals(3, question1.getNumAnswers());
        question1.addAnswers("Red");
        question1.addAnswers("Yellow");
        question1.addAnswers("Green");
        question1.printQuestion();
        question1.printAnswers();
    }
}

