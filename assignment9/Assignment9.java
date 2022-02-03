package assignment.assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment9 {

    public boolean isMatching(String sentence){

        Pattern pattern = Pattern.compile("^H[A-Za-z,;'\"\\s]*+[.]$");  //pattern for sentence starting with capital and ending with period

        //checking if the given sentence matches with the pattern
        return pattern.matcher(sentence).matches();

    }

    public static void main(String[] args) {
        Assignment9 patternMatcher = new Assignment9();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Given Sentence is: "+sentence);
        if(patternMatcher.isMatching(sentence)){
            System.out.println("The given Sentence Follows the pattern");
        }
        else{
            System.out.println("The Given Sentence Doesn't Follow the pattern");
        }
    }
}

/*Input and Output
    Enter a Sentence:
    Hello How Do You DO.
    Given Sentence is: Hello How Do You DO.
    The given Sentence Follows the pattern

    Enter a Sentence:
    hey there
    Given Sentence is: hey there
    The Given Sentence Doesn't Follow the pattern


 */