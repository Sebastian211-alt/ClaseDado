/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseDado;

/**
 *
 * @author SebasTati
 */
public class Dado {

    public static void main(String[] args) {

        int valor, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0;

        for (int i = 1; i < 100; i++) {
            valor = (int) (Math.random() * 6) + 1;

            switch (valor) {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                    break;
                case 5:
                    c5++;
                    break;
                case 6:
                    c6++;
                    break;

            }
        }
        System.out.println("1 : " + c1);
        System.out.println("2 : " + c2);
        System.out.println("3 : " + c3);
        System.out.println("4 : " + c4);
        System.out.println("5 : " + c5);
        System.out.println("6 : " + c6);
    }

}
