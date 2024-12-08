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

        GregorianCalendar dataNasc = new GregorianCalendar(ano, mes - 1, dia);

        Mulher mulher1 = new Mulher("Jessica", "Araújo", dataNasc);
        Mulher mulher2 = new Mulher("Talita", "Rodrigue", dataNasc);
        Mulher mulher3 = new Mulher("Maria", "Nery", dataNasc);
        Mulher mulher4 = new Mulher("Jenner", "Silva", dataNasc);
        Mulher mulher5 = new Mulher("Eduarda", "Monteiro", dataNasc);

        minhaListOrd.add(mulher1);
        minhaListOrd.add(mulher2);
        minhaListOrd.add(mulher3);
        minhaListOrd.add(mulher4);
        minhaListOrd.add(mulher5);
        


        Homem homem1 = new Homem("Antonio", "Souza", dataNasc);
        Homem homem2 = new Homem("Antonio", "Souza", dataNasc);
        Homem homem3 = new Homem("Antonio", "Souza", dataNasc);
        Homem homem4 = new Homem("Antonio", "Souza", dataNasc);
        Homem homem5 = new Homem("Antonio", "Souza", dataNasc);

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
            System.out.println("3 - Lista ordenada por altura em ordem crescente");
            System.out.println("4 - Lista ordenada por altura em ordem decrescente");
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




