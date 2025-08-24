//Task 1 
class Student { 
    private int rollNumber; 
    private String name; 
    private String course; 
    private double marks; 
    private char grade; 
 

    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; } 
    public void setName(String name) { this.name = name; } 
    public void setCourse(String course) { this.course = course; } 
    public void setMarks(double marks) {  
        this.marks = marks;  
        this.grade = calculateGrade(marks);  
    } 

    private char calculateGrade(double marks) { 
        if (marks >= 90) return 'A'; 
        else if (marks >= 80) return 'B'; 
        else if (marks >= 70) return 'C'; 
        else if (marks >= 60) return 'D'; 
        else return 'F'; 
    } 
 
 
    public void displayStudent() { 
        System.out.println("Roll Number: " + rollNumber); 
        System.out.println("Name       : " + name); 
        System.out.println("Course     : " + course); 
        System.out.println("Marks      : " + marks); 
        System.out.println("Grade      : " + grade); 
        System.out.println("---------------------------"); 
    } 
} 
 
public class Main{ 
    public static void main(String[] args) { 
        Student s1 = new Student(); 
        s1.setRollNumber(1); 
        s1.setName("Shreyansh"); 
        s1.setCourse("Math"); 
        s1.setMarks(33); 
        s1.displayStudent(); 
 
        Student s2= new Student();
        s2.setRollNumber(2);
        s2.setName("Harshit");
        s2.setCourse("Math"); 
        s2.setMarks(88); 
        s2.displayStudent();

        Student s3= new Student();
        s3.setRollNumber(3);
        s3.setName("Aditya");
        s3.setCourse("Math"); 
        s3.setMarks(21); 
        s3.displayStudent();


    } 
}



// Task 2 
import java.util.Scanner;


class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of student: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students= new Student[n];
        for (int i =0 ;i<n;i++){
            System.out.println("Enter details for student " + (i+1));
            Student s = new Student();
            System.out.println("Roll Number: ");
            s.setRollNumber(sc.nextInt());
            sc.nextLine();
            System.out.println("Enter Name: ");
            s.setName(sc.nextLine());
            System.out.println("Course: ");
            s.setCourse(sc.nextLine());
            System.out.println("Marks: ");
            s.setMarks(sc.nextDouble());
            sc.nextLine();
            students[i] = s;
            System.out.println("Student added successfully\n");


        }
    }
}