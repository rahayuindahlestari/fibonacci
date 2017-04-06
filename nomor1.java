import java.util.Scanner;

public class nomor1 {

    public static void main(String[] args) {
		
        int num, i;
        int A = 1, B = 0, C;

        Scanner ler = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        num = ler.nextInt();
        
        for(i = 0; i<num; i++){
         C = A + B;
         A = B;
         B = C;
         
         System.out.print(C+", ");
        }
        
        
    }
    
}