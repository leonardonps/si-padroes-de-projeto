package ex1006;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] grades = new double[2];
        double sum = 0, average;

        grades[0] = s.nextDouble() * 3.5;
        grades[1] = s.nextDouble() * 7.5;
        //grades[2] = s.nextDouble() * 5;

        for(int i = 0; i < grades.length; i++){
            sum += grades[i];
        }

        average = sum/11;

        System.out.printf("MEDIA = %.5f\n", average);

    }
}
