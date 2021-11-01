public class Student implements Printable{
    private String name;//name of student
    private String[] grade = new String[5];//grades of student

    public Student(String name, String[] grade){
        this.name = name;
        this.grade = grade;
    }

    public void print(){
        //Display name of student
        System.out.println("Name: " + name);

        //Display the five grades
        System.out.print("Grade: ");
        for (String i: grade){
            System.out.print(i + " ");
        }
    }
}
