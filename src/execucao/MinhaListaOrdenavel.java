package execucao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;

import pessoa.PessoaIMC;
import validacao.ValidaCPF;

public class MinhaListaOrdenavel {

    ArrayList<PessoaIMC> pessoaList = new ArrayList<>();
    

    public void add(PessoaIMC p){
        pessoaList.add(p);
    }

    public PessoaIMC get(int i){
        if(i >= 0 && i < pessoaList.size()){
            return pessoaList.get(i);
        } else{
            System.out.println("Indíce não se encontra na lista.");
        }
        return null;
    }

    public static Comparator<PessoaIMC> pesoComparator = new Comparator<PessoaIMC>(){
        public int compare (PessoaIMC p1, PessoaIMC p2){
            double pf1, pf2;
            pf2 = (double) p2.getPeso();
            pf1 = (double) p1.getPeso();
            return (int) Math.round (pf2 - pf1);
        }
    };

    public static Comparator<PessoaIMC> alturaComparator = new Comparator<PessoaIMC>(){
        public int compare (PessoaIMC p1, PessoaIMC p2){ 
            double pf1, pf2;
            pf1 = (double) p2.getAltura();
            pf2 = (double) p1.getAltura();
            return Double.valueOf(pf1).compareTo(pf2);
        }
    };

    public static Comparator<PessoaIMC> nomeComparator = new Comparator<PessoaIMC>(){
        public int compare (PessoaIMC p1, PessoaIMC p2){ 
            String n1 = p1.getNome();
            String n2 = p2.getNome();
            return n1.compareTo(n2);
        }
    };

    public static Comparator<PessoaIMC> imcComparator = new Comparator<PessoaIMC>(){
        public int compare (PessoaIMC p1, PessoaIMC p2){ 
            float pf1, pf2;
            pf1 = (float) p1.calculaIMC();
            pf2 = (float) p2.calculaIMC();
            return Float.valueOf(pf1).compareTo(pf2);
        }
    };

    public static Comparator<PessoaIMC> idadeComparator = new Comparator<PessoaIMC>(){
        public int compare (PessoaIMC p1, PessoaIMC p2){ 
            int id1 = p1.calcularIdade();
            int id2 = p2.calcularIdade();
            return Integer.valueOf(id1).compareTo(id2);
        }
    };
    
    public static Comparator<PessoaIMC> dataNascComparator = new Comparator<PessoaIMC>(){
        public int compare (PessoaIMC p1, PessoaIMC p2){ 
            GregorianCalendar dt1 = p1.getDataNasc();
            GregorianCalendar dt2 = p2.getDataNasc();
            return dt1.compareTo(dt2);
        }
    };

    public static Comparator<PessoaIMC> cpfComparator = new Comparator<PessoaIMC>(){
        public int compare (PessoaIMC p1, PessoaIMC p2){ 
            String cpf1 = p1.getNumCPF();
            String cpf2 = p2.getNumCPF();
            
            Long cpf1Long = ValidaCPF.toLong(cpf1);
            Long cpf2Long = ValidaCPF.toLong(cpf2);


            return cpf1.compareTo(cpf2);
        }
    };


     public ArrayList ordena(int constante){
        switch (constante) {
            case 1:
                 Collections.sort(pessoaList,MinhaListaOrdenavel.pesoComparator);
                break;
            case 2:
                 Collections.sort(pessoaList,MinhaListaOrdenavel.pesoComparator.reversed());
                break;
            case 3:
                 Collections.sort(pessoaList,MinhaListaOrdenavel.alturaComparator);
                break;
            case 4:
                 Collections.sort(pessoaList,MinhaListaOrdenavel.alturaComparator.reversed());
                break;
            case 5:
                 Collections.sort(pessoaList,MinhaListaOrdenavel.nomeComparator);
                break;
            case 6:
                 Collections.sort(pessoaList,MinhaListaOrdenavel.nomeComparator.reversed());
                break;
            case 7:
                 Collections.sort(pessoaList,MinhaListaOrdenavel.imcComparator);
                break;
            case 8:
                 Collections.sort(pessoaList,MinhaListaOrdenavel.imcComparator.reversed());
                break;
            case 9:
                 Collections.sort(pessoaList,MinhaListaOrdenavel.idadeComparator);
                break;
            case 10:
                 Collections.sort(pessoaList,MinhaListaOrdenavel.idadeComparator.reversed());
                break;
            case 11:
                 Collections.sort(pessoaList,MinhaListaOrdenavel.dataNascComparator);
                break;
            case 12:
                 Collections.sort(pessoaList,MinhaListaOrdenavel.dataNascComparator.reversed());
                break;
            case 13:
                 Collections.sort(pessoaList,MinhaListaOrdenavel.cpfComparator);
                break;
            case 14:
                 Collections.sort(pessoaList,MinhaListaOrdenavel.cpfComparator.reversed());
                break;
            default:
                break;
        }
        return pessoaList;
    }

}
