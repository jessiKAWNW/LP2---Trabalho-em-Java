package pessoa;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pessoa {

    private String nome;
    private String sobreNome;
    private GregorianCalendar dataNasc;
    private String numCPF;
    // private float peso;
    // private float altura;

    public Pessoa(String nome, String sobreNome, GregorianCalendar dataNasc) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataNasc = dataNasc;
    }

    public Pessoa(String nome, String sobreNome, GregorianCalendar dataNasc, String numCPF) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataNasc = dataNasc;
        this.numCPF = numCPF;
    //     this.peso = peso;
    //     this.altura = altura;
    }

    public Pessoa(String string, String string2, int i, int j, int k) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public GregorianCalendar getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(GregorianCalendar dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNumCPF() {
        return numCPF;
    }

    public void setNumCPF(String numCPF) {
        this.numCPF = numCPF;
    }

    // public float getPeso() {
    //     return peso;
    // }

    // public void setPeso(float peso) {
    //     this.peso = peso;
    // }

    // public float getAltura() {
    //     return altura;
    // }

    // public void setAltura(float altura) {
    //     this.altura = altura;
    // }

    public int calcularIdade() {
        Calendar hoje = Calendar.getInstance();
        int anoAtual = hoje.get(Calendar.YEAR);
        int anoNascimento = dataNasc.get(Calendar.YEAR);

        int idade = anoAtual - anoNascimento;

        int mesAtual = hoje.get(Calendar.MONTH);
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);
        int mesNascimento = dataNasc.get(Calendar.MONTH);
        int diaNascimento = dataNasc.get(Calendar.DAY_OF_MONTH);

        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idade--;
        }

        return idade;
    }

    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", Idade =" + calcularIdade() +
                ", numCPF=" + numCPF 
                // ", peso=" + peso +
                // ", altura=" + altura +
                // '}'
                ;
    }
}
