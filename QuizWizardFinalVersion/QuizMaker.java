import java.util.HashMap;
import java.util.Iterator;
/**
 * This Class will make the quiz with an internal owner tag.
 *
 * @author Daniele Del Piano
 * @version 1.7
 */
public class QuizMaker
{
    // instance variables - replace the example below with your own
    private InputReader reader;
    private Question question;
    private Quiz quiz;
    private final String owner;
    private boolean quit;
    /**
     * Constructor for objects of class QuizMaker
     */
    public QuizMaker(String owner)
    {
        // initialise instance variables
        reader = new InputReader();
        question = new Question();
        quiz = new Quiz();
        this.owner = owner;
        quit = true;
    }

    public void start(){
        welcomeMenu();
        while(quit){
            System.out.println("Menu selection");
            System.out.println("Press 1. to add a question");
            System.out.println("Press 2. to replace a question");
            System.out.println("Press 3. to remove a question");
            System.out.println("Press 4. to print the quiz");
            System.out.println("Press 5. to quit");
            int ch = reader.getNumber("Enter you choice :");
            if(ch == 1){
                addQuestionPrompt();
            }else if(ch == 2){
                replQuestion();
            }else if(ch == 3){
                removeQuestion();
            }else if(ch == 4){
                quiz.printQuiz();
            }else if(ch == 5){
                quit = false;
                System.out.println("Thanks goodbye....");
            }else{
               System.out.println("No matching choice, please try again.."); 
            }
        }
    }

    /**
     * Method to prompt a question with answers.
     */
    private void addQuestionPrompt(){
        String code = reader.getText("Please enter the unique code :");
        String quest = reader.getText("Please enter the question :");
        int numAnsw = reader.getNumber("Please enter the number of answers :");
        Question question1 = new Question();
        question1.setQuestion(quest);
        question1.setNumAnswers(numAnsw);
        quiz.addQuestions(code,question1);
        int one = 1;
        for(int i = 0; i < numAnsw;i++){    
            String answ = reader.getText("Now enter the answer number " + one + ") ");
            question1.addAnswers(answ);
            one++;
        }
        System.out.println("Question added!");
    }

    /**
     * Get the quiz tag intern use only
     */
    public String getOwner(){
        return owner;
    }

    /**
     * Welcome menu
     */
    private void welcomeMenu(){
        System.out.println("Welcome to the QuizWizard");
        String ref = reader.getText("Please enter the reference module : ");
        quiz.setReference(ref);
    }

    /**
     * replace a question
     */
    private void replQuestion(){
        String c = reader.getText("To replace a question please provide the unique code :");
        String q = reader.getText("Please enter the new question :");
        int numAnsw = reader.getNumber("Please enter the number of answers :");
        Question question1 = new Question();
        question1.setQuestion(q);
        question1.setNumAnswers(numAnsw);
        quiz.replaceQuestion(c,question1);
        int one = 1;
        for(int i = 0; i < numAnsw;i++){    
            String answ = reader.getText("Now enter the answer number " + one + ") ");
            question1.addAnswers(answ);
            one++;
        }
        System.out.println("Question replaced!");
    }
    /**
     * A method to remove a question by providing the unique code.
     */
    private void removeQuestion(){
        String r = reader.getText("To remove a question please provide the unique code :");
        quiz.removeQuestion(r);
        System.out.println("Question remove!");
    }
}
