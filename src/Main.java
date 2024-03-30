import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma data no formato (dd/MM/yyyy): ");
        String dataString = scan.nextLine();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        // Fazendo uso do método parse () para converter de String para Date
        Date dataFormatada = formato.parse(dataString);

        // Criando um objeto SimpleDateFormat para formatar a data em uma string
        SimpleDateFormat  formatoData = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy");
        String dataFormatadaString = formatoData.format(dataFormatada);
        System.out.println("Data formatada: " + dataFormatadaString);
    }
}