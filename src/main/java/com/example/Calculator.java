package com.example;

public class Calculator {
    int a = 10;
    int b = 5;
    public int AplusB() {
        return a + b;
    }
    public int AminusB(){
     return a - b;
    }
}
 class Aplication
{
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        Calculator liczydlo = new Calculator();

  int wynik1 = liczydlo.AplusB();
int wynik2 = liczydlo.AminusB();
System.out.println(wynik1);
System.out.println(wynik2);
    }}
