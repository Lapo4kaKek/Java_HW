import University.*;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static int getRandomNumber(int limit)
    {
        return (int) (Math.random() * limit);
    }
    public static void main(String[] args) {
        Lesson lesson = new Lesson("System_design");
        lesson.addStudent(new Student("Artem"));
        lesson.addStudent(new Student("Vanya"));
        lesson.addStudent(new Student("Maxim"));
        lesson.addStudent(new Student("Alex"));
        lesson.addStudent(new Student("Maria"));
        lesson.addStudent(new Student("Vasya"));
        lesson.addStudent(new Student("Polina"));
        System.out.printf("There are %d people in the class", lesson.quantityPeople());
        Scanner in = new Scanner(System.in);
        System.out.print("how many times will we ask?:");
        int questions = in.nextInt();
        while (questions > 0) {
            questions--;
            int index = getRandomNumber(lesson.quantityPeople());
            lesson.markStudent(index);
            int score = getRandomNumber(10);
            lesson.putScore(index, score);
            ArrayList<Integer> scores = lesson.getScore(index);
            System.out.print("Scores:");
            for(int i = 0; i < scores.size(); i++) {
                System.out.println(scores.get(i));
            }
            System.out.print("\n");
        }
    }
}