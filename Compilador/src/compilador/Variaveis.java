package compilador;

/**
 *
 * @author luana
 */

public class Variaveis {
    String nome,
           tipo;
    int escopo;
    
    public Variaveis(String nome, String tipo, int escopo){
        this.nome = nome;
        this.escopo = escopo;
        this.tipo = tipo;
    }
    public Variaveis(){
        this("", "", -1);
    }
}
