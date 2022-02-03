package assignment.assignment4;

import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.*;

class Kyc{
    public void range(String startDate, String currDate){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate signUpDate = LocalDate.parse(startDate,dtf);
        LocalDate currentDate = LocalDate.parse(currDate,dtf);

        if(currentDate.getYear() <= signUpDate.getYear()){
            System.out.println("No Range");
        }
        else{
            //calculating year difference
            int yearDiff = signUpDate.getYear() - currentDate.getYear();
            signUpDate = signUpDate.minusYears(yearDiff);

            //adding or subtracting 30 days
            LocalDate start = signUpDate.minusDays(30);
            LocalDate stop = signUpDate.plusDays(30);
            //comparing currentDate and stop date as stop date should not exceed current date
            if(currentDate.compareTo(stop)<0){
                stop = currentDate;
            }
            System.out.println(start.format(dtf)+"  "+stop.format(dtf));
        }
    }

}
public class Assignment4 {
    public static void main(String[] args) {
        Kyc obj = new Kyc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of dates");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Enter Signup and Current Dates");
            String startDate = sc.next();
            String endDate = sc.next();
            obj.range(startDate,endDate);
        }

    }

}

/* Input and Output
    Enter number of dates
    5
    Enter Signup and Current Dates
    16-07-1998 27-06-2017
    16-06-2017  27-06-2017
    Enter Signup and Current Dates
    04-02-2016 04-04-2017
    05-01-2017  06-03-2017
    Enter Signup and Current Dates
    04-05-2017 04-04-2017
    No Range
    Enter Signup and Current Dates
    04-04-2015 04-04-2016
    05-03-2016  04-04-2016
    Enter Signup and Current Dates
    04-04-2015 15-03-2016
    05-03-2016  15-03-2016
 */