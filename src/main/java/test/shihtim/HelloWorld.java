package test.shihtim;

public class HelloWorld {
    public static void main(String[] args){
        String s="abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.substring(2,4));
//        System.out.println("Hello World");
        Person person=new Person("DK",60,1.7f);
//        person.name="DK";
        person.age=23;
//        person.height=1.7f;
//        person.weight=60;
        person.hello();

        System.out.println(person.bmi());
//        int age=23;
//        Integer integer=123;
//        short b=10;
//        Short ss;
//        long bc=1;
//        char cha='G';
//
//        byte ba=8;
//        boolean tr=true;
//        boolean fal=false;
//        float fol=50.5f;
//        double dob=60.43;
//        String jj="你好";
    }
}
