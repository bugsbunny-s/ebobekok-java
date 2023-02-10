import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        int n1,n2;
        int ebob=1;
        int i;
        System.out.print("n1 sayısını giriniz : ");
        n1=inp.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        n2=inp.nextInt();

        i=n1;
        while (i>=1){
            i--; 
            if(n1%i==0 && n2%i==0){
              ebob=i;  
              break;
            }
        } 
        System.out.println("ebob : " + ebob);
        System.out.println("ekok : "+ (n1*n2)/ebob);
    }
}