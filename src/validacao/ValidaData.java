package validacao;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class ValidaData {

        enum Mes {
            JANEIRO(1), FEVEREIRO(2), MARCO(3), ABRIL(4),
            MAIO(5), JUNHO(6), JULHO(7), AGOSTO(8),
            SETEMBRO(9), OUTUBRO(10), NOVEMBRO(11), DEZEMBRO(12);

            private final int numero;

            Mes(int numero) {
                this.numero = numero;
            }

            public int getNumero() {
                return numero;
            }

            public static Mes fromString(String mes) {
                try {
                    int numeroMes = Integer.parseInt(mes);
                    return fromNumero(numeroMes);
                } catch (NumberFormatException e) {
                    try {
                        return Mes.valueOf(mes.toUpperCase());
                    } catch (IllegalArgumentException ex) {
                        return null;
                    }
                }
            }

            public static Mes fromNumero(int numero) {
                for (Mes mes : Mes.values()) {
                    if (mes.getNumero() == numero) {
                        return mes;
                    }
                }
                return null;
            }
        }

        public static boolean isDiaValido(int dia) {
            return dia >= 1 && dia <= 31;
        }

        public static boolean isMesValido(String mes) {
            return Mes.fromString(mes) != null;
        }

        public static boolean isAnoValido(int ano) {
            int anoCorrente = Calendar.getInstance().get(Calendar.YEAR);
            return ano >= (anoCorrente - 120) && ano <= anoCorrente;
        }

        public static boolean isDataValida(int dia, String mesStr, int ano) {
            if (!isDiaValido(dia) || !isAnoValido(ano) || !isMesValido(mesStr)) {
                return false;
            }

            Mes mes = Mes.fromString(mesStr);
            if (mes == null) return false;

            int mesNumero = mes.getNumero();
            return isDataValida(dia, mesNumero, ano);
        }

        public static boolean isDataValida(int dia, int mes, int ano) {
            if (!isDiaValido(dia) || !isAnoValido(ano)) {
                return false;
            }

            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setLenient(false);

            try {
                calendar.set(ano, mes - 1, dia); 
                calendar.getTime(); 
                return true;
            } catch (Exception e) {
                return false;
            }
        }

    }
