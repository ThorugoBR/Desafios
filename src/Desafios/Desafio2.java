package Desafios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) throws IOException {
        int poscounter=0;
        int negcounter=0;
        List<Float> Numbers = new ArrayList();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++)
        {
            Numbers.add(Float.valueOf(sc.nextLine()));
        }

        for (int i = 0; i < Numbers.size(); i++) {
            if (Numbers.get(i) > 0) {
                poscounter++;
            }
            if (Numbers.get(i) < 0) {
                negcounter++;
            }
        }
        System.out.println(poscounter + " valores positivos");
    }
}