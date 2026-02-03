package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eonc extends eond {
    public static int a(long j) {
        int i = (int) j;
        ejwl.e(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        ejwl.g(length >= 4, "array too small: %s < %s", length, 4);
        return c(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int c(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int d(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int e(int... iArr) {
        ejwl.a(true);
        int i = iArr[0];
        for (int i2 = 1; i2 < 3; i2++) {
            int i3 = iArr[i2];
            if (i3 < i) {
                i = i3;
            }
        }
        return i;
    }

    public static int f(long j) {
        if (j > 2147483647L) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer g(java.lang.String r14) {
        /*
            r14.getClass()
            boolean r0 = r14.isEmpty()
            r1 = 0
            if (r0 == 0) goto Ld
        La:
            r14 = r1
            goto L6f
        Ld:
            r0 = 0
            char r2 = r14.charAt(r0)
            r3 = 45
            if (r2 != r3) goto L17
            r0 = 1
        L17:
            int r4 = r14.length()
            if (r0 != r4) goto L1e
            goto La
        L1e:
            int r4 = r0 + 1
            char r0 = r14.charAt(r0)
            int r0 = defpackage.eonf.a(r0)
            if (r0 < 0) goto La
            r5 = 10
            if (r0 < r5) goto L2f
            goto La
        L2f:
            int r0 = -r0
            long r6 = (long) r0
        L31:
            int r0 = r14.length()
            r8 = -9223372036854775808
            if (r4 >= r0) goto L5e
            int r0 = r4 + 1
            char r4 = r14.charAt(r4)
            int r4 = defpackage.eonf.a(r4)
            if (r4 < 0) goto La
            if (r4 >= r5) goto La
            r10 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r10 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r10 >= 0) goto L51
            goto La
        L51:
            long r10 = (long) r4
            long r8 = r8 + r10
            r12 = 10
            long r6 = r6 * r12
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L5b
            goto La
        L5b:
            long r6 = r6 - r10
            r4 = r0
            goto L31
        L5e:
            if (r2 != r3) goto L65
            java.lang.Long r14 = java.lang.Long.valueOf(r6)
            goto L6f
        L65:
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 != 0) goto L6a
            goto La
        L6a:
            long r2 = -r6
            java.lang.Long r14 = java.lang.Long.valueOf(r2)
        L6f:
            if (r14 == 0) goto L88
            long r2 = r14.longValue()
            int r0 = r14.intValue()
            long r4 = (long) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L7f
            goto L88
        L7f:
            int r14 = r14.intValue()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            return r14
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eonc.g(java.lang.String):java.lang.Integer");
    }

    public static List h(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new eonb(iArr, 0, length);
    }

    public static byte[] i(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static int[] j(Collection collection) {
        if (collection instanceof eonb) {
            eonb eonbVar = (eonb) collection;
            return Arrays.copyOfRange(eonbVar.a, eonbVar.b, eonbVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static int k(int i, int i2) {
        ejwl.g(true, "min (%s) must be less than or equal to max (%s)", i2, 1073741823);
        return Math.min(Math.max(i, i2), 1073741823);
    }
}
