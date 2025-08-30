package DesignPatterns.prototype;

public class IntelligentStudent extends Student{

    public int iq;


    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
    }
    public IntelligentStudent(){

    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
