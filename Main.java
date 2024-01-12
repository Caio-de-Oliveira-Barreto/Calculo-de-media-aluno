import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // instanciando o Scanner
        Scanner scanner = new Scanner(System.in);

        // receber a 1º nota
        System.out.println("Informe a 1° nota do aluno: ");
        double nota1 = scanner.nextDouble();

        // receber a 2º nota
        System.out.println("Informe a 2° nota do aluno: ");
        double nota2 = scanner.nextDouble();

        // receber a 3º nota
        System.out.println("Informe a 3° nota do aluno: ");
        double nota3 = scanner.nextDouble();

        // receber a 4º nota
        System.out.println("Informe a 4° nota do aluno: ");
        double nota4 = scanner.nextDouble();

        // calcular a media
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // condições de aprovação, recuperação ou reprovação
        if (media >= 7) {
            System.out.println("aluno aprovado, sua media é: " + media);
        }else if (media < 7 && media >= 5){
            System.out.println("aluno em recuperação, sua media é: " + media);
        }else {
            System.out.println("aluno reprovado, sua media é: " + media);
        }
    }
}