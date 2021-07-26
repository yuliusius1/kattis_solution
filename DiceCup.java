import java.util.Scanner;

public class DiceCup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,m,i,j,besar,kecil;
        n = scan.nextInt();
        m = scan.nextInt();
        if(n<m){
           besar = m;
           kecil = n;
        } else {
            besar = n;
            kecil = m;
        }
            
        for(i = kecil+1;i <= besar+1;++i){
            System.out.println(i);
        }
    }
}
