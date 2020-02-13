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
public final class HouseOfSticks {

    public HouseOfSticks(int layers, int roofLayers) {
        this.buildHouseOfSticks(layers, roofLayers);
    }

    public void buildHouseOfSticks(int layers, int roofLayers) {
        int colums = layers * 2;
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < colums; j++) {
                if (i < roofLayers) {
                    if (j < (layers - 1) - i || j > layers + i) {
                        System.out.print("　");
                    } else if (j == (layers - 1) - i) {
                        System.out.print("◢");
                    } else if (j == layers + i) {
                        System.out.print("◣");
                    } else {
                        System.out.print("█");
                    }
                } else {
                    int blankPrefixEnd = layers - roofLayers + 1;
                    int blankSuffixEnd = (roofLayers - 1) + (layers - 1);
                    int doorLeft = blankPrefixEnd + roofLayers - 2;
                    int doorRight = doorLeft + 1;
                    if (j < blankPrefixEnd || j > blankSuffixEnd) {
                        System.out.print("　");
                    } else if (j == doorLeft || j == doorRight) {
                        System.out.print("☒");
                    } else {
                        System.out.print("█");
                    }
                }
            }
            System.out.println("");
        }

    }
}
