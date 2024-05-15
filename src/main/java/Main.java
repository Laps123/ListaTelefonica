import java.util.Arrays;
import java.util.Scanner;

class Main {
    static class MinhaString implements Comparable<MinhaString> {
        String s1;

        public MinhaString(String s1) {
            this.s1 = s1;
        }

        @Override
        public int compareTo(MinhaString outra) {
            return this.s1.compareTo(outra.s1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int t = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            MinhaString[] sstrings = new MinhaString[t];

            for (int i = 0; i < t; i++) {
                String entrada = scanner.nextLine();
                sstrings[i] = new MinhaString(entrada);
            }

            Arrays.sort(sstrings);

            int ans = 0;
            for (int i = 1; i < t; ++i) {
                String atual = sstrings[i].s1;
                String anterior = sstrings[i - 1].s1;
                int j;
                for (j = 0; j < atual.length(); ++j) {
                    if (atual.charAt(j) != anterior.charAt(j)) {
                        break;
                    }
                    ++ans;
                }
            }

            System.out.println(ans);
        }

        scanner.close();
    }
}
