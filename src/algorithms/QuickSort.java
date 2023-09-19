package algorithms;

import model.Grade;

public class QuickSort implements SortGrade {

    @Override
    public void sort(Grade[] grades, int start, int end) {
        if (end - start <= 1) {
            return;
        }
        int pivot = partition(grades, start, end);
        sort(grades, start, pivot);
        sort(grades, pivot + 1, end);
    }

    public int partition(Grade[] grades, int start, int end) {
        Grade search = grades[end - 1];
        int countLowers = start;
        for (int i = start; i <= end - 1; i++) {
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
