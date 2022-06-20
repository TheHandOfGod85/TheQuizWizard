import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * A class that has the responsability to create a quiz with question.
 *
 * @author Daniele Del Piano
 * @version 1.7
 */
public class Quiz
{
    // instance variables - replace the example below with your own
    private HashMap<String,Question> questions;
    private Question question;
    private String reference;
    /**
     * Please insert the reference to the module it assesses
     * (e.g., “DC1000: Foundations of Technology Solutions”)
     */
    public Quiz()
    {
        // initialise instance variables
        question = new Question();
        questions = new HashMap<>();
        reference = "";
    }

    public void setReference(String ref){
        reference = ref;
    }

    /**
     * A getter for the Quiz reference
     */
    public String getReference(){
        return reference;
    }

    /**
     * Print the Quiz reference
     */
    public void printReference(){
        System.out.println(reference);
    }

    /**
     * Add a question to the quiz
     */
    public void addQuestions(String code ,Question quest){
        questions.put(code,quest);
    }
    
    /**
     * A method to replace a question based on the unique code.
     */
    public void replaceQuestion(String code,Question quest){
        questions.replace(code,quest);
    }
    /**
     * A method to remove a question based on the unique code.
     */
    public void removeQuestion(String code){
        questions.remove(code);
    }
    
    /**
     * A method to print questions added to the quiz and the answers.
     */
    public void printQuiz(){
        System.out.println("Here is your printed quiz");
        System.out.println();
        System.out.println("Reference module : " + reference);
        Iterator<Question> print = questions.values().iterator();
        while(print.hasNext()){
            Question quest = print.next();
            quest.printQuestion();
            quest.printAnswers();
        }
    }
    
}
