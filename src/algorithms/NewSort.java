package algorithms;

import model.Grade;

public class NewSort {

    public int findLowers(Grade[] grades, int begining, int end) {
        Grade search = grades[end - 1];
        int countLowers = 0;
        for (int i = 0; i <= grades.length - 1; i++) {
            if (grades[i].getValue() < search.getValue()) {
                change(grades, i, countLowers);
                countLowers++;
            }
        }
        change(grades, end - 1, countLowers);
        return countLowers;
    }

    private void change(Grade[] grades, int from, int to) {
        Grade grade1 = grades[from];
        Grade grade2 = grades[to];
        grades[from] = grade2;
        grades[to] = grade1;
    }
}
