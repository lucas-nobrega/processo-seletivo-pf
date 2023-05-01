import java.util.Scanner;

public class Casamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        scanner.close();
        // Igualando o tamanho das strings
        while (A.length() != B.length()) {
            if (A.length() > B.length()) {
                B = "0" + B;
            } else {
                A = "0" + A;
            }
        }
        // Criando as strings auxiliares para armazenar os novos valores de A e B após a comparação e remoção dos caracteres
        String auxA = "";
        String auxB = "";
        for (int i = 0; i < A.length(); i++) {
            // Convertendo char para int
            int charA = A.charAt(i) - '0';
            int charB = B.charAt(i) - '0';
            // Comparando os numeros e armazenando nas strings auxiliares
            if (charA > charB) {
                auxA = auxA + charA;
            }
            if (charA < charB) {
                auxB = auxB + charB;
            }
            // Se forem iguais, armazena nas duas strings auxiliares
            if (charA == charB) {
                auxA = auxA + charA;
                auxB = auxB + charB;
            }
        }
        // Se as strings auxiliares estiverem vazias, significa que não há nenhum número maior ou menor, então imprime -1
        if (auxA.length() == 0) {
            auxA = "-1";
        }
        if (auxB.length() == 0) {
            auxB = "-1";
        }
        // Imprimindo os valores em ordem crescente
        if (Integer.parseInt(auxA) < Integer.parseInt(auxB)) {
            System.out.println(Integer.parseInt(auxA));
            System.out.println(Integer.parseInt(auxB));
        }else{
            System.out.println(Integer.parseInt(auxB));
            System.out.println(Integer.parseInt(auxA));
        }
    }
}