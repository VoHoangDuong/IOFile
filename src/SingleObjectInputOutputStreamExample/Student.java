package SingleObjectInputOutputStreamExample;

import java.io.Serializable;

public class Student implements Serializable {
    private String ID;
    private int studentYears;
    private float studentAVGMark;
    private String studentName;

    public Student(){

    }

    public Student(String ID){
        this.ID = ID;
    }

    public Student(String ID, int studentYears, float studentAVGMark, String studentName){
        this.ID = ID;
        this.studentYears = studentYears;
        this.studentAVGMark = studentAVGMark;
        this.studentName = studentName;
    }

    public String getID(){
        return ID;
    }

    public int getStudentYears(){
        return studentYears;
    }

    public float getStudentAVGMark(){
        return studentAVGMark;
    }

    public String getStudentName(){
        return studentName;
    }

    @Override
    public String toString() {
        return "Student [ " +
                "ID='" + ID + '\'' +
                ", studentYears=" + studentYears +
                ", studentAVGMark=" + studentAVGMark +
                ", studentName='" + studentName + '\'' +
                ']';
    }
}
