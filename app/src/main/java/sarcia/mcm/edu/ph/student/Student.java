package sarcia.mcm.edu.ph.student;

public class Student {

    String fname;
    String lname;
    String age;
    char sex;

    public Student(String fname, String lname, String age, char sex){

        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.sex = sex;

    }
    public String getfname(){
        return this.fname;
    }
    public String getlname(){
        return this.lname;
    }
    public String getage(){
        return this.age;
    }
    public char getsex(){
        return this.sex;
    }

}
