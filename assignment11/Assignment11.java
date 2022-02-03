package assignment.assignment11;

import java.io.*;
import java.util.HashMap;

public class Assignment11 {
    HashMap<Character,Integer> charCounter = new HashMap<>();
    public void counter(String input){

        input = input.toLowerCase();
        char[] charArray = input.toCharArray();
        for(Character ch : charArray){
            if(charCounter.containsKey(ch)){
                charCounter.put(ch,charCounter.get(ch)+1);
            }
            else{
                charCounter.put(ch,1);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        File inputFile = new File(args[0]);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
        Assignment11 characterOccurrence = new Assignment11();
        File outputFile = new File("Out.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile));
        String fileContent;

        while((fileContent = bufferedReader.readLine()) != null){
            characterOccurrence.counter(fileContent);
            System.out.println(fileContent);
        }

        for(Character ch : characterOccurrence.charCounter.keySet()){
            bufferedWriter.write(ch+" "+characterOccurrence.charCounter.get(ch));
            bufferedWriter.newLine();
            System.out.println(ch+" "+characterOccurrence.charCounter.get(ch));
        }
        bufferedReader.close();
        bufferedWriter.close();
    }



}

