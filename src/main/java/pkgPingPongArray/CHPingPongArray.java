package pkgPingPongArray;

import java.util.Random;

public class CHPingPongArray {
    private final int defaultRandMin = 0;
    private final int defaultRandMax = 1;
    private int[][] live;
    private int[][] next;
    Random rand = new Random();
    public void createArray(int rows, int cols) {
        live = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                live[row][col] = rand.nextInt(defaultRandMin, defaultRandMax);
            }
        }
    }
    public void createArray(int rows, int cols, int value) {
        live = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                live[row][col] = value;
            }
        }
    }
    public void createArray(int rows, int cols, int min, int max) {
        live = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                live[row][col] = rand.nextInt(min, max);
            }
        }
    }
    public void reset() {
        for (int row = 0; row < live[0].length; row++) {
            for (int col = 0; col < live[0].length; col++) {
                live[row][col] = rand.nextInt(defaultRandMin, defaultRandMax);
            }
        }
    }
    public void reset(int min, int max) {
        for (int row = 0; row < live[0].length; row++) {
            for (int col = 0; col < live[0].length; col++) {
                live[row][col] = rand.nextInt(min, max);
            }
        }
    }
    public void printLive() {
        for (int row = 0; row < live[0].length; row++) {
            for (int col = 0; col < live[0].length; col++) {
                System.out.print(live[row][col] + " ");
            }
        }
    }
    public void setCellLive(int row, int col, int value) {
        live[row][col] = value;
    }
    public void setCellNext(int row, int col, int value) {
        next[row][col] = value;
    }
    public int getCellLive(int row, int col) {
        return live[row][col];
    }
}
