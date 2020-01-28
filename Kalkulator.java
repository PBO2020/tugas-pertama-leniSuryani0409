package kalkulator;
import java.util.Scanner;
public class Kalkulator {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        main m = new main();
        System.out.println("Silahkan pilih menu yang diinginkan : ");
        int b = s.nextInt();
        switch(b){
            case 1 :System.out.println("TAMBAH : ");
                    System.out.print("angka ke -1 : ");
                    int a = s.nextInt();
                    System.out.print("angka ke 2 : ");
                    int d = s.nextInt();
                    m.settotaltambah(a, d);
                System.out.println("Jawaban = "+ a + " + " + d + " =" + m.gettotal());
            break;
            case 2 :System.out.println("KALI : ");
                    System.out.print("angka ke -1 :");
                    int k = s.nextInt();
                    System.out.print("angka ke 2 : ");
                    int l = s.nextInt();
                    m.settotaltambah(k, l);
                System.out.println("Jawaban = "+ k + " X " + l + " =" + m.gettotal());
            break;
            case 3 :System.out.println("KURANG : ");
                    System.out.print("angka ke -1 :");
                    int u = s.nextInt();
                    System.out.print("angka ke 2 :");
                    int n = s.nextInt();
                    m.settotaltambah(u, n);
                System.out.println("Jawaban = "+ u + " - " + n + " =" + m.gettotal());
            break;
            case 4 :System.out.println("BAGI : ");
                    System.out.print("angka ke -1 : ");
                    int o = s.nextInt();
                    System.out.print("angka ke 2 : ");
                    int p = s.nextInt();
                    m.settotaltambah(o, p);
                System.out.println("Jawaban = "+ o + " / " + p + " =" + m.gettotal());
            break;
            default : System.out.println("maaf pilihan anda salah silahkan coba kembali");
                
        }
        
    }
    
}
