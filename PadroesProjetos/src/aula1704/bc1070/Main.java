package aula1704.bc1070;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number;

        number = s.nextInt();

        for(int i = 0; i < 6; i++){
            if(number % 2 == 0){
                number += 1;
            }
            System.out.println(number);
            number += 2;
        }
    }
}
