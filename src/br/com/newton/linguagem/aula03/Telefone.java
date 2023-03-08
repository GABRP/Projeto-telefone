package br.com.newton.linguagem.aula03;

public class Telefone {
    Contato contato;
    public String marca;
    public String cor;

    public void Tocar(String estilomusical){
        if (estilomusical == "Pagode")
            System.out.println("Só tocamos pagode");
        else
            System.out.println("Estilo de música indisponível");
    }

    //public void Ligar(Telefone cor){
        //if (cor.cor == "Preto")
            //System.out.println("Ligando para o telefone preto de João" );
        //else
            //System.out.println("Telefone indisponível(O telefone não é preto)");
    //}
    public void Ligar(Contato realizarligacao){
        if (contato.nome == "Juliana"){
            System.out.println("Ligando para " + realizarligacao.nome);
        }
        else
            System.out.println("Telefone indisponível(O nome do contato não é Juliana)");
    }
}
