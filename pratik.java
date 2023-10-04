import java.util.Scanner;
public class pratik {
    public static void main(String[] args) {
        int i , k;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü Alınacak sayıyı yazınız : ");
        i = inp.nextInt();
        System.out.print("Üs olacak sayıyı yazınız : ");
        k = inp.nextInt();
        int total = 1;
        int s = 1;
        while(s <=k){
            total *=i;
            s++;
        }
        System.out.println("CEVAP : " + total);
    }
    
}

