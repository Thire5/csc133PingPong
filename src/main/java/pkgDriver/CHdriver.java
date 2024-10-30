package pkgDriver;

import pkgPingPongArray.CHPingPongArray;

public class CHdriver {
    public static final int rows = 16;
    public static final int cols = 16;
    public static final int min = 0;
    public static final int max = 9;
    public static void main(String[] args) {
        CHPingPongArray myPingPong = new CHPingPongArray();
        myPingPong.createArray(rows, cols, min, max);
        myPingPong.printLive();
        myPingPong.reset();
        myPingPong.printLive();
        myPingPong.createNearestArray();
        myPingPong.swap();
        myPingPong.printLive();
        myPingPong.swap();
        myPingPong.createNextNearestArray();
        myPingPong.swap();
        myPingPong.printLive();
    }
}
