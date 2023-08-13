import algorithms.MergeSort;
import model.Grade;

public class MainGrades {
    public static void main(String[] args) {
        Grade[] grades1 = {
                new Grade("Ana", 4),
                new Grade("Joseph", 6),
                new Grade("Rachel", 7),
                new Grade("Ava", 8.9),
                new Grade("Pamela", 9),
                new Grade("George", 9.7),
                new Grade("Meredith", 3),
                new Grade("Jack", 4.5),
                new Grade("Monica", 6.5),
                new Grade("Michael", 7),
                new Grade("Kevin", 9.3),
                new Grade("Bob", 10)
        };

//        Grade[] grades2 = {
//                new Grade("Andressa", 4),
//                new Grade("Camila", 6),
//                new Grade("Enzo", 7),
//                new Grade("Fernando", 8.9),
//                new Grade("Maria", 9),
//                new Grade("Alberto", 9.7),
//                new Grade("Jonas", 3),
//                new Grade("Junior", 4.5),
//                new Grade("Paloma", 6.5),
//                new Grade("Paulo", 7),
//                new Grade("Kevin", 9.3),
//        };



        Grade[] grades3 = {
                new Grade("Ana", 4),
                new Grade("Bob", 10),
                new Grade("Joseph", 6),
                new Grade("Ava", 8.9),
                new Grade("Meredith", 3),
                new Grade("Pamela", 9),
                new Grade("Rachel", 7),
                new Grade("Jack", 4.5),
                new Grade("Kevin", 9.3),
                new Grade("Michael", 7),
                new Grade("Monica", 6.5),
                new Grade("George", 9.7),
        };

        MergeSort mergeSort = new MergeSort();

         mergeSort.order(grades1, 0, 6, grades1.length);

        for (Grade gr : grades1) {
            System.out.println(gr.getStudent() + " - " + gr.getValue());
        }
    }
}
