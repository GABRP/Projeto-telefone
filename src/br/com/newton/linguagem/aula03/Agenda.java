package br.com.newton.linguagem.aula03;

public class Agenda {
    public static void main(String[] args){

        //Criando um objeto telefone utilizando um construtor
        //sem parâmetro padrão

        Telefone telefone = new Telefone();
        Contato contato = new Contato();
        contato.nome = "Rafaela";
        contato.telefone = "123456";
        telefone.contato = contato;
        System.out.println(telefone.contato.nome);

        contato.nome = "João";
        contato.telefone = "318989952";
        telefone.cor1 = "Vermelho";
        telefone.marca1 = "IPhone";
        System.out.println(telefone.marca1 + " " + telefone.cor1);

        contato.nome = "Carmen";
        contato.telefone =  "3189871147";
        telefone.cor2 = "Dourado";
        telefone.marca2 = "S20";
        System.out.println(telefone.marca2 + " " + telefone.cor2);

        telefone.Tocar (" "+"Pagode");
        System.out.println (telefone.contato.nome);
    }
}