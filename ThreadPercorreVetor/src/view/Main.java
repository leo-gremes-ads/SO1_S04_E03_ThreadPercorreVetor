package view;

import controller.*;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        int[] vetor = new int[1000];
        Random r = new Random();
        Thread[] t = new ThreadPercorreVetor[2];
        //Preenchendo vetor
        for (int i = 0; i < 1000; i++)
            vetor[i] = r.nextInt(101);
        //Percorrendo com threads
        for (int i = 0; i < 2; i++) {
            t[i] = new ThreadPercorreVetor((i % 2) + 1, vetor);
            t[i].start();
        }
    }
}
