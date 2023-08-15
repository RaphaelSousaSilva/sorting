package algorithms;

import model.Grade;

public class MergeSort implements SortGrade {

    public Grade[] merge(Grade[] grades, int start, int division, int end) {
        Grade[] mergedGrades = new Grade[end - start];
        int currentMergedGrades = 0;

        int currentGrades1 = start;
        int currentGrades2 = division;

        while (currentGrades1 < division && currentGrades2 < end) {
            Grade grade1 = grades[currentGrades1];
            Grade grade2 = grades[currentGrades2];
            Grade lowerGrade;

            if (grade1.getValue() < grade2.getValue()) {
                lowerGrade = grade1;
                currentGrades1++;
            } else {
                lowerGrade = grade2;
                currentGrades2++;
            }

            mergedGrades[currentMergedGrades] = lowerGrade;
            currentMergedGrades++;
        }

        while (currentGrades1 < division) {
            mergedGrades[currentMergedGrades++] = grades[currentGrades1++];
        }

        while (currentGrades2 < end) {
            mergedGrades[currentMergedGrades++] = grades[currentGrades2++];
        }

        int j = 0;
        while (j < mergedGrades.length) {
            grades[start + j] = mergedGrades[j++];
        }

        return grades;
    }


    @Override
    public void sort (Grade[] grades, int start, int end) {
        int mid = (start + end) / 2;
        if (end - start == 1) {
            return;
        }
        sort(grades, start, mid);
        sort(grades, mid, end);
        merge(grades, start, mid, end);
    }
}
