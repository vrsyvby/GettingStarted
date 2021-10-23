package garden.vegetables;

import java.util.Random;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    private String name;
    private int studentId;
    private int lastId=1000;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                '}';
    }

    private String[] namesArray={"Bob","jim","Nash","mike"};;


    {
        int i=new Random().nextInt(4);
        this.name= namesArray[i];
        this.studentId=++lastId;


    }






}
