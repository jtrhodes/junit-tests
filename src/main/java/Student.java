import java.util.ArrayList;

public class Student {
    public long id;
    public String name;
    public ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }
    public double getGradeAverage(){
        double average = 0;
        for(Integer grade : grades){
            average += grade;
        }
        return average / this.grades.size();
    }
}
