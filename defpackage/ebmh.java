package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebmh {
    private static final char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B'};
    private static int b = 0;

    public static String a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iC = c();
        char[] cArr = new char[10];
        int i = 0;
        while (i < 7) {
            int i2 = ((int) jCurrentTimeMillis) & 63;
            jCurrentTimeMillis >>= 6;
            cArr[i] = a[i2];
            i++;
        }
        while (i < 10) {
            int i3 = iC & 63;
            iC >>= 6;
            cArr[i] = a[i3];
            i++;
        }
        return new String(cArr);
    }

    public static synchronized String b() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    private static synchronized int c() {
        int i;
        i = b;
        b = i + 1;
        return i;
    }
}
