package pessoa;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;

import validacao.ValidaCPF;

public abstract class PessoaIMC extends Pessoa {

    protected float peso;
    protected float altura;

    public PessoaIMC(String nome, String sobreNome, GregorianCalendar dataNasc) {
        super(nome,sobreNome,dataNasc);
    }

    public PessoaIMC(String nome, String sobreNome, GregorianCalendar dataNasc, String numCPF,float altura,float peso) {
        super(nome,sobreNome,dataNasc,numCPF);
        this.altura = altura;   
        this.peso = peso;
    }

    private ArrayList list = new ArrayList<>();
    

    
    public void setList(ArrayList list) {
        this.list = list;
    }

    public float getPeso(){
        return peso;
    }
    public float getAltura(){
        return altura;
    }
    
  
    public float calculaIMC(){
        float imcValor = peso / (float) Math.pow(altura, 2);
        return imcValor;
    }

    public abstract String resultIMC();

    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(getDataNasc().getTime());
        
        return "Pessoa{" +
                "nome='" + getNome() + '\'' +
                ", dataNasc=" + dataFormatada +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

}
