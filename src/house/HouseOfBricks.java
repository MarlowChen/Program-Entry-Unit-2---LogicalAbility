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
public class HouseOfBricks {

    public HouseOfBricks() {
        int layout = 4;
        for (int i = 0; i < layout - 1; i++) {
            this.bulidFloor(12, 6 + (i * 2), "█", new String[]{"▂"}, new String[]{"█", "█"}, new String[]{"▂"});
            System.out.println("");
        }
        for (int i = 0; i < layout - 1; i++) {
            this.bulidFloor(12, 8, "█", new String[]{"█"}, new String[]{"※", "※"}, new String[]{"█"});
            System.out.println("");
        }
    }

    private void bulidFloor(int defaultBuild, int fillCount, String defaultBrickStyle, String[] prefixFill, String[] middleFill, String[] suffixFill) {
        boolean isCanBuild = this.checkIsCanBuild(defaultBuild, fillCount, prefixFill, middleFill, suffixFill);
        if (!isCanBuild) {
            return;
        }
        //if prefixFill has blank
        int prefixBlankCount = getBlankFill(prefixFill);
        //if middleFill has blank
        int middleBlankCount = getBlankFill(middleFill);
        //if suffixFill has blank
        int suffixBlankCount = getBlankFill(suffixFill);
        int totalBlank = prefixBlankCount + middleBlankCount + suffixBlankCount;
        int blankBrick = this.getBlankBrickCount(defaultBuild, fillCount, totalBlank);
        int fixedBrick = this.getFixedBrickCount(fillCount, middleFill);
        this.createBlankBricks(blankBrick);
        this.createLimitBricks(prefixFill);
        this.createFixedBricks(fixedBrick, defaultBrickStyle);
        this.createLimitBricks(middleFill);
        this.createFixedBricks(fixedBrick, defaultBrickStyle);
        this.createLimitBricks(suffixFill);
        this.createBlankBricks(blankBrick);
    }

    /**
     *
     *
     * @param fill
     * @return
     */
    private int getBlankFill(String[] fill) {
        if (fill == null || fill.length == 0) {
            return 0;
        }
        int count = 0;
        for (String each : fill) {
            if (each == null || each.equals("")) {
                count++;
            }
        }
        return count;
    }

    private boolean checkIsCanBuild(int defaultBuild, int fillCount, String[] prefixFill, String[] middleFill, String[] suffixFill) {
        //limit even

        int prefixLength = prefixFill != null ? prefixFill.length : 0;
        int middleLength = middleFill != null ? middleFill.length : 0;
        int suffixLength = suffixFill != null ? suffixFill.length : 0;
        int totalCustomBrick = prefixLength + middleLength + suffixLength;
        if (totalCustomBrick > fillCount) {
            return false;
        }
        //default fill must more than fillCount
        if (fillCount > defaultBuild) {
            return false;
        }
        return true;
    }

    /**
     * create blank fill
     *
     * @param blankCount
     */
    private void createBlankBricks(int blankCount) {
        if (blankCount > 0) {
            for (int i = 0; i < blankCount; i++) {
                System.out.print("　");
            }
        }
    }

    /**
     * create liimit bricks
     *
     * @param liimitBricks
     */
    private void createLimitBricks(String[] liimitBricks) {
        if (liimitBricks != null && liimitBricks.length > 0) {
            for (String brick : liimitBricks) {
                System.out.print(brick);
            }
        } else {
            System.out.print("　");
        }
    }

    private int getBlankBrickCount(int defaultBuild, int fillCount, int blankFill) {
        return ((defaultBuild - fillCount) + blankFill) / 2;
    }

    private int getFixedBrickCount(int fillCount, String[] middleFill) {
        if (fillCount < middleFill.length) {
            return 0;
        }
        if (middleFill != null || middleFill.length > 0) {
            fillCount = fillCount - middleFill.length;
        }
        if (fillCount == 0) {
            return 0;
        }
        if (fillCount % 2 != 0) {
            return (fillCount - 1) / 2;
        }
        return fillCount / 2;
    }

    /**
     * create fill bricks
     *
     * @param fillBricks
     */
    private void createFixedBricks(Integer fixedBricks, String brickStyle) {
        if (fixedBricks != null && fixedBricks > 0) {
            for (int i = 0; i < fixedBricks - 1; i++) {
                System.out.print(brickStyle);
            }
        }
    }

}
