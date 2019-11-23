package test.shihtim.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public int heighest(){
        int max = (english>math)?english:math;
//        if(english>math)
//            max=english;
//        else
//            max=math;
        return max;
    }

    public void print(){
        System.out.print(name+"\t"+english+"\t"+math+"\t"+getAverage());
        if (getAverage()>60)
            System.out.println("\t PASS");
        else
            System.out.println("\t FAILED");
    }

    public int getAverage(){
        return ((english+math)/2);
    }
}
