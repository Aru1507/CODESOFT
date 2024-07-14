package com.company;
import java.util.*;
public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
                int numberOfSubjects = sc.nextInt();

                int totalMarks = 0;
                double averagePercentage;

                for (int i = 0; i < numberOfSubjects; i++) {
                    System.out.print("Enter marks for subject " + (i + 1) + ": ");
                    int marks = sc.nextInt();
                    totalMarks += marks;
                }

                averagePercentage = (double) totalMarks / numberOfSubjects;

                char grade;
                if (averagePercentage >= 90) {
                    grade = 'A';
                } else if (averagePercentage >= 80) {
                    grade = 'B';
                } else if (averagePercentage >= 70) {
                    grade = 'C';
                } else {
                    grade = 'D';
                }

                System.out.println("Total Marks: " + totalMarks);
                System.out.println("Average Percentage: " + averagePercentage + "%");
                System.out.println("Grade: " + grade);

                sc.close();
            }
        }

