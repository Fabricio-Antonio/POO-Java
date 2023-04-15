import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;


public class Temp {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();
        Scanner input = new Scanner(System.in);
        double linha = 24;
        double coluna = 2;
        int l;
        int c;
        int x;
        int y;
        double aux;
        double[][] matriz = new double[(int) linha][(int) coluna];
        System.out.println("===== INICIANDO CAPTURA DADOS | TEMPERATURA 🌡️ =====");
        for (l = 0; l < linha; l++) {
            for (c = 0; c < coluna; c++) {
                Format formato = new SimpleDateFormat("HH:mm");
                agora.add(Calendar.MINUTE, 30);
                formato = new SimpleDateFormat("HH:mm");
                System.out.println(" ");
                System.out.println("⌚ Horário da Medição: " + formato.format(agora.getTime()));
                input.useLocale(Locale.US);
                System.out.printf("🌡️ Digite a Temperatura atual: ");
                matriz[l][c] = input.nextDouble();
            }
        }
        for (l = 0; l < linha; l++) {
            for (c = 0; c < coluna; c++) {
                for (x = 0; x < linha; x++) {
                    for (y = 0; y < coluna; y++) {
                        if (matriz[l][ c] < matriz[x][y]) {
                            aux = matriz[l][c];
                            matriz[l][c] = matriz[x][y];
                            matriz[x][y] = aux;
                        }
                    }
                }
            }
        }
        System.out.println("===== 🌡️ RELATÓRIO DE REGISTROS DA TEMPERATURA 🌡️ =====");
        for (l = 0; l < linha; l++) {
            for (c = 0; c < coluna; c++) {
                System.out.printf("Temperatura: " + matriz[l][c] + "°C 🌡️");
                System.out.println("");
            }
        }
    }
} 