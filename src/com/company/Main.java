package com.company;

import java.util.Scanner;



public class Main {

    private static final boolean A = true;
    private static final boolean B = true;
    private static final boolean C = true;

    public static void main(String[] args) {




        System.out.println();
        Less1 i1 = new Less1();
        i1.less1();


        System.out.println();
        Less2 i2 = new Less2();
        i2.less2();

        System.out.println();
        Less3 i3 = new Less3();
        i3.less3();

        System.out.println();
        Less4 i4 = new Less4();
        i4.less4();

        System.out.println();
        Less5 i5 = new Less5();
        i5.less5();

        System.out.println();
        Less6 i6 = new Less6();
        i6.less6();

        System.out.println();
        Less7 i7 = new Less7();
        i7.less7();

        System.out.println();
        Less8 i8 = new Less8();
        i8.less8();

        System.out.println();
        Less9 i9 = new Less9();
        i9.less9();

        System.out.println();
        Less10 i10 = new Less10();
        i10.less10();

        System.out.println();
        Less11 i11 = new Less11();
        i11.less11();

        System.out.println();
        Less12 i12 = new Less12();
        i12.less12();

        System.out.println();
        Less13 i13 = new Less13();
        i13.less13();

        System.out.println();
        Less14 i14 = new Less14();
        i14.less14();

        System.out.println();
        Less15 i15 = new Less15();
        i15.less15();

        System.out.println();
        Less16 i16 = new Less16();
        i16.less16();

    }
    
}

//Первый
class Less1{
    void less1(){
        System.out.println("Hello World!");
    }

}


//Второй
class Less2{
    void less2(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите имя и фамилию : ");
        String name = scanner.next();
        String surname = scanner.next();
        System.out.println(name);
        System.out.println(surname);
    }

}


//Третий
class Less3{
    void less3(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Ведите второе число");
        int num2 = scanner.nextInt();

        int plus = num1 + num2;
        int minus = num1 - num2;
        int dil = num1 / num2;
        int umn = num1 * num2;

        System.out.println(" Сложение : " + plus + "\n Вычитание : " + minus + "\n Диление : " + dil + "\n Умножение : " + umn);
    }
}


// Четверый
class Less4{
    void less4(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; arr.length > i; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}


//Пятый
class Less5{
    void less5(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведите градусы в ференгейтах : ");
        double f = scanner.nextDouble();
        double celsi = (f - 32) * 5 / 9;
        System.out.println(celsi);
    }
}


//Шестой
class Less6 {
    void less6(){
        System.out.print("Ведите число миниму 3-х значное: ");
        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();
        int suma = 0;
        while (c > 0)
        {
            int res1 = c % 10;
            suma += res1;
            c /= 10;
        }
        System.out.println(suma);
    }
}



//Седьмой
class Less7{
    void less7(){
        String[][] arr = { {"1x1 = 1", "2x1 = 2", "3x1 = 1", "4x1 = 4", "5x1 = 5", "6x1 = 6", "7x1 = 7", "8x1 = 8", "9x1 = 9\n"},
                {"1x2 = 2", "2x2 = 4", "3x2 = 6", "4x2 = 8", "5x2 = 10", "6x2 = 12", "7x2 = 14", "8x2 = 16", "9x2 = 18\n"},
                {"1x3 = 3", "2x3 = 6", "3x3 = 9", "4x3 = 12", "5x3 = 15", "6x3 = 18", "7x3 = 21", "8x3 = 24", "9x3 = 27\n"},
                {"1x4 = 4", "2x4 = 8", "3x4 = 12", "4x4 = 16", "5x4 = 20", "6x4 = 24", "7x4 = 28", "8x4 = 32", "9x4 = 36\n"},
                {"1x5 = 5", "2x5 = 10", "3x5 = 15", "4x5 = 20", "5x5 = 25", "6x5 = 30", "7x5 = 35", "8x5 = 40", "9x5 = 45\n"},
                {"1x6 = 6", "2x6 = 12", "3x6 = 18", "4x6 = 24", "5x6 = 30", "6x6 = 36", "7x6 = 42", "8x6 = 48", "9x6 = 54\n"},
                {"1x7 =7", "2x7 = 14", "3x7 = 21", "4x7 = 28", "5x7 = 35", "6x7 = 42", "7x7 = 49", "8x7 = 56", "9x7 = 63\n"},
                {"1x8 = 8", "2x8 = 16", "3x8 = 24", "4x8 = 32", "5x8 = 40", "6x8 = 48", "7x8 = 56", "8x8 = 64", "9x8 = 72\n"},
                {"1x9 = 9", "2x9 = 18", "3x9 = 27", "4x9 = 36", "5x9 = 45", "6x9 = 54", "7x9 = 63", "8x9 = 72", "9x9 = 81\n"},};

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}



//Восьмой
class Less8{
    void less8(){
        System.out.print("Ведите предел чисел фибаначи : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }

        for (int i = 0; f[i] < n; ++i) {
            System.out.println(f[i]);
        }
    }
}


// Девятый
class Less9 {
    void less9() {

        System.out.println("Ведите номер от 1 - 7 : ");
        Scanner scanner = new Scanner(System.in);
        int week = scanner.nextInt();
        switch (week) {
            case (1):
                System.out.println("Monday");
                break;
            case (2):
                System.out.println("Tuesday");
                break;
            case (3):
                System.out.println("Wednesday");
                break;
            case (4):
                System.out.println("Thursday");
                break;
            case (5):
                System.out.println("Friday");
                break;
            case (6):
                System.out.println("Saturday");
                break;
            case (7):
                System.out.println("Sunday");
                break;
        }
    }
}



//Десятый
class Less10{
    void less10(){
        System.out.print("Ведите количество строк : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int num= 1;


        for (int i = 1; i <= number; i++)
        {
            for (int j = 1; j < i + 1; j++)
            {
                System.out.print(num++ + " ");
            }

            System.out.println("");
        }
    }
}

//Одинацатый
class Less11{
    void less11(){

        int[] arr = {1,-2,3,-4,5,6,7,-8,9,-10};
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minId = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minId = j;
                }
            }
            // замена
            int temp = arr[i];
            arr[i] = min;
            arr[minId] = temp;
            System.out.print(arr[i] + " ");

        }

    }
}



//Двенадцатый
class Less12{
    void less12(){

        double sum = 0, k = 0;
        double[] arr = {1.09,-2,3.4,-4,5.34,6,7,-8.1,9,-10};
        for (int i = 0; i < arr.length; i++) {
            int pol = 0;
            if (arr[i] > pol) {
                sum += arr[i];
                k++;
            }
        }
        System.out.println(sum/k);

    }

}



//Тренадцатый
class Less13{
    void less13(){

        int min = 0, max = 0;
        int[] arr = {1,-2,3,-4,5,6,7,-8,9,-10};
        for (int i = 0; i < arr.length; i++) {
            int pol = 0;
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            int pol = 0;
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }

}



//Чертынадцтый
class Less14{
    void less14(){

        int[] arr = {1, -2, 3, -4, 1, 6, 7, -8, 9, -10};
        int lenght = 0;
        for (int i = 0; i < arr.length; i++) {

            lenght++;
        }
        for (int i = lenght - 1; i >= 0; i--){
            System.out.println(arr[i]);

        }

    }

}


//Петнадцатый
class Less15{
    void less15(){

        int[] arr = {1, -2, 3, -4, 1, 6, 7, -8, 9, -10};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }

        }

    }

}


//Шестнадцатый
class Less16{
    void less16(){

        int[] arr = {1, 2, 3, -4, 1, 6, 1, 7, 9, -10};
        int[] arr1 = {1, 2, 13, -14, 81, 11, 7, 7, 49, 100};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr1[i]) {
                System.out.print(arr[i] + " ");
            }
        }

    }

}