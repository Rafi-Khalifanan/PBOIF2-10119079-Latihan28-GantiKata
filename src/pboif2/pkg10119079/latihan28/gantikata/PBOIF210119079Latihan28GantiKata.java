package pboif2.pkg10119079.latihan28.gantikata;

import java.util.Scanner;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:   coding mengganti kada dalam kalimat
 *
 */
public class PBOIF210119079Latihan28GantiKata {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Kalimat,a,b;
        
        System.out.print("===Program Mengganti Kata===");
        System.out.println();
        System.out.print("Masukan Kalimat : ");
        Kalimat = input.nextLine();
        
        System.out.print("Ganti kata: ");
        a = input.next();
        
        System.out.print("Menjadi kata: ");
        b = input.next();
         
        String Bkalimat = Kalimat.replace(a , b);
        System.out.println("=======Hasil Formatting=======");
        System.out.println("Kalimat awal: " + Kalimat);
        System.out.println("Kalimat baru: " + Bkalimat);
    }
    
}
