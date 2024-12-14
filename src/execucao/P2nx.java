package execucao;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

import pessoa.Homem;
import pessoa.Mulher;
import pessoa.Pessoa;
import pessoa.PessoaIMC;
import validacao.ValidaCPF;
import validacao.ValidaData;

public class P2nx {

    static MinhaListaOrdenavel minhaListOrd = new MinhaListaOrdenavel();

    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    // public static void adicionarPessoa(PessoaIMC pessoa){
    //     minhaListOrd.add(pessoa);
    // }

    public static void main(String[] args) { 

        int ano = 2024;
        int mes = 11;
        int dia = 26;
        int ano2 = 2024;
        int mes2 = 8;
        int dia2 = 7;

        GregorianCalendar dataNasc = new GregorianCalendar(ano, mes - 1, dia);
        GregorianCalendar dataNasc2 = new GregorianCalendar(ano2, mes2 - 1, dia2);

        Mulher mulher1 = new Mulher("Jessica", "Araújo", dataNasc, "320.250.720-66", 80.0f, 1.69f);
        Mulher mulher2 = new Mulher("Talita", "Rodrigue", dataNasc,"101.712.610-03",60.0f,1.55f);
        Mulher mulher3 = new Mulher("Maria", "Nery", dataNasc, "462.647.460-88",80.0f,1.75f);
        Mulher mulher4 = new Mulher("Jenner", "Silva", dataNasc, "446.018.870-89",55.0f,1.62f);
        Mulher mulher5 = new Mulher("Eduarda", "Monteiro", dataNasc,"122.805.960-83",45.0f,1.57f);

        minhaListOrd.add(mulher1);
        minhaListOrd.add(mulher2);
        minhaListOrd.add(mulher3);
        minhaListOrd.add(mulher4);
        minhaListOrd.add(mulher5);
        


        Homem homem1 = new Homem("Antonio", "Souza", dataNasc2, "723.008.860-73",mes2-1,dia2);
        Homem homem2 = new Homem("Jose", "Mendes", dataNasc2, "776.482.320-14",mes2-1,dia2);
        Homem homem3 = new Homem("Marcos", "Soares", dataNasc2, "151.868.860-84",mes2-1,dia2);
        Homem homem4 = new Homem("Felipe", "Andrade", dataNasc2, "189.596.170-08",mes2-1,dia2);
        Homem homem5 = new Homem("Pedro", "Resende", dataNasc2, "626.690.710-07",mes2-1,dia2);

        minhaListOrd.add(homem1);
        minhaListOrd.add(homem2);
        minhaListOrd.add(homem3);
        minhaListOrd.add(homem4);
        minhaListOrd.add(homem5);


        System.out.println("Escolha uma das opções (NÚMERO):");
        System.out.println("1 - Imprimir lista:");
        System.out.println("2 - SAIR:");

        int opcao = scanner.nextInt(); 

        if(opcao == 1){
            System.out.println("Por qual critério deseja ordenar  a lista? (Escolha pelo núemero)");
            System.out.println("1 - Lista ordenada por peso em ordem crescente");
            System.out.println("2 - Lista ordenada por peso em ordem decrescente");
            System.out.println("3 - Lista ordenada por genero em ordem crescente");
            System.out.println("4 - Lista ordenada por genero em ordem decrescente");
            System.out.println("5 - Lista ordenada por nome em ordem crescente");
            System.out.println("6 - Lista ordenada por nome em ordem decrescente");
            System.out.println("7 - Lista ordenada por imc em ordem crescente");
            System.out.println("8 - Lista ordenada por imc em ordem decrescente");
            System.out.println("9 - Lista ordenada por idade em ordem crescente");
            System.out.println("10 - Lista ordenada por idade em ordem decrescente");
            System.out.println("11 - Lista ordenada por data de nascimento em ordem crescente");
            System.out.println("12 - Lista ordenada por data de nascimento em ordem decrescente");
            System.out.println("13 - Lista ordenada por cpf em ordem crescente");
            System.out.println("14 - Lista ordenada por cpf em ordem decrescente");

            int criterio = scanner.nextInt();

            ArrayList<PessoaIMC> listaOrdenada = minhaListOrd.ordena(criterio);

            for(PessoaIMC pessoa : listaOrdenada){
                System.out.println(pessoa.toString());
            }


        } else if(opcao == 2){
            System.out.println("Encerrado");
        }else {
            System.out.println("Opção inválida");
        }
    }

}




