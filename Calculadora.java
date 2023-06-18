/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author Lenovo
 */
public class Calculadora { // defino la clase Calculadora
    private int entero;//defino el entero como atributo privado int 
    private float flotante;//defino el flotente como atributo privado float 
    private double doble;//defino el double como atributo privado double
    
    public Calculadora() { //constructor fijo de la calculadora
        entero = 0;  //inicio los valores de los atributos en un valor fio
        flotante = 0.0f;
        doble = 0.0;
    }

    public static void main(String[] args) {//main para pruebas
        Calculadora calculadora = new Calculadora(); //nuevo objeto tipo Calculadora

        int modulo = calculadora.modulo(10, 3); //entero llaado modulo que sera lo que regres eel metodo modulo
        System.out.println("Módulo: " + modulo); //imprimo modulo

        modulo = calculadora.modulo(15, 7); //de nuevo ejecutomodulo con diferentes valores
        System.out.println("Módulo: " + modulo);
    }
    //constructor que recibe los 3 tipo de datos
    public Calculadora(int entero, float flotante, double doble) {
        //asigno los argumentos a losatributos de la clase mediete this para evitar ambiguedad
        this.entero = entero;
        this.flotante = flotante;
        this.doble = doble;
    }
    //metodo sobrecargado suma que recibe 2 enteros 
    public int suma(int a, int b) {
        //regreso lasuma de los 2 enteros
        return a + b;
    }
    //metodo sobrecargado suma que recibe 2 flotantes
    public float suma(float a, float b) {
        //regreso lasuma de los 2 flotantes
        return a + b;
    }
    //metodo sobrecargado suma que recibe 2 doubles
    public double suma(double a, double b) {
        //regreso lasuma de los 2 doubles
        return a + b;
    }
    //metodo sobrecargado resta que recibe 2 enteros
    public int resta(int a, int b) {
        //regreso la resta de los 2 enteros
        return a - b;
    }
    //metodo sobrecargado resta que recibe 2 flotantes
    public float resta(float a, float b) {
        //regreso la resta de los 2 flotantes
        return a - b;
    }
    //metodo sobrecargado resta que recibe 2 doubles
    public double resta(double a, double b) {
        //regreso la resta de los 2 doubles
        return a - b;
    }
    //metodo multiplicacio que recibe como argumentos dos enteros
    public int multiplicacion(int a, int b) {
        int resultado = 0; //variable entera resultado es declarada e inicia en 0

        // Si b es negativo, multiplicamos por -1 y cambiamos el signo del resultado final
        if (b < 0) {
            a = -a;
            b = -b;
        }
        //ciclo desde 0 hasta b que se ejecutara de 1 en 1
        for (int i = 0; i < b; i++) {
            //a resultado se de semara el valor de a, b veces
            resultado += a;
        }
        //terminado el ciclo regresamos el valor de resultado
        return resultado;
    }
    //metodo division que tiene como argumentos dos enteros 
    public int division(int a, int b) {
        int cociente = 0;//se declara un entero llamado cociente que inicia en 0

        // Si b es negativo, dividimos por -1 y cambiamos el signo del cociente final
        if (b < 0) {
            a = -a;
            b = -b;
        }
        //bucle mientras a sea mayor o igual a b
        while (a >= b) {
            a -= b; //a a se le restara b
            cociente++; //el contador cociente aumenta en 1 es decir cabe una vez cada que se ejecute el bucle
        }
        //terminado el bucle regresamos el valor de cociente que es las veces que cabe b en a 
        return cociente;
    }
    //metodo sobrecargado multiplicacion que recibe 2 floats
    public float multiplicacion(float a, float b) {
        return a * b; //regresamos la multiplicacion de a por b
    }
    //metodo sobrecargado multiplicacion que recibe 2 doubles
    public double multiplicacion(double a, double b) {
        return a * b;//regresamos la multiplicacion de a por b
    }
    //metodo sobrecargado division que recibe 2 floats
    public float division(float a, float b) {
        return a / b; //regresamosel valor de la division de a entre b
    }
    //metodo sobrecargado division que recibe 2 doubles
    public double division(double a, double b) {
        return a / b;//regresamosel valor de la division de a entre b
    }
    //metodo modulo que tiene como parametros dos numeros enteros
    public int modulo(int a, int b) {
        return a % b;//regresamos el valor del modulo de a entre b
    }
}