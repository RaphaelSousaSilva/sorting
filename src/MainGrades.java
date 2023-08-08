import algorithms.MergeSort;
import model.Grade;

public class MainGrades {
    public static void main(String[] args) {
        Grade[] grades1 = {
                new Grade("Ana", 4),
                new Grade("Joseph", 6),
                new Grade("Rachel", 7),
                new Grade("Pamela", 9),
                new Grade("Meredith", 3),
                new Grade("Jack", 4.5),
                new Grade("Monica", 6.5),
                new Grade("Michael", 7),
                new Grade("Kevin", 9.3),
                new Grade("Bob", 10)
        };

        MergeSort mergeSort = new MergeSort();

        Grade[] mergedGrades = mergeSort.order(grades1, grades1.length);
        for (Grade gr : mergedGrades) {
            System.out.println(gr.getStudent() + " - " + gr.getValue());
        }
    }
}
