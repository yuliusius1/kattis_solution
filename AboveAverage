import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int jumlah_case = scan.nextInt();
        for(int i = 0; i < jumlah_case; i++){
            int jumlah_nilai = scan.nextInt();
            int nilai[] = new int[jumlah_nilai];
            float jumlah = 0;
            
            for(int j = 0; j < jumlah_nilai;j++){
                nilai[j] = scan.nextInt();
                jumlah += nilai[j];
            }
            
            float rata =  jumlah / (float)jumlah_nilai;
            float diatas = 0;
            for(int j = 0 ; j < jumlah_nilai; j++){
                if(nilai[j]>rata){
                    diatas++;
                }
                
            }
            float persen = diatas / (float)jumlah_nilai;
            
            System.out.printf("%.3f",persen*100);
            System.out.println("%");
        }
    }
}
