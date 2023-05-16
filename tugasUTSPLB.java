package DindaLutfiah;
import java.util.*;
public class tugasUTSPLB {
        public static void main(String[] args) {
            System.out.println("Masukkan 20 daftar angka yang unik, lalu pisahkan menggunakan spasi:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            scanner.close();

            String[] stringNomor = input.split(" ");
            int[] angka = new int[stringNomor.length];
            for (int i = 0; i < stringNomor.length; i++) {
                angka[i] = Integer.parseInt(stringNomor[i]);
            }
            Map<Integer, Integer> hitunganAngka = menghitungAngka(angka);
            for (Map.Entry<Integer, Integer> entry : hitunganAngka.entrySet()) {
                int nomor = entry.getKey();
                int menghitung = entry.getValue();
                if (menghitung > 1) {
                    System.out.println(nomor + " ada " + menghitung);
                }
            }
        }
        private static Map<Integer, Integer> menghitungAngka(int[] angka) {
            Map<Integer, Integer> hitunganAngka = new HashMap<>();
            for (int nomor : angka) {
                int menghitung = hitunganAngka.getOrDefault(nomor, 0);
                hitunganAngka.put(nomor, menghitung + 1);
            }
            return hitunganAngka;
        }
    }


