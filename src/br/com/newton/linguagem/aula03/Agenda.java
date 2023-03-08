package br.com.newton.linguagem.aula03;

public class Agenda {

    public static void main(String[] args) {

        //Criando um objeto telefone utilizando um construtor
        //sem parâmetro padrão
        Contato contato1 = new Contato();
        Contato contato2 = new Contato();
        Contato contato3 = new Contato();
        Contato contato4 = new Contato();
        Telefone telefone1 = new Telefone();
        Telefone telefone2 = new Telefone();
        Telefone telefone3 = new Telefone();
        Telefone telefone4 = new Telefone();

        contato1.nome = "Rafaela";
        contato1.numero = "123456";
        telefone1.contato = contato1;
        telefone1.cor = "Vermelho";
        telefone1.marca = "iPhone";

        contato2.nome = "João";
        contato2.numero = "318989952";
        telefone2.contato = contato2;
        telefone2.cor = "Preto";
        telefone2.marca = "S20";

        contato3.nome = "Carmen";
        contato3.numero = "3189871147";
        telefone3.contato = contato3;
        telefone3.cor = "Dourado";
        telefone3.marca = "iPhone";

        contato4.nome = "Juliana";
        contato4.numero = "3165498778";
        telefone4.contato = contato4;
        telefone4.cor = "Verde";
        telefone4.marca = "iPhone";


        telefone1.Tocar("Pagode");
        telefone1.Ligar(contato4);

        System.out.println("Nome: " + telefone1.contato.nome + "," + " " + "Numero: " + telefone1.contato.numero + "," + " " + "Cor: " + telefone1.cor + "," + " " + "Marca: " + telefone1.marca + ";");
        System.out.println("Nome: " + telefone2.contato.nome + "," + " " + "Numero: " + telefone2.contato.numero + "," + " " + "Cor: " + telefone2.cor + "," + " " + "Marca: " + telefone2.marca + ";");
        System.out.println("Nome: " + telefone3.contato.nome + "," + " " + "Numero: " + telefone3.contato.numero + "," + " " + "Cor: " + telefone3.cor + "," + " " + "Marca: " + telefone3.marca + ";");
        System.out.println("Nome: " + telefone4.contato.nome + "," + " " + "Numero: " + telefone4.contato.numero + "," + " " + "Cor: " + telefone4.cor + "," + " " + "Marca: " + telefone4.marca + ".");
    }
}
