package br.com.newton.linguagem.aula03;

public class Agenda {
    public static void main(String[] args){

        Telefone telefone = new Telefone();
        Contato contato = new Contato();
        contato.nome = "Gabriel";
        contato.numero = "222255";
        telefone.contato = contato;
        telefone.cor = "Vermelho";
        telefone.marca = "Iphone";

        telefone.Tocar("Pagode");

        System.out.println(telefone.cor + " "+ telefone.marca);
    }
}
