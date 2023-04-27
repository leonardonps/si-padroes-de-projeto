package aula1004.bc1067;

import aularevisao2003.provaestagio.atividades.ativ03.Salario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num, contador = 0;

        num = s.nextInt();

        while(contador <= num){
            if(contador % 2 == 1){
                System.out.println(contador);
            }
            contador++;
        }
    }
}
