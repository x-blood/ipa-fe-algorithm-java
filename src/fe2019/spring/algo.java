package fe2019.spring;

public class algo {

    private int AdjustLength(int length) {
        return length - 1;
    }

    public int BitapMatch(char[] Text, char[] Pat) {
        int Goal, Status;
        int[] Mask = new int[27];
        int i, TextLen, PatLen;
        TextLen = AdjustLength(Text.length);
        System.out.println("[DEBUG]BitapMatch TextLen：" + TextLen);
        PatLen = GenerateBitMask(Pat, Mask);
        System.out.println("[DEBUG]BitapMatch PatLen：" + PatLen);
        Status = 0;
        Goal = 1 << (PatLen - 1);
        for (i = 1; i <= TextLen; i++) {
            Status = (Status << 1) | 1;
            Status = Status & Mask[Index(Text[i])];
            if ((Status & Goal) != 0) {
                return (i - PatLen + 1);
            }
        }
        return -1;
    }

    public int GenerateBitMask(char[] Pat, int[] Mask) {
        int i, PatLen;
        PatLen = AdjustLength(Pat.length);
        for (i = 1; i <= 26; i++) {
            Mask[i] = 0;
        }
        for (i = 1; i <= PatLen; i++) {
            Mask[Index(Pat[i])] =
                    (1 << (i - 1)) | Mask[Index(Pat[i])];
        }
        System.out.println("[DEBUG]A MaskValue：" + Integer.toBinaryString(Mask[1]));
        System.out.println("[DEBUG]B MaskValue：" + Integer.toBinaryString(Mask[2]));
        System.out.println("[DEBUG]C MaskValue：" + Integer.toBinaryString(Mask[3]));
        return PatLen;
    }

    private int Index(char ULW) {
        switch (ULW) {
            case 'A':
                return 1;
            case 'B':
                return 2;
            case 'C':
                return 3;
            case 'D':
                return 4;
            case 'E':
                return 5;
            case 'F':
                return 6;
            case 'G':
                return 7;
            case 'H':
                return 8;
            case 'I':
                return 9;
            case 'J':
                return 10;
            case 'K':
                return 11;
            case 'L':
                return 12;
            case 'M':
                return 13;
            case 'N':
                return 14;
            case 'O':
                return 15;
            case 'P':
                return 16;
            case 'Q':
                return 17;
            case 'R':
                return 18;
            case 'S':
                return 19;
            case 'T':
                return 20;
            case 'U':
                return 21;
            case 'V':
                return 22;
            case 'W':
                return 23;
            case 'X':
                return 24;
            case 'Y':
                return 25;
            case 'Z':
                return 26;
        }
        return 0;
    }

}
