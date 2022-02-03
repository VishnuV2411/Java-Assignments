package assignment.assignment2;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        String inputString;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string as input");
        inputString = sc.nextLine();
        inputString = inputString.toLowerCase();

        boolean[] alphaList = new boolean[26];
        int alphaIndex = 0;
        int flag = 1;
        for(int i = 0; i < inputString.length(); i++){
            if(inputString.charAt(i) >= 'a' && inputString.charAt(i) <= 'z'){
                alphaIndex = inputString.charAt(i) - 'a';
            }
            alphaList[alphaIndex] = true;
        }

        for(int i = 0; i <= 25; i++){
            if(!alphaList[i]){
                flag = 0;
                break;
            }
        }

        System.out.println("Entered String is: " + inputString);

        if(flag == 1){
            System.out.println("The above string consists of all alphabets");
        }
        else{
            System.out.println("The above string does not contain all alphabets");
        }
    }
}

// Time Complexity : O(N); N is the length of input String
// Space Complexity : O(1)

/* Input and Output
    Enter a string as input
    QWERTYUIOPasdfghjklZxCvBnM
    Entered String is: qwertyuiopasdfghjklzxcvbnm
    The above string consists of all alphabets

    Enter a string as input
    qsxedcrfvazplmkij
    Entered String is: qsxedcrfvazplmkij
    The above string does not contain all alphabets

    Enter a string as input
    QWERTYUIOPASDFGHJKLZXCVBNM!@#$%^&*()1234567890
    Entered String is: qwertyuiopasdfghjklzxcvbnm!@#$%^&*()1234567890
    The above string consists of all alphabets

 */