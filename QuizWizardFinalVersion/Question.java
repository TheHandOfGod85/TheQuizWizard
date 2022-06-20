import java.util.ArrayList;
import java.util.Arrays;



/**
 * Write a description of class Question here.
 *
 * @author Daniele Del Piano
 * @version 1.7
 */
public class Question
{
    // instance variables - replace the example below with your own
    private String question;
    private ArrayList<String> answers;
    private int numAnswers;
    /**
     * Constructor for objects of class Question
     * A contructor will create a question and a specified number of answers.
     */
    public Question(){
        answers = new ArrayList<String>();
        numAnswers = 0;
        question = "";
    }

    /**
     * A method to add the question.
     */
    public void setQuestion(String question){
        this.question = question;
    }

    /**
     * A getter for the question.
     */
    public String getQuestion(){
        return question;
    }

    /**
     * A method to specify the number of answers
     */
    public void setNumAnswers(int num){
        this.numAnswers = num;
    }

    /**
     * A getter for the number of answers requested.
     */
    public int getNumAnswers(){
        return numAnswers;
    }

    /**
     * A method to add answers.
     */
    public void addAnswers(String answer) {
        if(answers.size() < numAnswers){
            answers.add(answer);
        }else{
            System.out.println("Too many answers!!");
            answers.clear();
        }
    }

    /**
     * A method to print the question.
     */
    public void printQuestion(){
        System.out.println(question);
    }

    /**
     * A method to print the answers labelled with letters.
     */
    public void printAnswers(){
        char ch = 'a';
        for(String x : answers){   
            System.out.println(ch+") " + x);
            ch++;
        }
    }
}