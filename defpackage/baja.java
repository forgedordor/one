package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baja {
    private final byte[] a;

    public baja(byte[] bArr) {
        this.a = bArr;
    }

    public static baja a() {
        byte[] bArr = new byte[32];
        ejwx.a.nextBytes(bArr);
        return new baja(bArr);
    }

    public static boolean c(byte[] bArr) {
        return bArr != null && bArr.length == 32;
    }

    public final boolean b() {
        return c(this.a);
    }

    public final byte[] d() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
