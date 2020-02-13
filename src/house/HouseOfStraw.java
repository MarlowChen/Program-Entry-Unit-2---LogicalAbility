/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house;

/**
 *
 * @author Marlow_chen
 */
public final class HouseOfStraw {

    public HouseOfStraw() {
        this.buildCottages();
    }

    public void buildCottages() {
        for (int i = 0; i < 11; i++) {
            switch (i) {
                case 4:
                    System.out.print("╲");
                    break;
                case 5:
                    System.out.print("‖");
                    break;
                case 6:
                    System.out.print("╱");
                    break;
                default:
                    System.out.print("　");
                    break;
            }
        }
        System.out.println("");
        for (int i = 0; i < 11; i++) {
            if (i == 4 || i == 5 || i == 6) {
                System.out.print("‖");
            } else {
                System.out.print("　");
            }
        }
        System.out.println("");
        for (int i = 0; i < 11; i++) {
            if (i == 0 || i < 3 || i > 7) {
                System.out.print("　");
            } else {
                System.out.print("‖");
            }
        }
        System.out.println("");
        for (int i = 0; i < 11; i++) {
            if (i < 2 || i > 8) {
                System.out.print("　");
            } else if (i > 4 && i < 6) {
                System.out.print("█");
            } else {
                System.out.print("‖");
            }
        }
        System.out.println("");
        for (int i = 0; i < 11; i++) {
            if (i < 1 || i > 9) {
                System.out.print("　");
            } else if (i > 3 && i < 7) {
                System.out.print("█");
            } else {
                System.out.print("‖");
            }
        }
        System.out.println("");
        for (int i = 0; i < 11; i++) {
            if (i > 2 && i < 8) {
                System.out.print("█");
            } else {
                System.out.print("‖");
            }
        }
        System.out.println("");
    }

}
