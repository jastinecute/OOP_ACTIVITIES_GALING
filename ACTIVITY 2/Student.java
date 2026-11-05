/*
JASTINE C. GALING
BSIT - 2B
*/

public class Student {
    private String name;
    private String studentId;   
    private String course;
    private int yearLevel;

    public Student(String name, String studentId,String course , int yearLevel) {
        this.name = name;
        this.studentId = studentId;
        this.course = course;
        setYearLevel(yearLevel);
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYearLevel(int yearLevel) {
        if(yearLevel >= 1 && yearLevel <= 4) {
             this.yearLevel = yearLevel;
        }else {
           System.out.println("Invalid year level! Please enter a value between 1 and 4.");
        }
        
    }
    
    public String getCourse() {
        return course;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void displayInfo() {      
        System.out.println("Name: " + name + " Student ID: " + studentId + " Course: " + course + " Year Level: " + yearLevel);      
    }
}