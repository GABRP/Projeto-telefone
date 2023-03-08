package br.com.newton.linguagem.aula03;

public class Agenda {

    public static void main(String[] args) {

        Telefone tel1 = new Telefone();
        Contato cont = new Contato();
        Telefone tel2 = new Telefone();
        Contato cont2 = new Contato();
        Telefone tel3 = new Telefone();
        Contato cont3 = new Contato();

        tel1.contato = cont;
        cont.nome = "Rafaela";
        cont.numero = "123456";
        tel1.cor = "Vermelho";
        tel1.marca = "iPhone";

        tel2.contato = cont2;
        cont2.nome = "João";
        cont2.numero = "318989952";
        tel2.cor = "Preto";
        tel2.marca = "S20";

        tel3.contato = cont3;
        cont3.nome = "Carmen";
        cont3.numero = "3189871147";
        tel3.cor = "Dourado";
        tel3.marca = "iPhone";


        tel1.Tocar("Pagode");
        tel2.Ligar(cont3);

        System.out.println(tel1.contato.nome + " " + tel1.contato.numero + " " + tel1.cor + " " + tel1.marca);
        System.out.println(tel2.contato.nome + " "+ tel2.contato.numero + " " + tel2.cor + " " + tel2.marca);
        System.out.println(tel3.contato.nome + " "+ tel3.contato.numero + " " + tel3.cor + " " + tel3.marca);
    }
}