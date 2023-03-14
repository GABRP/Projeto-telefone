package br.com.newton.linguagem.aula03;

public class Telefone {
    Contato contato;
    public String marca;
    public String cor;

    public void Tocar(String estilomusical) {
        if (estilomusical.equals("Pagode"))
            System.out.println("Só tocamos pagode");
        else
            System.out.println("Estilo de música indisponível");
    }

    public void Ligar(Contato contato) {

        if (cor.equals("Preto")) {
            if (contato.nome.equals("Juliana")) {
                System.out.println("Ligando para Juliana");
            }
        }
    }

}