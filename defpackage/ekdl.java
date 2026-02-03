package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekdl {
    static int a(int i, int i2) {
        return i & (~i2);
    }

    static int b(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    static int c(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    static int d(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int iB = ekfh.b(obj);
        int i4 = iB & i;
        int iE = e(obj3, i4);
        if (iE == 0) {
            return -1;
        }
        int iA = a(iB, i);
        int i5 = -1;
        while (true) {
            i2 = iE - 1;
            int i6 = iArr[i2];
            i3 = i6 & i;
            if (a(i6, i) == iA && ejwh.a(obj, objArr[i2]) && (objArr2 == null || ejwh.a(obj2, objArr2[i2]))) {
                break;
            }
            if (i3 == 0) {
                return -1;
            }
            i5 = i2;
            iE = i3;
        }
        if (i5 == -1) {
            i(obj3, i4, i3);
            return i2;
        }
        iArr[i5] = b(iArr[i5], i3, i);
        return i2;
    }

    static int e(Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    static int f(int i) {
        return Math.max(4, ekfh.c(i + 1));
    }

    static Object g(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(a.g(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    static void h(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    static void i(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
