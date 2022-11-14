import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count,n1=0,n2=1,sum;

        Scanner scan=new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        count=scan.nextInt();

        System.out.print(n1+ " "+ n2);
        for (int i=2;i<count;++i){
            sum=n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }

    }
}