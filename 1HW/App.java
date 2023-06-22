import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //summa();//Вычислить сумма чисел от 1 до n
        //prosto();//Вывести все простые числа от 1 до 1000
        //calculator();//Реализовать простой калькулятор
        //findNumber();//q + w = e НЕДОДЕЛАНО
    }


//Вычислить сумма чисел от 1 до n*********************************************
private static void summa() {
    Scanner iScanner = new Scanner(System.in);
    System.out.println("Input number n>0");
    int num = iScanner.nextInt();
    int rez=(num*(num+1))/2;
    System.out.println("Sum of numbers from 0 to "+ num+ " is "+ rez);
    }

//Вывести все простые числа от 1 до 1000*********************************************
private static void prosto() {
    int maxnum=1000;
    System.out.println("2"+" ");
    for (int i=3; i<=maxnum; i+=2){
        boolean simpleFlag=true;
        for (int j=3; j<=i/2; j+=2){
            if (i%j == 0)
            {simpleFlag=false; break;}
        }
        if (simpleFlag==true) {System.out.println(i +" ");}        
        }
    }

//Реализовать простой калькулятор**********************************
private static void calculator(){
    while (true) {  
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Input first number");
        double a = iScanner.nextDouble();
        System.out.println("Input operation - + / *");
        char operation = iScanner.next().charAt(0);
        System.out.println("Input second number");
        double b = iScanner.nextDouble();
        double rez=0;
        switch(operation) {
            case '-': rez = a - b; break;
            case '+': rez = a + b; break;
            case '/': rez = a / b; break;
            case '*': rez = a * b; break;
            default:  System.out.println("Wrong operation!"); break;
            }
        System.out.println("rezult is "+rez);
        }
    }

/* 
    //q + w = e, q, w, e >= 0. Некоторые цифры заменены знаком вопроса, восстановить выражение********
private static void findNumber(){
    Scanner iScanner = new Scanner(System.in);
    System.out.println("Input first number");
    String a = iScanner.nextLine();
    char[] charA = a.toCharArray();
    int numA=charA.length;
    int numSymA=findSymbol(charA,numA);
    int[] posSymA=positionSymbol(charA,numA,numSymA);
    
    System.out.println("Input second number");
    String b = iScanner.nextLine();
    char[] charB = b.toCharArray();
    int numB=charB.length;
    int numSymB=findSymbol(charB,numB);
    int[] posSymB=positionSymbol(charB,numB,numSymB);

    System.out.println("Input sum");
    String c = iScanner.nextLine();
    char[] charC = c.toCharArray();
    int numC=charC.length;
    int numSymC=findSymbol(charC,numC);
    int[] posSymC=positionSymbol(charC,numC,numSymC);


    if (numC<Math.max(numA,numB)){System.out.println("No dicision.Sum is too low");}
    if (numC>Math.max(numA,numB)+1){System.out.println("No dicision. Sum is too big");}

    static int findSymbol(char[] charS;int numS){
        int numSymbols=0;
        for (int i=0;i<numS;i++) {if (charS[i]=='?'){numSymbols++;}}
        return numSymbols;
    }

    static int[] positionSymbol(char[] charS; int numS; int numSymbols){
        int[] position=new int[numSymbols];
        int j=0;
        for (int i=0;i<numS;i++) {if (charS[i]=='?'){position[j]=i;j++;}}
        return position;
    }

    }
    */

}