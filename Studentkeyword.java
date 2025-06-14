class Studentkeyword {
   int rollno;
   String name;
   static String college = "UWM";
   
Studentkeyword(int r, String n){
    rollno = r;
    name = n;  
}

void display(){System.out.println(rollno + ":" + name + ":" + college);}

public static void main(String[] args) {
    Studentkeyword s1 = new Studentkeyword(201,"Stephen");
    Studentkeyword s2 = new Studentkeyword(202,"Sandro");

    s1.display();
    s2.display();

}
}