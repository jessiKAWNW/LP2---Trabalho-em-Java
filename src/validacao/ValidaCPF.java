package validacao;
import java.util.InputMismatchException;

public class ValidaCPF {

    private static boolean sequenciaRepetida(String CPF) {

        char digito1 = CPF.charAt(0);

        for (int i = 1; i < CPF.length(); i++) {
            if (CPF.charAt(i) != digito1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isCPF(String cpfParaValidar) {

        if (cpfParaValidar.length() != 11 || sequenciaRepetida(cpfParaValidar)) {
            return false;
        }
        return validarDigitos(cpfParaValidar);
    }

    private static boolean validarDigitos(String cpfParaValidar) {
        try {
            char dig10, dig11;
            int sm, i, r, num, peso;

            sm = 0;
            peso = 10;

            for (i = 0; i < 9; i++) {
                num = (cpfParaValidar.charAt(i) - 48);
                sm += (num * peso);
                peso--;
            }

            r = 11 - (sm % 11);

            if(r == 10 || r == 11) {
                dig10 = '0';
            }else
                dig10 = (char)(r + 48);

            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = cpfParaValidar.charAt(i) - '0';
                sm += (num * peso);
                peso--;
            }

            r = 11 - (sm % 11);
            dig11 = (r == 10 || r == 11) ? '0' : (char) (r + '0');

            return (dig10 == cpfParaValidar.charAt(9)) && (dig11 == cpfParaValidar.charAt(10));

        } catch (InputMismatchException e) {
            return false;
        }
    }

    public static String cpfValido(String CPF) {
        
        if (!CPF.matches("[0-9.\\-/]*")) {
            System.out.println("Formato inválido: caracteres não permitidos.");
        }

        CPF = CPF.replaceAll("[^0-9]", "");

        if (isCPF(CPF)) {
            return CPF;
        }else {
            return null;
        }
    }

    public static long toLong(String CPF) {
        String cpfValido = cpfValido(CPF);
        return Long.parseLong(cpfValido);
    }

    public static String imprimeCPF(String cpf) {
        return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." +
                cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
    }
}
