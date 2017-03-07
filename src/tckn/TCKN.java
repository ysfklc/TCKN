package tckn;
import java.util.Scanner;
public class TCKN {
    public static void main(String[] args) {
        System.out.print("Input a TCKN :");
        Scanner input = new Scanner(System.in); 
        String num = input.next();
        if(num.length()==11){
            char dizi[] = num.toCharArray();
            int[]dizi1= new int[dizi.length];
            for(int i=0;i<dizi.length;i++){
                dizi1[i]=Integer.parseInt(dizi[i]+"");
            }
            if(dizi1[0]!=0){ 
                int tek;
                int cift;
                int toplam,mod;
                tek=dizi1[0]+dizi1[2]+dizi1[4]+dizi1[6]+dizi1[8];
                cift= dizi1[1]+dizi1[3]+dizi1[5]+dizi1[7];
                toplam=((tek*7)-cift)%10;
                mod=(tek+cift+dizi1[9])%10;
                if(toplam==dizi1[9] && mod==dizi1[10]){
                        System.out.println("Valid TCKN");
                }
                else{
                    System.out.println("Invalid TCKN");
                }  
            }
            else{
                System.out.println("Invalid TCKN");
            }
        }
        else{
            System.out.println("Invalid TCKN");
        }
    }
}
