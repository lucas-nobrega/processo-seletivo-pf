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
        String auxA = "";
        String auxB = "";
        for (int i = 0; i < A.length(); i++) {
            // Convertendo char para int
            int charA = A.charAt(i) - '0';
            int charB = B.charAt(i) - '0';

            if (charA > charB) {
                auxA = auxA + charA;
                
            }
            if (charA < charB) {
                auxB = auxB + charB;
            }
            if (charA == charB) {
                auxA = auxA + charA;
                auxB = auxB + charB;
            }
        }
        if (auxA.length() == 0) {
            auxA = "-1";
        }
        if (auxB.length() == 0) {
            auxB = "-1";
        }
        if (Integer.parseInt(auxA) < Integer.parseInt(auxB)) {
            System.out.println(Integer.parseInt(auxA));
            System.out.println(Integer.parseInt(auxB));
        }else{
            System.out.println(Integer.parseInt(auxB));
            System.out.println(Integer.parseInt(auxA));
        }
    }
}