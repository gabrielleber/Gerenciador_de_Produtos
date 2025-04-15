import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite um nome para cadastrar: ");
            String Nome = scanner.nextLine();
            nomes.add(Nome);

            System.out.println("Deseja Cadastrar outro nome? (True / False)");
            continuar = scanner.nextBoolean();
            scanner.nextLine();

        }

        System.out.println("Nomes Cadastrados: ");
        for (String Nome : nomes) {
            System.out.println(Nome);
        }

        scanner.close();


    }
}


