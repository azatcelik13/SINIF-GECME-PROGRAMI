package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat ,fizik,kimya,muzik,turkce;
        Scanner inp = new Scanner(System.in);



        System.out.println("Matematik Notunuzu giriniz");
        mat = inp.nextInt();
        while(mat<0||mat>100){
            System.out.println("yanlış bi değer girdiniz :");
            mat =inp.nextInt();
        }

        System.out.println("fizik Notunuzu giriniz");
        fizik = inp.nextInt();
        while(fizik<0||fizik>100){
            System.out.println("yanlış bi değer girdiniz :");
            fizik =inp.nextInt();
        }

        System.out.println("Kimya Notunuzu giriniz");
        kimya = inp.nextInt();
        while(kimya<0||kimya>100){
            System.out.println("yanlış bi değer girdiniz :");
            kimya =inp.nextInt();
        }

        System.out.println("Müzik Notunuzu giriniz");
        muzik = inp.nextInt();
        while(muzik<0||mat>100){
            System.out.println("yanlış bi değer girdiniz :");
            muzik =inp.nextInt();
        }



        System.out.println("Türkçe Notunuzu giriniz");
        turkce = inp.nextInt();
        while(turkce<0||turkce>100){
            System.out.println("yanlış bi değer girdiniz :");
            turkce =inp.nextInt();
        }

        int average;
        average=(mat+fizik+kimya+muzik+turkce)/5;
        System.out.println("ortalamanız:"+average);
        if (average>49&&average<100){
            System.out.println("SINIFI GEÇTİNİZ");
        }
        else if (average>0&&average<50){
            System.out.println("SINIFTA KALDINIZ");
        }else{
            System.out.println("BU İŞTE Bİ TERSLİK VAR ABİ");
        }









    }
}
