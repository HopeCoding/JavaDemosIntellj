package JavaTraining.src;

import java.util.*;


class Solution {

    public static void main(String[] args) {
        int x=1;
            for(int i=0;i<3;i+=2){
            for(int j=0;j<2;j++){
                x+=3;
            }
        }
        System.out.println(x);
    }
}


/*
    12 SAATLİK ZAMAN DİLİMİNİ 24 SAATLİK DİLİME ÇEVİRİYOR.
    public static  void timeConversion(String s){
        String[] SS = s.split(":");
        if(s.substring(8, 10).equals("PM")){
            if(s.substring(0, 2).equals("12")){
                System.out.println(s.substring(0, 8));
            }
            else{
                int x =Integer.valueOf(SS[0])+12;
                System.out.println(String.valueOf(x)+s.substring(2, 8));
            }}
        else{
            if(s.substring(0, 2).equals("12")){
                System.out.println(s.substring(0, 2).replace("12", "00")+s.substring(2, 8));
            }
            else{
                System.out.println(s.substring(0, 8));}

        }
    }

     */





/*
class MyRegex
{
    String zeroTo255 = "([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|2[0-4][0-9]|25[0-5])";
    public String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;

}

 */



 /*
    000.000.000 İP şeklinde yazılan tüm ipleri geçerli sayılıp yanlışları geçersiz sayıyor.
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }

        */


/*
Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //toplam 15 karakter alınarak ve 3 basamak şeklinde yazılma şekli %-15s%03d%n
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

    }
 */


/*
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int sum=A.length()+B.length();
        System.out.println(sum);
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        A=A.substring(0,1).toUpperCase()+A.substring(1,A.length());
        B=B.substring(0,1).toUpperCase()+B.substring(1,B.length());
        System.out.println(A+" "+B);

         */




/* ANAGRAM KONTROLÜ MAİN VE FONKSİYON


        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        sc.close();
        boolean x=isAnagram(a,b);
        System.out.println((x)?"Anagrams":"Not Anagrams");
        }

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        boolean anagram = true;

        String a1 = a.toLowerCase();
        String a2 = b.toLowerCase();
        char[] c1 = a1.toCharArray();
        char[] c2 = a2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                anagram = false;
            }
        }

        return anagram;

    }

         */








 /*  Girilen cümleyi noktalama işaretleri kaldırıp alta alta yazan.
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String s1 = s.trim();
        if(s.trim().isEmpty()) System.out.println(0);
        else{
            String[] arrOfStr = s.trim().split("[ !,?._'@]+");
            System.out.println(arrOfStr.length);
            for (String a : arrOfStr) {
                System.out.println(a);
            }}
    }

         */