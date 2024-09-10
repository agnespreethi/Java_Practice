// Object of Array
class Student{
    int roll_no;
    String name;
    int marks;
}
public class ArrayStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll_no = 1;
        s1.name = "Agnes";
        s1.marks = 55;

        // System.out.println(s1.name + " : " + s1.marks);
        // System.out.println(s1);

        Student s2 = new Student();
        s2.roll_no = 2;
        s2.name = "Robin";
        s2.marks = 90;

        Student s3 = new Student();
        s3.roll_no = 3;
        s3.name = "Malar";
        s3.marks = 72;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i< students.length; i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }
       
        System.out.println("------------Enhanced for loop---------------");
       
        for(Student stud : students){
            System.out.println(stud.name + " : " + stud.marks);
        }
    }
}
