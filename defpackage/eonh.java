package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eonh {
    public static int a(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static long b(byte[] bArr) {
        int length = bArr.length;
        ejwl.g(length >= 8, "array too small: %s < %s", length, 8);
        return c(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    public static long c(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        return (b8 & 255) | ((b7 & 255) << 8) | ((b & 255) << 56) | ((b2 & 255) << 48) | ((b3 & 255) << 40) | ((b4 & 255) << 32) | ((b5 & 255) << 24) | ((b6 & 255) << 16);
    }

    public static byte[] d(long j) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (255 & j);
            j >>= 8;
        }
        return bArr;
    }

    public static long[] e(Collection collection) {
        if (collection instanceof eong) {
            eong eongVar = (eong) collection;
            return Arrays.copyOfRange(eongVar.a, eongVar.b, eongVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            jArr[i] = ((Number) obj).longValue();
        }
        return jArr;
    }
}
