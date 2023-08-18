import algorithms.MergeSortGrade;
import algorithms.NewSort;
import model.Grade;

public class MainGrades {
    public static void main(String[] args) {
        Grade[] grades = {
                new Grade("Bob", 10),
                new Grade("Ana", 4),
                new Grade("Ava", 8.9),
                new Grade("Joseph", 6),
                new Grade("Meredith", 3),
                new Grade("Pamela", 9),
                new Grade("Rachel", 7),
                new Grade("Jack", 4.5),
                new Grade("George", 9.7),
                new Grade("Michael", 7),
                new Grade("Monica", 6.5),
        };
        NewSort newSort = new NewSort();
        int lowers = newSort.findLowers(grades, 0, grades.length);
        System.out.println(lowers);

        for (Grade gr : grades) {
            System.out.println(gr.getStudent() + " - " + gr.getValue());
        }
    }

    private static void mergeSort(Grade[] grades) {
        MergeSortGrade mergeSortGrade = new MergeSortGrade();

        mergeSortGrade.sort(grades, 0, grades.length);
    }
}
