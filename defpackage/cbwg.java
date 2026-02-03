package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbwg {
    public static final byte[] a(byte[] bArr) {
        int length = bArr.length;
        if (length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 0, bArr2, 32 - length, length);
            return bArr2;
        }
        if (length <= 32) {
            return bArr;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length - 32, length);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }
}
