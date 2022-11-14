package University;
import University.Student;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
public class Lesson {
    private String title;
    private Map<Student, Boolean> Attendance;
    private Map<Student, ArrayList<Integer>> Statement;
    public Lesson(String title) {
        this.title = title;
        Attendance = new HashMap<Student, Boolean>();
        Statement = new HashMap<Student, ArrayList<Integer>>();
    }
    public Integer quantityPeople() {
        int count = 0;
        for(var student : Attendance.entrySet()) {
            count++;
        }
        return count;
    }
    public void addStudent(Student student) {
        Attendance.put(student, false);
        Statement.put(student, new ArrayList<Integer>());
    }
    public void markStudent(Student student) {
        Attendance.replace(student, true);
    }
    public void markStudent(int index) {
        int temp = 0;
        for(var student: Attendance.entrySet()) {
            if (temp == index) {
                Attendance.replace(student.getKey(), true);
                break;
            }
            temp++;
        }
    }
    public void putScore(String name, int score) {
        boolean check = false;
        for(var student: Statement.entrySet()) {
            if (student.getKey().getName() == name) {
                if (Statement.get(student).isEmpty()) {
                    Statement.replace(student.getKey(), new ArrayList<>(score));
                } else {
                    Statement.get(student).add(score);
                }
                check = true;
                break;
            }
        }
        if(!check) {
            System.out.print("Student not found");
        }
    }

    public void putScore(int index, int score) {
        Student student = findStudent(index);
        Statement.get(student).add(score);
    }
    public Student findStudent(int index) {
        int temp = 0;
        for(var student: Attendance.entrySet()) {
            if (temp == index) {
                return student.getKey();
            }
            temp++;
        }
        return null;
    }
    public ArrayList<Integer> getScore(String name) {
        if (Statement.isEmpty()) {
            for(var student: Statement.entrySet()) {
                if (student.getKey().getName() == name) {
                    return Statement.get(student.getKey());
                }
            }
            System.out.print("Student not found");
            return null;
        } else {
            System.out.print("Student not found");
            return null;
        }
    }
    public ArrayList<Integer> getScore(int index) {
        Student student = findStudent(index);
        if (!Statement.isEmpty()) {
            return Statement.get(student);
        } else {
            System.out.print("Student not found");
            return null;
        }
    }
}
