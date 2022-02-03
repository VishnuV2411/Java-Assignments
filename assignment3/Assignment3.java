package assignment.assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment3 {

    void ping(String hostName, int n) throws IOException{

        ProcessBuilder processBuilder = new ProcessBuilder("ping","-c", String.valueOf(n), hostName);
        Process process = processBuilder.start();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader error = new BufferedReader((new InputStreamReader(process.getErrorStream())));
        String str = null;
        int j = 0;
        float[] freq = new float[n];
        float median = 0;
        while((str=bufferedReader.readLine()) != null)
        {
            int index = str.indexOf("time=");
            if(index != -1){
                String temp = str.substring(index+5, str.length()-3);
                freq[j++] = Float.parseFloat(temp);
            }
        }

        if(n%2 == 0){
            median = (freq[n/2] + freq[n/2+1])/2;
        }
        else{
            median = freq[n/2];
        }

        System.out.println("Median of Times: "+median);

        while((str=error.readLine()) != null){
            System.out.println("Unable to reach host "+str);
        }

    }

    public static void main(String[] args) throws IOException{
        Assignment3 pingMedian = new Assignment3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of packets to be transmitted");
        int n = sc.nextInt();

        ArrayList<String> hosts = new ArrayList<>();
        System.out.println("Enter IP address of host1: ");
        String host1 = sc.next();
        System.out.println("Enter IP address of host2: ");
        String host2 = sc.next();
        hosts.add(host1);
        hosts.add(host2);
        for(String s : hosts){
            pingMedian.ping(s,n);
        }
    }
}

/*Input and Output
Enter number of packets to be transmitted
3
Enter IP address of host1:
127.0.1.1
Enter IP address of host2:
127.0.0.53
Median of Times: 0.05
Median of Times: 0.054
 */