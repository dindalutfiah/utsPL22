package DindaLutfiah;
import java.util.*;
public class tugasUTSPLA {
            public static void main(String[] args) {
            List<Integer> angka = new ArrayList<>();

            System.out.println("Masukkan 20 daftar angka yang unik, lalu pisahkan menggunakan spasi:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            scanner.close();

            String[] numberStrings = input.split(" ");
            for (String numberString : numberStrings) {
                int number = Integer.parseInt(numberString);
                angka.add(number);
            }

            boolean hasDuplicates = checkDuplicates(angka);
            System.out.println(hasDuplicates);
        }

        private static boolean checkDuplicates(List<Integer> angka) {
            Set<Integer> angkaUnik = new HashSet<>();
            for (int number : angka) {
                if (angkaUnik.contains(number)) {
                    return true;
                }
                angkaUnik.add(number);
            }
            return false;
        }
    }


