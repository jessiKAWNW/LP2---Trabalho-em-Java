package pessoa;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Homem extends PessoaIMC{

    public Homem(String nome, String sobreNome, GregorianCalendar dataNasc) {
        super(nome, sobreNome, dataNasc);
    }

    public Homem(String nome, String sobreNome, GregorianCalendar dataNasc, String numCPF,float peso,float altura) {
        super(nome, sobreNome, dataNasc, numCPF,peso,altura);
    }

    public String resultIMC(){

        float imcValor = calculaIMC();
        String imcPessoa = null;

        if(imcValor < 19){
            return imcPessoa = "Abaixo do peso ideal";
        }else if(19 <= imcValor && imcValor < 25.8) {
            return imcPessoa = "Peso ideal";
        }
        return imcPessoa = "Acima do peso ideal";
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(getDataNasc().getTime());

        return "Nome: " + getNome() + 
        "  Sobrenome: " + getSobreNome() +
        "  Data de Nascimento: " + dataFormatada +
        "  Peso: " + getPeso() +
        "  Altura: " + getAltura() +
        "  Gênero: Homem" +
        "  IMC: " + resultIMC();
    }
    

}
