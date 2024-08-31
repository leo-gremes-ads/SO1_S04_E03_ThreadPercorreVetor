package controller;

public class ThreadPercorreVetor extends Thread
{
    private int valor;
    private int[] vetor;

    public ThreadPercorreVetor(int valor, int[] vetor)
    {
        this.valor = valor;
        this.vetor = vetor;
    }

    @Override
    public void run()
    {
        double inicio, termino;
        if (valor % 2 == 0) {
            inicio = System.nanoTime();
            for (int i = 0; i < this.vetor.length; i++) {
                // Nada aqui!
            }
            termino = System.nanoTime();
        } else {
            inicio = System.nanoTime();
            for(int n: this.vetor) {
                // Nada aqui!
            }
            termino = System.nanoTime();
        }
        double tempo = (termino - inicio) / Math.pow(10, 9);
        System.out.println("valor: " + this.valor + " --> " + String.format("%.7f", tempo) + " s");
    }
}