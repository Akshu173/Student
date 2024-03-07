class students{
    String name;
    String program;
    int sem;
    String course_reg;
    int marks;
    students(String name, String program,int sem, String course_reg,int marks){
        this.name=name;
        this.program=program;
        this.sem=sem;
        this.course_reg=course_reg;
        this.marks=marks;
    }
    void disp(){
        System.out.println("Name:"+name);
        System.out.println("program:"+program);
        System.out.println("Semister:"+sem);
        System.out.println("course_reg:"+course_reg);
        System.out.println("marks:"+marks);
        System.out.println("");
    }
}
class course extends students{
    course(String name, String program, int sem, String course_reg, int marks) {
        super(name, program, sem, course_reg, marks);
        //TODO Auto-generated constructor stub
    }

    void calc(){
        if(marks<40){
            System.out.println("Students Who scored less than 40");
            System.out.println("___________________________________");
            System.out.println("Name:"+name);
            System.out.println("program:"+program);
            System.out.println("Semister:"+sem);
            System.out.println("course_reg:"+course_reg);
            System.out.println("marks:"+marks);
            System.out.println("");
        }
    }
    
}
class details{
    public static void main(String args[]){
       students s1=new students("Akshay","BCA" ,4, "1-11-2022",35 );
         s1.disp();
       students s2=new students("Dayanand","BCA" ,4, "11-3-2022",45 );
       s2.disp();
       course c1=new course("Akshay","BCA" ,4, "1-11-2022",35);
       c1.calc();
       course c2=new course("Dayanand","BCA" ,4, "11-3-2022",45);
       c2.calc();
    }
}
