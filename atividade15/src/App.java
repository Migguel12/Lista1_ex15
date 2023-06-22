import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a quantidade de horas trabalhadas no mes: ");
        double horas = ler.nextDouble();
        System.out.println("");

        System.out.print("Informe o valor da hora trabalhada: ");
        double valor = ler.nextDouble();
        System.out.println("");

        double salarioBruto = horas * valor;
        System.out.printf("Salario bruto: %2.2f",salarioBruto);
        System.out.println("");

        double ir = 0.11*salarioBruto;
        System.out.printf("IR: %2.2f",ir);
        System.out.println("");

        double inss = 0.08*salarioBruto;
        System.out.printf("INSS: %2.2f",inss);
        System.out.println("");

        double sindicato = 0.05*salarioBruto;
        System.out.printf("Sindicato: %2.2f",sindicato);
        System.out.println("");

        double salarioLiquido = salarioBruto - sindicato - inss - ir;
        System.out.printf("Salario liquido: %2.2f",salarioLiquido);
        System.out.println("");
    }
}
