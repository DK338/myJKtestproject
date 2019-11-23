package test.shihtim.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student student=new Student("DK",60,70);
        System.out.println("High score:" + student.heighest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student's name:");
        String name = scanner.next();
        System.out.println("Please enter student's english:");
        int english = scanner.nextInt();
        System.out.println("Please enter student's math:");
        int math = scanner.nextInt();
        Student student = new Student(name, english, math);
        student.print();
        System.out.println("High score:" + student.heighest());
    }
}
