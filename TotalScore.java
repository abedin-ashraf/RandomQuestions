/*
 Objective: write a program that calculates the total score for students 
in a class. Suppose the scores are stored in a three-dimensional array 
named scores. The first index in scores refers to a student, the second 
refers to an exam, and the third refers to the part of the exam. Suppose 
there are 7 students, 5 exams, and each exam has two parts--the 
multiple-choice part and the programming part. So, scores[i][j][0] 
represents the score on the multiple-choice part for the i’s student on 
the j’s exam. Your program displays the total score for each student. 
 */

public class TotalScore {
    public static void main(String[] args){
        double[][][] scores = {
                {{7.5, 20.5}, {9.0, 22.5}, {15, 33.5}, {13, 21.5}, {15, 2.5}},
                {{4.5, 21.5}, {9.0, 22.5}, {15, 34.5}, {12, 20.5}, {14, 9.5}},
                {{6.5, 30.5}, {9.4, 10.5}, {11, 33.5}, {11, 23.5}, {10, 2.5}},
                {{6.5, 23.5}, {9.4, 32.5}, {13, 34.5}, {11, 20.5}, {16, 7.5}},
                {{8.5, 26.5}, {9.4, 52.5}, {13, 36.5}, {13, 24.5}, {16, 2.5}},
                {{9.5, 20.5}, {9.4, 42.5}, {13, 31.5}, {12, 20.5}, {16, 6.5}},
                {{1.5, 29.5}, {6.4, 22.5}, {14, 30.5}, {10, 30.5}, {16, 6.0}}};

        for(int i=0; i<scores.length; i++){
            double totalScore = 0;
            for(int j=0; j<scores[i].length; j++){
                for(int k=0; k<scores[i][j].length; k++)
                    totalScore = scores[i][j][k];
            }
            System.out.println("Student "+i+"'a score is "+totalScore);
        }
    }
}
