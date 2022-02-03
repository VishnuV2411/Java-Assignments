package assignment.assignment1;

import java.io.File;
import java.util.Scanner;

public class Assignment1 {

    private void findFile(){
        File file = new File("/home/vishvrt");
        String fName;
        Scanner sc = new Scanner(System.in);
        do{
            int found = 0;
            System.out.println("Enter the name of the file");
            fName = sc.nextLine();
            //list of files stored in array of strings
            String[] files = file.list();

            //check for each file in the array

            for(String f : files){
                //check for name of file is present in the array or not
                boolean check = fName.equals(f);

                if(check){
                    found = 1;
                    System.out.println("File Found : "+fName);

                    System.out.println("Path : "+file.getAbsolutePath()+"/"+fName);
                }

            }
            if(found==0){
                System.out.println("File not found : Re enter the name of the file");
            }

        }while(true);
    }
    public static void main(String[] args) {
        Assignment1 fileFinder = new Assignment1();
        fileFinder.findFile();
    }
}

/* Input and Output
Enter the name of the file
hello.txt
File Found : hello.txt
Path : /home/vishvrt/hello.txt
Enter the name of the file
abc.txt
File not found : Re enter the name of the file
 */