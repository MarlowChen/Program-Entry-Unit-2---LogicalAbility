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
public class HouseBuilding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("---------------------------Bulid HouseOfStraw--------------------------- \n");
        HouseOfStraw houseOfStraw = new HouseOfStraw();
        System.out.print("---------------------------Bulid HouseOfSticks--------------------------- \n");
        HouseOfSticks houseOfSticks = new HouseOfSticks(6,4);
        System.out.print("---------------------------Bulid HouseOfBricks--------------------------- \n");
        HouseOfBricks houseOfBricks = new HouseOfBricks();
    }

}
