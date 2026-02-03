package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eldz {
    public static final eldz e = new eldw("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final eldz f = new eldw("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    public static final eldz g = new eldy("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    public static final eldz h;

    static {
        new eldy("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        h = new eldv(new eldu("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract void c(Appendable appendable, byte[] bArr, int i);

    public abstract int d(int i);

    public abstract int e(int i);

    public abstract eldz f();

    public abstract eldz g();

    public CharSequence h(CharSequence charSequence) {
        throw null;
    }

    public final String j(byte[] bArr) {
        int length = bArr.length;
        ejwl.k(0, length, length);
        StringBuilder sb = new StringBuilder(e(length));
        try {
            c(sb, bArr, length);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] k(CharSequence charSequence) {
        try {
            CharSequence charSequenceH = h(charSequence);
            int iD = d(charSequenceH.length());
            byte[] bArr = new byte[iD];
            int iA = a(bArr, charSequenceH);
            if (iA == iD) {
                return bArr;
            }
            byte[] bArr2 = new byte[iA];
            System.arraycopy(bArr, 0, bArr2, 0, iA);
            return bArr2;
        } catch (eldx e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
