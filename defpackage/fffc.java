package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fffc {
    public static final fffd a(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            bArr[i] = (byte) ((ffgg.a(str.charAt(i2)) << 4) + ffgg.a(str.charAt(i2 + 1)));
        }
        return new fffd(bArr);
    }

    public static final fffd b(String str) {
        str.getClass();
        fffd fffdVar = new fffd(ffge.b(str));
        fffdVar.d = str;
        return fffdVar;
    }
}
