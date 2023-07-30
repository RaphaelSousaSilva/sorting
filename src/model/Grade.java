package model;

public class Grade {
    private String student;
    private double value;

    public Grade(String student, double value) {
        this.student = student;
        this.value = value;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
