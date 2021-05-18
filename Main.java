package com.company;

public class Main {

    public static void main(String[] args) {
        String hel = new String(" \"Hello World!\"");
        System.out.println(hel);
        String as = new String("\"qqqqwertyuiopasdfghjklzxcvbnm\"");
        System.out.println(as);
        byte a = -99;
        short b = 0x70ed;
        int c = 1;
        int j = 1245847883;
        long d = 1890054467;
        float n = (float) 2.1;
        double e = (double) 4.20 + 3.10d;
        double f = 33.20 * 2;
        char g = 95;//является псевдоцелочислленным типом,поэтому можно создавать в виде числа(UTF16,таблица)

        boolean h = true;
        System.out.println("Привет друг" + (a / 1) + b * 9 + (c * 9) + (d - g) + h + e + n);
        String[] apple = new String[4];
        apple[0] = "Green";
        apple[1] = "Yellow";
        apple[2] = "Red";
        for (int l = 0; l < 4; l++) {
            System.out.println(apple[l]);
        }
        ;

        double qw = 0.0;
        double qa = 1;
        int qs = 1;
        int qz = 0;
        System.out.println(qw / qa);
        System.out.println(qw / qz);

        System.out.println(qa / qw);
        System.out.println(qa / qz);//doub 1/0 int=Infinity
        // System.out.println(qs/qz); int 1/0 int = exception
        System.out.println(qz / qs); //0/1= 0

        System.out.println(qz / qw);
        System.out.println(qs / qa);
        System.out.println(qs / qw);
        // (1234567890-=!@#$%^&*()YUIOP[]\ASDFGHJKL;'ZXCVBNM,.
        // ||\\/??/,,.ЁЁ`~~/qwertyuiop{}|asdfghjkl:"zxcvbnm<>?')

        System.out.println(args);

       // System.out.println(args[0]);

        System.out.println(args[1]);


        int wr =1*9;

        //+-*/ %-остаток от деления (5 орифметических действий)
        //for,while,do while,switch case,foreach (для каждого элемента массива,будет что-то делаться)

       // for (int gh=0;gh<args.length; i++) {
          //  System.out.println(gh[0]);
        }
    }

