package org.tiny;

public class No2038RemoveColor {
    public static boolean winnerOfGame(String colors) {
        int BobCount = 0;
        for (String s : colors.split("A")) {
            if (s.length() > 2) {
                BobCount += s.length() - 2;
            }
        }

        int AliceCount = 0;
        for (String s : colors.split("B")) {
            if (s.length() > 2) {
                AliceCount += s.length() - 2;
            }
        }

        return AliceCount > BobCount;
    }

    public static boolean winnerOfGame2(String colors) {
        int AliceCount = 0;
        int BobCount = 0;

        int aCount = 0;
        int bCount = 0;
        for (int i = 0; i < colors.length(); i++) {
            if (colors.charAt(i) == 'A') {
                bCount = 0;
                aCount ++;
                if (aCount > 2) {
                    AliceCount ++;
                }
            }

            if (colors.charAt(i) == 'B') {
                aCount = 0;
                bCount ++;
                if (bCount > 2) {
                    BobCount ++;
                }
            }
        }

        return AliceCount > BobCount;
    }
}
