import java.util.ArrayList;
import java.util.Scanner;

class Student{
    String name;
    int rollNo;
    String admsnNO;
    String college;

    public Student(String name, int rollNo, String admsnNO, String college) {
        this.name = name;
        this.rollNo = rollNo;
        this.admsnNO = admsnNO;
        this.college = college;
    }
}
public class Main {
    public static void main(String[] args) {

        ArrayList<Student> sarr = new ArrayList<Student>();
        while (true){
            System.out.println("Select the option \n 1 - Add student \n 2 - View Student list \n 3 - Search Student \n 4 - Delete Student \n" +
                "5 - exit");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();

            switch (n){
                case 1 :
                    System.out.println("Enter student details");
                    System.out.println("enter name of the student");
                    String name = input.next();
                    System.out.println("Enter the roll number");
                    int rollNo = input.nextInt();
                    System.out.println("Enter admission number");
                    String admsnNo = input.next();
                    System.out.println("Enter college name");
                    String college = input.next();

                    Student s = new Student(name, rollNo, admsnNo, college);
                    sarr.add(s);
                    break;

                case 2 :
                    System.out.println("Student details");
                    for (Student stud : sarr){
                        System.out.println(stud.name);
                        System.out.println(stud.rollNo);
                        System.out.println(stud.admsnNO);
                        System.out.println(stud.college);

                    }
                    break;

                case 3 :
                    System.out.println("Enter the admission number");
                    String admsnNo1 = input.next();
                    for(Student stud : sarr){
                        if(admsnNo1.equals(stud.admsnNO)){
                            System.out.println("Student with admission number " + admsnNo1 + "is " + stud.name);
                            break;
                        }
                        else {
                            System.out.println("No such student found");
                        }
                    }
                    break;
            }

    }}
}