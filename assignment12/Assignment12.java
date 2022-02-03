package assignment.assignment12;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment12 {
    public static void main(String[] args) {

        Supplier<Stream<Student>> streamSupplier = () -> Stream.of(new Student(111,"Jiya Berin",17,"Female","Computer Science",2018,70.8),
                new Student(122,"Paul Niksui",18,"Male","Mechanical",2016,50.2),
                new Student(133,"Martin Theron",17,"Male","Electronic",2017,90.3),
                new Student(144,"Murli Gowda",18,"Male","Electrical",2018,80),
                new Student(155,"Nima Roy",19,"Female","Textile",2016,70),
                new Student(166,"Iqbal Hussain",18,"Male","Security",2016,70),
                new Student(177,"Manu Sharma",16,"Male","Chemical",2018,70),
                new Student(188,"Wang Lui",20,"Male","Computer Science",2015,80),
                new Student(199,"Amelia Zoe",18,"Female","Computer Science",2016,85),
                new Student(200,"Jaden Dough",18,"Male","Security",2015,82),
                new Student(211,"Jasna Kaur",20,"Female","Electronic",2019,83),
                new Student(222,"Nitin Joshi",19,"Male","Textile",2016,60.4),
                new Student(233,"Jyothi Reddy",16,"Female","Computer Science",2015,45.6),
                new Student(244,"Nicolus Den",16,"Male","Electronic",2017,95.8),
                new Student(255,"Ali Baig",17,"Male","Electronic",2018,88.4),
                new Student(266,"Sanvi Pandey",17,"Female","Electric",2019,72.4),
                new Student(277,"Anuj Chettiar",18,"Male","Computer Science",2017,57.5));

        //Task 1
        System.out.println("Names of all Departments in the College: ");
        streamSupplier.get().map(s->s.engineeringDepartment).distinct().forEach(System.out::println);


        //Task 2
        System.out.println("Names of Students Enrolled after 2018: ");
        streamSupplier.get().filter(s->s.yearOfEnrollment > 2018).map(s->s.name).forEach(System.out::println);

        //Task 3
        System.out.println("Details of Male Students in Computer Science Department");
        streamSupplier.get().filter(s->s.engineeringDepartment.equals("Computer Science")).filter(s->s.gender.equals("Male"))
                .forEach(s->System.out.println("id: "+s.id+", name: "+s.name+", age: "+s.age+", gender: "+s.gender+", engDepartment: "+s.engineeringDepartment+", year of enrollment: "+s.yearOfEnrollment+", percentage till date: "+s.percentageTillDate));

        //Task 4
        System.out.println("Male and Female Count: ");
        Map<Object, Long> genderWiseCount = streamSupplier.get().collect(Collectors.groupingBy(s->s.gender,Collectors.counting()));
        System.out.println(genderWiseCount);

        //Task 5
        System.out.println("Average Age of Male and Female Students");
        System.out.println("Average age of Male Students: ");
        streamSupplier.get().filter(s->s.gender.equals("Male")).map(s->s.age).mapToInt(s->s).average().ifPresent(s->System.out.println(s));
        System.out.println("Average age of Female Students: ");
        streamSupplier.get().filter(s->s.gender.equals("Female")).map(s->s.age).mapToInt(s->s).average().ifPresent(s-> System.out.println(s));

        //Task 6
        System.out.println("Highest Student having Highest Percentage: ");
        streamSupplier.get().max(Comparator.comparing(s->s.percentageTillDate)).ifPresent(s-> System.out.println(s.name));

        //Task 7
        System.out.println("Number of Students in Each Department: ");
        Map<Object,Long> countStudents = streamSupplier.get().collect(Collectors.groupingBy(s->s.engineeringDepartment,Collectors.counting()));
        System.out.println(countStudents);

        //Task 8
        System.out.println("Average Percentage in each department: ");
        Map<String, Double> avgPercentageByDept = streamSupplier.get().collect(Collectors.groupingBy(s->s.engineeringDepartment, Collectors.averagingDouble(s->s.percentageTillDate)));

        Set<Map.Entry<String, Double>> entrySet = avgPercentageByDept.entrySet();

        for(Map.Entry<String, Double> entry : entrySet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        //Task 9
        System.out.println("Youngest Student in Electrical Department: ");
        Optional<Student> youngestInElectronic = streamSupplier.get().filter(e->e.gender.equals("Male") && e.engineeringDepartment.equals("Electronic"))
                .min(Comparator.comparingInt(s->s.age));

        Student youngest = youngestInElectronic.get();
        System.out.println(youngest.name);

        //Task 10
        System.out.println("Male and Female Students in Computer Science: ");
        Map<String, Long> genderWiseCountInCSE = streamSupplier.get().filter(e->e.engineeringDepartment.equals("Computer Science")).collect(Collectors.groupingBy(s->s.gender, Collectors.counting()));

        System.out.println(genderWiseCountInCSE);
    }
}


/*Output
    Names of all Departments in the College:
    Computer Science
    Mechanical
    Electronic
    Electrical
    Textile
    Security
    Chemical
    Electric
    Names of Students Enrolled after 2018:
    Jasna Kaur
    Sanvi Pandey
    Details of Male Students in Computer Science Department
    id: 188, name: Wang Lui, age: 20, gender: Male, engDepartment: Computer Science, year of enrollment: 2015, percentage till date: 80.0
    id: 277, name: Anuj Chettiar, age: 18, gender: Male, engDepartment: Computer Science, year of enrollment: 2017, percentage till date: 57.5
    Male and Female Count:
    {Male=11, Female=6}
    Average Age of Male and Female Students
    Average age of Male Students:
    17.727272727272727
    Average age of Female Students:
    17.833333333333332
    Highest Student having Highest Percentage:
    Nicolus Den
    Number of Students in Each Department:
    {Chemical=1, Textile=2, Mechanical=1, Computer Science=5, Electric=1, Electronic=4, Electrical=1, Security=2}
    Average Percentage in each department:
    Chemical : 70.0
    Textile : 65.2
    Mechanical : 50.2
    Computer Science : 67.78
    Electric : 72.4
    Electronic : 89.375
    Electrical : 80.0
    Security : 76.0
    Youngest Student in Electrical Department:
    Nicolus Den
    Male and Female Students in Computer Science:
    {Male=2, Female=3}
 */