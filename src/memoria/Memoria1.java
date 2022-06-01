/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package memoria;

import java.util.Scanner;

/**
 *
 * @author darkangel
 */
public class Memoria1 {

    private String salida;
    private float tamanio;

    public Memoria1(float leng) {
        String tempOOM = "";
        this.tamanio = leng;
        for (int i = 0; i < leng; i++) {
            

            this.salida += "a";

            break;

        }
        this.salida = tempOOM.toString();

    }

    public String getOom() {
        return salida;
    }

    public float getLength() {
        return tamanio;
    }

    public static void main(String[] args) {
        float OVERFLOW = 200000000;
        Memoria1 javaHeapTest = new Memoria1(OVERFLOW);
        System.out.println(javaHeapTest.getOom().length());
        Scanner sc = new Scanner(System.in);
        System.out.println("precione cualquier numero");
        sc.nextInt();
    }
}
