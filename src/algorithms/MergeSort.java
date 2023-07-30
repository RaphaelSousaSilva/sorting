package algorithms;

import model.Grade;

public class MergeSort implements SortGrade {

    @Override
    public Grade[] order(Grade[] grades, Integer size) {
        Grade[] mergedGrades = new Grade[size];

        int currentGrades1 = 0;
        int firstOrderedPartSize = size / 2 - 1;
        int currentGrades2 = firstOrderedPartSize;
        int currentMergedGrades = 0;

        while (currentGrades1 < firstOrderedPartSize && currentGrades2 < size) {
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

        while (currentGrades1 < firstOrderedPartSize) {
            mergedGrades[currentMergedGrades++] = grades[currentGrades1++];
        }

        while (currentGrades2 < grades.length) {
            mergedGrades[currentMergedGrades++] = grades[currentGrades2++];
        }

        return mergedGrades;
    }
}
