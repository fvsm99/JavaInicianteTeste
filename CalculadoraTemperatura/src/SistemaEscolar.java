import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];
        
        System.out.println("Digite as 8 notas anuais (2 por bimestre):");
        
        // Recebe as 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        
        // Calcula médias bimestrais (média de 2 notas)
        double bimestre1 = (notas[0] + notas[1]) / 2;
        double bimestre2 = (notas[2] + notas[3]) / 2;
        double bimestre3 = (notas[4] + notas[5]) / 2;
        double bimestre4 = (notas[6] + notas[7]) / 2;
        
        // Calcula médias semestrais (média de 2 bimestres)
        double semestre1 = (bimestre1 + bimestre2) / 2;
        double semestre2 = (bimestre3 + bimestre4) / 2;
        
        // Calcula média final (média de todos os bimestres)
        double mediaFinal = (bimestre1 + bimestre2 + bimestre3 + bimestre4) / 4;
        
        // Exibe os resultados
        System.out.println("\nResultados:");
        System.out.println("1o Bimestre: " + bimestre1);
        System.out.println("2o Bimestre: " + bimestre2);
        System.out.println("1o Semestre: " + semestre1);
        System.out.println("----------------------");
        System.out.println("3o Bimestre: " + bimestre3);
        System.out.println("4o Bimestre: " + bimestre4);
        System.out.println("2o Semestre: " + semestre2);
        System.out.println("-----------------------");
        System.out.println("Média Final: " + mediaFinal);
        
        scanner.close();
    }
}