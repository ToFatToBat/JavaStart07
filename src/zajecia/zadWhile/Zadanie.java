package zajecia.zadWhile;

import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {

        int nuembersSum = 0;
        int numberOfLoops = 5;
        int loopNo = 0;
        Scanner sc = new Scanner(System.in);

        while (loopNo < numberOfLoops) {

            System.out.println("Podaj liczbę:");
            int a = sc.nextInt();
            nuembersSum += a;
            loopNo++;

        }
        System.out.println("Suma podanych liczb to: " + nuembersSum);
    }
}
