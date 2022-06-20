

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class QuizTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class QuizTest
{
    /**
     * Default constructor for test class QuizTest
     */
    public QuizTest()
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
    public void testClass(){
        Question question1 = new Question();
        question1.setQuestion("What color is the shirt?");
        Question question2 = new Question();
        question2.setQuestion("What color are the socks?");
        question1.setNumAnswers(3);
        question2.setNumAnswers(3);
        assertEquals("What color is the shirt?", question1.getQuestion());
        question1.addAnswers("Blue");
        question1.addAnswers("Yellow");
        question1.addAnswers("Violet");
        question2.addAnswers("Blue");
        question2.addAnswers("Green");
        question2.addAnswers("Brown");
        Quiz quiz1 = new Quiz();
        quiz1.setReference("The cloths quest");
        assertEquals("The cloths quest", quiz1.getReference());
    }
}
