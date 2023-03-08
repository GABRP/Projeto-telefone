package br.com.newton.linguagem.aula03;

public class Telefone {
    Contato contato;
    public String marca;
    public String cor;

    public void Tocar(String estilomusical){
        System.out.println("Tocando " + estilomusical);
    }

    public void Ligar(Contato realizarligacao){
        if (this.cor.equals("Preto"))
            System.out.println("Ligando para " + realizarligacao.nome);
        else
            System.out.println("Telefone indisponível");
    }
}