package Lab3;

/**
 *
 * @author os_cntt_gpdn25
 */
public class Student {

    private String name;

    private double marks;

    private String majors;

    public Student() {
    }

    public Student(String name, double marks, String majors) {
        this.name = name;
        this.marks = marks;
        this.majors = majors;
    }

    public String getGrade() {
        if (this.marks < 3) {
            return "Kém";
        }
        if (this.marks < 5) {
            return "Yếu";
        }
        if (this.marks < 6.5) {
            return "Trung bình";
        }
        if (this.marks < 7.5) {
            return "Khá";
        }
        if (this.marks < 9) {
            return "Giỏi";
        }
        return "Xuất sắc";
    }
    
    public boolean isBonus() {
        return this.marks >= 7.5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", marks=" + marks + ", majors=" + majors + '}';
    }    
    
}
