package perfectNumber.src;

public class Main {

    public static void main(String[] args) {

        int total=0;
        int number=6;

        for (int i=1;i<=number;i++){

            if(number%i==0) total=total+i;
        }


        System.out.println(total+"\n");
        if(number*2==total) System.out.println("Perfect Number");
        else System.out.println("Not Perfect Number");
    }
}
